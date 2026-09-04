import java.sql.*;

public class kk{
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

            // Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO stu(rollno, name, marks) VALUES (?, ?, ?)");


            // Set values
            ps.setInt(1, 5);
            ps.setString(2, "a1");
            ps.setInt(3, 9);

            // Execute query only once
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Row inserted successfully");
            }

            // Close connection
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}