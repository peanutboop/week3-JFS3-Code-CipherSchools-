import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

    public class Test1DBEnabledApp {

        public static void main(String[] args) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionURL =
                    "jdbc:mysl://localhost/booksdb";
            Connection conn = DriverManager.getConnection(connectionURL,"root"
            ,"<126@Simrata>");


            Statement stat = conn.createStatement();

                 String selectQuery ="select * from books";
                ResultSet result = stat.executeQuery(selectQuery);

                while(result.next()) {
                    System.out.println(result.getString(1) +
                            " " +result.getString(2));
                }

            conn.close();



            }
            catch(Exception e ) {
                e.printStackTrace();

            }

        }
    }

