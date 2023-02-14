import java.sql.*;

public class Test0DBConnectivity {

    public static void main(String[] args) throws Exception {
        String connectionURL="jdbc:mysql://localhost:3306/mart";
        Class.forName("com.mysql.jdbc.Driver");

        Connection conn = DriverManager.getConnection(connectionURL);

        System.out.println("Connected to Server !!!");

        conn.close();
    }

}
