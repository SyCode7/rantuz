package de.parsers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class XmlParser {
	
	public static void main(String[] args) throws SAXException, IOException {
		
		File xmlFile = new File ("C:\\Users\\Kennedy.Torkura\\Dropbox\\Java\\exercises\\staff.xml");
		XmlParser test = new XmlParser();

		
		int n = 1;
		if (n == 1){
		String in = test.parseXml(xmlFile);
		System.out.println(in);
		
		}
//		BufferedWriter writer = new BufferedWriter(in);
		
//		String jsonTest = String.copyValueOf(test.parseXml(xmlFile));
//		FileUtils.writeStringToFile(new File("test.txt"), jsonTest);
		
	}	
		
	public String parseXml (File file) throws SAXException, IOException {
		
		

	try {
				
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();		
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		doc.getDocumentElement().normalize();
		
		System.out.println( "********** Plain text output ****************");
		System.out.println("Root element : " + doc.getDocumentElement().getNodeName()) ;
		
		NodeList nList = doc.getElementsByTagName("staff");
		System.out.println("---------------------------------------------");
		
		for (int temp = 0; temp < nList.getLength(); temp++) {
			
			Node nNode = nList.item(temp);
			
			System.out.println("\nCurrent Element : " + nNode.getNodeName());
			
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				
				
				Element eElement = (Element) nNode;
				System.out.println("Staff id : " + eElement.getAttribute("id"));
				System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("Nickname : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
				System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
			}
		}
		
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
	return parseXml(file);
		
	}


}
