import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test0DBEnabledApp {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

//            String connectionURL =
//                    "jdbc:mysl://localhost/booksdb";
//            Connection conn = DriverManager.getConnection(connectionURL,"root"
//            ,"<126@Simrata>");

            int bid =102;
            String bookTitle = "Sql Essentials";
            String author = "Jerry Rig";
            int price =295;



            String insertQuery=
            String.format("delete into books where id= %d",101);

            System.out.println(insertQuery);

//            Statement stat = conn.createStatement();

            // String selectQuery ="select * from books";

//            stat.execute(insertQuery); //execute is used to execute query
//
//            stat.close();
//            conn.close();
        }
        catch(Exception e ) {
            e.printStackTrace();

        }

    }
}