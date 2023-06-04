package chapter6;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ReadXml {
    public static Object getBean() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder;
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document = documentBuilder.parse(new File("chapter6/config.xml"));
            NodeList brandName = document.getElementsByTagName("brandName");
            Node firstChild = brandName.item(0).getFirstChild();
            String trim = firstChild.getNodeValue().trim();
            Class<?> aClass = Class.forName(trim);
            Object o = aClass.newInstance();
            return o;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}
