import java.util.List;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setName("Сергей");
        doctor.setSurname("Сергеев");
        doctor.setPatronymic("Сергеевич");
        doctor.setAge(50);
        doctor.setPosition("Врач");
        doctor.setSpecialization("Кардиолог");
        System.out.println(CRUDUtils.saveStudent(doctor));

        List<Doctor> students = CRUDUtils.getStudentData();
        System.out.println(students);

        List<Doctor> updatesStudents = CRUDUtils.updateDoctor(1, "Главврач");
        System.out.println(updatesStudents);

        List<Doctor> withDeleteStudents = CRUDUtils.deleteDoctor(1);
        System.out.println(withDeleteStudents);
    }
}
