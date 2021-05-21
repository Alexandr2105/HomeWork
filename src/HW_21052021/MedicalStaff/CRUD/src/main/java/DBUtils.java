import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
    private static String dbUrl = "jdbc:h2:mem:test;INIT=RUNSCRIPT FROM 'classpath:init.sql'";
    private static String bdUsername = "sa";
    private static String dbPassword = "";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(dbUrl, bdUsername, dbPassword);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection;
    }
}

