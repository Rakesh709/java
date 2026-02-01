
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

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,uname,pass);

        System.out.println("Connection DONE");

    }
}
