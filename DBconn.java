import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBconn {

    Connection connection;
    Statement statement;
    
    public DBconn(){
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/BankATM","root","0000");
            statement=connection.createStatement();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}