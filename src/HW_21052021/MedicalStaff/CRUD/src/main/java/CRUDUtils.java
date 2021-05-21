import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static final String GET_ALL_DOCTORS = "SELECT * FROM doctors";
    private static final String INSERT_DOCTORS = "INSERT INTO doctors(name,surname,patronymic,age,position,specialization) VALUES (?,?,?,?,?,?);";
    private static final String UPDATE_DOCTOR = "UPDATE doctors SET position=? WHERE id=?";
    private static final String DELETE_DOCTOR = "DELETE FROM doctors WHERE id=?";
    private static final String GET_ALL_DOCTORS_QUERY = "SELECT * FROM doctors";

    public static List<Doctor> getStudentData() {
        List<Doctor> doctors = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_DOCTORS)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String patronymic = rs.getString("patronymic");
                int age = rs.getInt("age");
                String position = rs.getString("position");
                String specialization = rs.getString("specialization");
                doctors.add(new Doctor(id, name, surname, patronymic, age, position, specialization));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return doctors;
    }

    public static List<Doctor> saveStudent(Doctor doctor) {
        List<Doctor> updateDoctors = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DOCTORS)) {
            preparedStatement.setString(1, doctor.getName());
            preparedStatement.setString(2, doctor.getSurname());
            preparedStatement.setString(3, doctor.getPatronymic());
            preparedStatement.setInt(4, doctor.getAge());
            preparedStatement.setString(5, doctor.getPosition());
            preparedStatement.setString(6, doctor.getSpecialization());

            preparedStatement.executeUpdate();

            PreparedStatement allDoctorsStatement = connection.prepareStatement(GET_ALL_DOCTORS_QUERY);
            ResultSet rs = allDoctorsStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String patronymic = rs.getString("patronymic");
                int age = rs.getInt("age");
                String position = rs.getString("position");
                String specialization = rs.getString("specialization");
                updateDoctors.add(new Doctor(id, name, surname, patronymic, age, position, specialization));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updateDoctors;
    }

    public static List<Doctor> updateDoctor(int idDoctor, String position) {
        List<Doctor> updateDoctors = new ArrayList<>();
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_DOCTOR)) {
            preparedStatement.setString(1, position);
            preparedStatement.setInt(2, idDoctor);
            preparedStatement.executeUpdate();

            PreparedStatement allStudentsStatement = connection.prepareStatement(GET_ALL_DOCTORS_QUERY);
            ResultSet rs = allStudentsStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String patronymic = rs.getString("patronymic");
                int age = rs.getInt("age");
                position = rs.getString("position");
                String specialization = rs.getString("specialization");
                updateDoctors.add(new Doctor(id, name, surname, patronymic, age, position, specialization));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updateDoctors;
    }

    public static List<Doctor> deleteDoctor(int doctorID) {
        List<Doctor> updateDoctors = new ArrayList<>();
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_DOCTOR)) {
            preparedStatement.setInt(1, doctorID);
            preparedStatement.execute();

            PreparedStatement allStudentsStatement = connection.prepareStatement(GET_ALL_DOCTORS_QUERY);
            ResultSet rs = allStudentsStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String patronymic = rs.getString("patronymic");
                int age = rs.getInt("age");
                String position = rs.getString("position");
                String specialization = rs.getString("specialization");
                updateDoctors.add(new Doctor(id, name, surname, patronymic, age, position, specialization));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updateDoctors;
    }
}
