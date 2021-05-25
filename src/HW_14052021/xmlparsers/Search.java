package HW_14052021.xmlparsers;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;

public class Search {
    public static void main(String[] args) throws XPathExpressionException, IOException, ParserConfigurationException, SAXException {
        search("Иванова", "Ивана", "Ивановна");
        search("Алексеев", "Алексей", "Алексеевич");
    }

    private static void search(String surname, String name, String patronymic) throws XPathExpressionException, IOException, SAXException, ParserConfigurationException {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("D:\\TeachMeSkills\\MyFirstJavaProject\\src\\HW_14052021\\XML\\Doctors.xml");
            XPathFactory pathFactory = XPathFactory.newInstance();
            XPath xpath = pathFactory.newXPath();
            XPathExpression expr = xpath.compile("staff/employee[surname='" + surname + "'][name='" + name + "'][patronymic='" + patronymic + "']/child::*");
            NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
            System.out.printf("Имя: %s\nФамилия: %s\nДолжность: %s\nОтделение: %s\nСтаж работы: %s %s\n", nodes.item(1).getTextContent(),
                    nodes.item(0).getTextContent(), nodes.item(3).getTextContent(),
                    nodes.item(4).getTextContent(), nodes.item(5).getTextContent(),(Integer.parseInt(nodes.item(5).getTextContent())>4)?"лет":"года");
        } catch (NullPointerException e) {
            System.out.println("Нет информации о таком сотруднике!");
        }
    }
}
