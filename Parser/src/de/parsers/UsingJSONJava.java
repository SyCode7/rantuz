package de.parsers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

import org.json.JSONObject;
import org.json.XML;

public class UsingJSONJava {

	static File xmlFile = new File ("C:\\Users\\Kennedy.Torkura\\Dropbox\\Java\\exercises\\staff.xml");
	public static int PRETTY_PRINT_INDENT_FACTOR = 4;
	public static String TEXT_XML_STRING = " <company> \n " +
	" <staff id= 1001>  \n " +
		 " <firstname>yong</firstname>  \n " +
		" <lastname>mook kim</lastname>  \n " +
		" <nickname>mkyong</nickname>  \n " +
		" <salary>100000</salary>  \n " +
	" </staff>  \n " +
	" <staff id= 2001>  \n " +
		" <firstname>low</firstname>  \n " +
		" <lastname>yin fong</lastname>  \n " +
		" <nickname>fong fong</nickname>  \n " +
		" <salary>200000</salary>  \n " +
	" </staff>  \n " +
 " </company>  " ;

	
	
	
	public static void main(String[] args) {
		
		try {
			
			FileReader is = new FileReader(xmlFile);
			BufferedReader reader = new BufferedReader(is);
			String line;
//			while ((line = reader.readLine()) != null) {
//				System.out.println(line);			
		
		JSONObject xmlJSONObj = XML.toJSONObject(TEXT_XML_STRING);
		String jsonPrettyPrint = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
		System.out.println(jsonPrettyPrint);
//			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		}
	

}
