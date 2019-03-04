package com.wbrandon.utillib.io.file.xml;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

@SuppressWarnings("deprecation")
public class XMLDocument
{
	
	private Document nodeDocument;
	
	@Deprecated
	public XMLDocument(Document nodeDocument)
	{
		this.nodeDocument = nodeDocument;
		nodeDocument.getDocumentElement().normalize();
	}
	
	public XMLElement getRootElement()
	{
		NodeList childNodes = nodeDocument.getChildNodes();
		if(childNodes.getLength() > 0)
		{
			return new XMLElement(childNodes.item(0));
		}
		return null;
	}
	
	public String getXMLVersion() { return nodeDocument.getXmlVersion(); }
	
	public String getXMLTextEncoding() { return nodeDocument.getXmlEncoding(); }
	
}
