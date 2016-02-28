package parsers;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParser {
	
	public static void main(String[] args) throws SAXException, IOException {
		
		File xmlFile = new File("C:/Users/Kennedy/Dropbox/Java/exercises/staff.xml");
		DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
		try {
			
			DocumentBuilder dbBuilder = dbfactory.newDocumentBuilder();
		Document doc = dbBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
		
//		System.out.println("The root element is : " + doc.getDocumentElement().getNodeName());
		System.out.println("Coverting to Json: ");
		NodeList nList = doc.getElementsByTagName("staff");
		
		System.out.println("**********************************************************");
//		System.out.println(doc);
		System.out.println(" { \" " + doc.getDocumentElement().getNodeName()+ " \" : { ");
		int temp = 0;
		Node nNode = nList.item(temp);
		System.out.println("              " + " \" " + nNode.getNodeName() + " \":   [");
		
		for (int temp2 = 0; temp2 < nList.getLength(); temp2++) {
			

//			System.out.println("\nCurrent node is : " + nNode.getNodeName());
			
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				
				Element eElement = (Element)nNode;
				
//				System.out.println("Staff id : " +eElement.getAttribute("id"));
//				System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
//				System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
//				System.out.println("Nickname : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
//				System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
				System.out.println( "           " + "   { " );
				System.out.println( "             " + " \" id \" " + " : \" " + eElement.getAttribute("id") + " \" , ");
				System.out.println( "             " + " \" firstname \" " + " : \" " + eElement.getElementsByTagName("firstname").item(0).getTextContent() + " \" ,");
				System.out.println( "             " + " \" lastname \" " + " : \" " + eElement.getElementsByTagName("lastname").item(0).getTextContent() + " \" ,");
				System.out.println( "             " + " \" nickname \" " + " : \" " + eElement.getElementsByTagName("nickname").item(0).getTextContent() + " \" , ");
				System.out.println( "             " + " \" salary \" " + " : \" " + eElement.getElementsByTagName("salary").item(0).getTextContent() + " \" ");
				System.out.println("          " + " } , ");
			}
		
		}

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("            " + " ] ");
		System.out.println("         " + " } ");
		System.out.println("     " + " } ");
		
	}

	
}
