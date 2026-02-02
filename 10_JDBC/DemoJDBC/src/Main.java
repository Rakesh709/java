import java.sql.*;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Connection Start");
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));

        String url = "jdbc:postgresql://localhost:5433/mydb";
        String uname = "admin";
        String pass = "admin123";
        String sql = "SELECT \"Fname\", \"Lname\" FROM school;";

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection DONE");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            String fname = rs.getString("Fname");
            String lname = rs.getString("Lname");
            System.out.println(fname + " " + lname);
        }

        con.close();
        System.out.println("Connection Close");
    }
}
