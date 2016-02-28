package de.parsers;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.json.simple.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class XmlParser {
	
	static File inputFile = new File ("xmltojson.json");
	public static void main(String[] args) throws SAXException, IOException {
		
		File xmlFile = new File ("staff.xml");
		XmlParser test = new XmlParser();
		test.parseXml(xmlFile);

//		testing MFA
//		int n = 1;
//		if (n == 1){
//		String in = test.parseXml(xmlFile);
//		System.out.println(in);
		
//		}
//		BufferedWriter writer = new BufferedWriter(in);
		
//		String jsonTest = String.copyValueOf(test.parseXml(xmlFile));
//		FileUtils.writeStringToFile(new File("test.txt"), jsonTest);
		
	}	
		
	public void parseXml (File file) throws SAXException, IOException {
				

	try {
				
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();		
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		doc.getDocumentElement().normalize();
		
		System.out.println( "********** JSON output ****************");
		System.out.println("Root element : " + doc.getDocumentElement().getNodeName()) ;
		
		NodeList nList = doc.getElementsByTagName("staff");
		
		System.out.println("---------------------------------------------");

		int temp = 0;
		Node nNode = nList.item(temp);
		System.out.println("Number of nodes --> " + nList.getLength());
		System.out.println("\" " +  doc.getDocumentElement().getNodeName() + "\" : {") ;
		System.out.println("\" " + nNode.getNodeName() + "\" : [");
		
		for (temp = 0; temp < nList.getLength(); temp++) {
			
			
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				
				
				Element eElement = (Element) nNode;
//				System.out.println("Staff id : " + eElement.getAttribute("id"));
//				System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
//				System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
//				System.out.println("Nickname : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
//				System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());

				JSONObject obj = new JSONObject();
//				obj.put(nNode.getNodeName(), null);
				
				obj.put("id", eElement.getAttribute("id"));
				obj.put("firstname", eElement.getElementsByTagName("firstname").item(0).getTextContent());
				obj.put("lastname", eElement.getElementsByTagName("lastname").item(0).getTextContent());
				obj.put("nickname", eElement.getElementsByTagName("nickname").item(0).getTextContent());
				obj.put("salary", eElement.getElementsByTagName("salary").item(0).getTextContent());

				
				
				System.out.println(obj);
				
				
//				Map<String,String> list = new HashMap<String,String>();
//				list.put("id  : ", eElement.getAttribute("id"));
			}
			
//			FileWriter out = new FileWriter(inputFile);
//			BufferedWriter writer = new BufferedWriter(out);
//			while (writer.write(str);) {
//				
//			}
		}
		
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
//	return parseXml(file);
		
	}


}
