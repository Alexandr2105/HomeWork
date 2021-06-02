package HW_14052021.xmlparsers;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class StAXParser {
    public List<Employee> parseXMLFile(String fileName) {
        List<Employee> studentsList = new ArrayList<>();
        Employee employee = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
            while (reader.hasNext()) {
                XMLEvent xmlEvent = reader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    switch (startElement.getName().getLocalPart()) {
                        case "employee" -> {
                            employee = new Employee("surname", "name", "patronymic", "position", "department", "workExperience");
                        }
                        case "surname" -> {
                            xmlEvent = reader.nextEvent();
                            employee.setSurname(xmlEvent.asCharacters().getData());
                        }
                        case "name" -> {
                            xmlEvent = reader.nextEvent();
                            employee.setName(xmlEvent.asCharacters().getData());
                        }
                        case "patronymic" -> {
                            xmlEvent = reader.nextEvent();
                            employee.setPatronymic(xmlEvent.asCharacters().getData());
                        }
                        case "position" -> {
                            xmlEvent = reader.nextEvent();
                            employee.setPosition(xmlEvent.asCharacters().getData());
                        }
                        case "department" -> {
                            xmlEvent = reader.nextEvent();
                            employee.setDepartment(xmlEvent.asCharacters().getData());
                        }
                        case "workExperience" -> {
                            xmlEvent = reader.nextEvent();
                            employee.setWorkExperience(xmlEvent.asCharacters().getData());
                        }
                    }
                }
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals("employee")) {
                        studentsList.add(employee);
                    }
                }
            }
        } catch (XMLStreamException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return studentsList;
    }
}
