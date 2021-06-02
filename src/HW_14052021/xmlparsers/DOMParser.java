package HW_14052021.xmlparsers;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DOMParser {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("D:\\TeachMeSkills\\MyFirstJavaProject\\src\\HW_14052021\\XML\\Doctors.xml"));
        NodeList employeeElements = document.getDocumentElement().getElementsByTagName("employee");
        for (int i = 0; i < employeeElements.getLength(); i++) {
            employees.add(getEmployee(employeeElements.item(i)));
        }
        for (Employee employee : employees) {
            System.out.printf("Информация: %s %s %s, должность %s, отделение-%s, стаж работы-%s\n", employee.getSurname(), employee.getName(), employee.getPatronymic(),
                    employee.getPosition(), employee.getDepartment(), employee.getWorkExperience());
        }
    }

    private static Employee getEmployee(Node node) {
        Employee employee = new Employee("surname", "name", "patronymic", "position", "department", "workExperience");
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            employee.setSurname(getTagValue("surname", element));
            employee.setName(getTagValue("name", element));
            employee.setPatronymic(getTagValue("patronymic", element));
            employee.setPosition(getTagValue("position", element));
            employee.setDepartment(getTagValue("department", element));
            employee.setWorkExperience(getTagValue("workExperience", element));
        }
        return employee;
    }

    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = nodeList.item(0);
        return node.getNodeValue();
    }
}
