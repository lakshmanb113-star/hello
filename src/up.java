import java.sql.*;

public class up{
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
                    "update stu set marks=? where rollno=?");


            // Set values
            ps.setInt(1,3);

            ps.setInt(2, 3);

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