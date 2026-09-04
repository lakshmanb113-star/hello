import java.sql.*;

public class crt {
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

            // Create Statement for DDL (Data Definition Language)
            Statement stmt = con.createStatement();

            // SQL Query to create table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS crt("
                    + "rollno INT PRIMARY KEY, "
                    + "name VARCHAR(50), "
                    + "marks INT"
                    + ")";

            // Execute table creation
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table 'ctr' created successfully or already exists.");

            // Close resources
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
