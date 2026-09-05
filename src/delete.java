import java.sql.*;

public class delete {
    public static void main(String[] args) {

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lakshman",
                    "root",
                    "LAKSHMAN113"
            );

            System.out.println("Connection Successful!");

            // Create PreparedStatement for DELETE
            PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM stu WHERE rollno = ?"
            );

            // Set rollno to delete
            ps.setInt(1, 5);

            // Execute DELETE query
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Row deleted successfully");
            } else {
                System.out.println("No student found with rollno 5");
            }

            // Close resources
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}