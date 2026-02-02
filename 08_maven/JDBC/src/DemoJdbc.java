
import java.sql.*;

public class DemoJdbc {

    public static void main(String[] args) throws Exception {


        /*
        import package
        load and register
        create connection
        create statement
        execute statement
        process the results

          */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "1111";
        String sql = "select sname from student where sid = 1";

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,uname,pass);

        System.out.println("Connection DONE");

        Statement st = con.createStatement();
        ResultSet  rs =st.executeQuery(sql);

        rs.next();

        String name = rs.getString("sname");

        System.out.println(rs.next());
        con.close();
        System.out.println("Connection Close");



    }
}
