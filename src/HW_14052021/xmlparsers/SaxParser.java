package HW_14052021.xmlparsers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SaxParser {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File("D:\\TeachMeSkills\\MyFirstJavaProject\\src\\HW_14052021\\XML\\Doctors.xml"), handler);

        for (Employee employee : employees) {
            System.out.printf("Информация: %s %s %s, должность %s, отделение-%s, стаж работы-%s\n", employee.getSurname(), employee.getName(), employee.getPatronymic(),
                    employee.getPosition(), employee.getDepartment(), employee.getWorkExperience());
        }
    }

    private static class XMLHandler extends DefaultHandler {
        private String surname, name, patronymic, position, department, workExperience, lastElements;

        @Override
        public void characters(char[] ch, int start, int length) {
            String information = new String(ch, start, length);

            information = information.replace("\n", "").trim();

            if (!information.isEmpty()) {
                if (lastElements.equals("surname"))
                    surname = information;
                if (lastElements.equals("name"))
                    name = information;
                if (lastElements.equals("patronymic"))
                    patronymic = information;
                if (lastElements.equals("position"))
                    position = information;
                if (lastElements.equals("department"))
                    department = information;
                if (lastElements.equals("workExperience"))
                    workExperience = information;
            }
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) {
            lastElements = qName;
        }

        @Override
        public void endElement(String uri, String localName, String qName) {
            if ((surname != null && !surname.isEmpty()) && (name != null && !name.isEmpty()) && (patronymic != null && !patronymic.isEmpty()) && (position != null && !position.isEmpty()) &&
                    (department != null && !department.isEmpty()) && (workExperience != null && !workExperience.isEmpty())) {
                employees.add(new Employee(surname, name, patronymic, position, department, workExperience));
                surname = null;
                name = null;
                patronymic = null;
                position = null;
                department = null;
                workExperience = null;
            }
        }
    }
}
