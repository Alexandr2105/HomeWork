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
        System.out.println(CRUDUtils.saveDoctor(doctor));

        List<Doctor> doctors = CRUDUtils.getDoctorData();
        System.out.println(doctors);

        List<Doctor> updatesDoctors = CRUDUtils.updateDoctor(1, "Главврач");
        System.out.println(updatesDoctors);

        List<Doctor> withDeleteDoctors = CRUDUtils.deleteDoctor(1);
        System.out.println(withDeleteDoctors);
    }
}
