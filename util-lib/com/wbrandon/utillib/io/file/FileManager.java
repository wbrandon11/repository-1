package com.wbrandon.utillib.io.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.wbrandon.utillib.io.file.xml.XMLDocument;

@SuppressWarnings("deprecation")
public class FileManager
{
	
	public static boolean fileExists(String pathString)
	{
		if(getFileContents(pathString) != null)
		{
			return true;
		}
		return false;
	}
	
	public static String getFileContents(String pathString)
	{
		Path path = Paths.get(pathString);
		try
		{
			byte[] contentBytes = Files.readAllBytes(path);
			return new String(contentBytes);
		}
		catch(IOException exception)
		{
			return null;
		}
	}
	
	public static ArrayList<String> getFileContentLines(String pathString)
	{
		Path path = Paths.get(pathString);
		try
		{
			List<String> contentLineList = Files.readAllLines(path);
			return (ArrayList<String>)contentLineList;
		}
		catch(IOException exception)
		{
			return null;
		}
	}
	
	public static XMLDocument getXMLFileDocument(String pathString)
	{
		File xmlFile = new File(pathString);
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		try
		{
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document nodeDocument = documentBuilder.parse(xmlFile);
			return new XMLDocument(nodeDocument);
		}
		catch(ParserConfigurationException | SAXException | IOException exception)
		{
			return null;
		}
	}
	
}
