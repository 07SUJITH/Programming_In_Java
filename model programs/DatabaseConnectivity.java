
/*
 Write a Java program to display all records from a table using Java Database Connectivity (JDBC). 
 */
import java.sql.*;

public class DatabaseConnectivity {
    public static void main(String[] args) {
        try {
            // step1 :register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // step2 : Establish the connection
            String url = "jdbc:mysql://localhost:3306:test";
            String user = "root";
            String password = "MySQL@2023";
            Connection con = DriverManager.getConnection(url, user, password);
            // step 3: creation of statement
            Statement stmt = con.createStatement();
            // step 4: Execution of query
            String sql = "select * from Person ";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getInt(2));
            }
            // step 5: closing of database connection
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

}
