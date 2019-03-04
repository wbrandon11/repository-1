package com.wbrandon.utillib.io.file.xml;

import java.util.ArrayList;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLElement
{
	
	private Node node;
	
	@Deprecated
	public XMLElement(Node node)
	{
		this.node = node;
	}
	
	public ArrayList<XMLElement> getChildElements()
	{
		NodeList childNodes = node.getChildNodes();
		ArrayList<XMLElement> childElements = new ArrayList<XMLElement>();
		for(int childNodeIndex = 0; childNodeIndex < childNodes.getLength(); childNodeIndex++)
		{
			Node childNode = childNodes.item(childNodeIndex);
			if(childNode.getNodeName() != "#text")
			{
				childElements.add(new XMLElement(childNode));
			}
		}
		return childElements;
	}
	
	public ArrayList<XMLElement> getChildElementsByTagName(String tagName)
	{
		ArrayList<XMLElement> childElements = new ArrayList<XMLElement>();
		for(XMLElement childElement : getChildElements())
		{
			if(childElement.getTagName().equals(tagName))
			{
				childElements.add(childElement);
			}
		}
		return childElements;
	}
	
	public String getTagName() { return node.getNodeName(); }
	
}
