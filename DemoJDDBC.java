//1. import package
import java.sql.*;

public class DemoJDDBC {
    public static void main (String args[]) throws Exception{

        /*
        1.import package
        2.Load and Register
        3.create connection
        4.create statement
        5.execute statement
        6.process results
        7.close

         */

//        3.create connection

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "1234";
//        try{
//            Connection conn = DriverManager.getConnection(url,uname,pass);
//            System.out.println("Connected to database successfully");
//        }catch(SQLException e){
//            e.getStackTrace();
//        }

        Connection conn = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connected to database successfully");


    }
}
