package HW_14052021.xmlparsers;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;

public class Search {   //Вообще не понял как надо было сделать, чтобы всё правильно выводилось
    public static void main(String[] args) throws XPathExpressionException, IOException, ParserConfigurationException, SAXException {
        search("Иванова", "Ивана", "Ивановна");
    }

    private static void search(String surname, String name, String patronymic) throws XPathExpressionException, IOException, SAXException, ParserConfigurationException {
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = documentBuilder.parse("D:\\TeachMeSkills\\MyFirstJavaProject\\src\\HW_14052021\\XML\\Doctors.xml");
        XPathFactory pathFactory = XPathFactory.newInstance();
        XPath xpath = pathFactory.newXPath();
        XPathExpression expr = xpath.compile("staff/employee[surname='" + surname + "'][name='" + name + "'][patronymic='" + patronymic + "']/child::*");
        NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < nodes.getLength(); i++) {
            Node n = nodes.item(i);
            System.out.println(n.getTextContent());
        }
    }
}
