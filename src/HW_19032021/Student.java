package HW_19032021;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private String dateOfBirthday;
    private int course;

    public Student(String name, String surname, String dateOfBirthday, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void printStudents(List<Student> students, int course) {   //По другому не придумал как сделать.
        for (Student a : students) {
            if (course == a.course) {
                System.out.printf("%s %s %s %d\n", a.getName(), a.getSurname(), a.getDateOfBirthday(), a.getCourse());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student();
        Student st = new Student("Петр", "Петров", "21/03/1988", 2);
        Student st1 = new Student("Иван", "Иванов", "12/02/1986", 4);
        Student st2 = new Student("Сидр", "Сидоров", "30/01/1985", 4);
        Student st3 = new Student("Алексей", "Алексеев", "24/06/1989", 1);
        students.add(st);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        student.printStudents(students, 4);
    }
}
