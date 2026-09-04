import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ll {
    public static void main(String[] args) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/lakshman",
                    "root",
                    "LAKSHMAN113"
            );
            System.out.println("Connection Successful!");
            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery("select * from student");
            while(rs.next()){
                System.out.println(rs.getInt("rollno")+" "+rs.getString("name")+" "+rs.getInt("marks"));
            }
            // Close Connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}