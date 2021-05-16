package HW_14052021.xmlparsers;

import java.util.List;

public class MainStAXParser {
    public static void main(String[] args) {
        String fileName = "D:\\TeachMeSkills\\MyFirstJavaProject\\src\\HW_14052021\\XML\\Doctors.xml";
        List<Employee> employees = new StAXParser().parseXMLFile(fileName);
        for (Employee employee : employees) {
            System.out.printf("Информация: %s %s %s, должность %s, отделение-%s, стаж работы-%s\n", employee.getSurname(), employee.getName(), employee.getPatronymic(),
                    employee.getPosition(), employee.getDepartment(), employee.getWorkExperience());
        }
    }
}

