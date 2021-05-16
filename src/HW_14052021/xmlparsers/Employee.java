package HW_14052021.xmlparsers;

public class Employee {
    private String surname, name, patronymic, position, workExperience, department;

    public Employee(String surname, String name, String patronymic, String position, String department, String workExperience) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.department = department;
        this.workExperience = workExperience;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }
}
