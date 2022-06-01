import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        final String DB_URL = "jdbc:mysql://localhost:3306/mystore";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try {

            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connection Successfully");
        } catch (Exception e) {
            System.out.println("Database connection failed");
        }
    }
}
