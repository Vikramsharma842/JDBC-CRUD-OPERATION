import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        // driver load
        // connection establise
        try {
            String url = "jdbc:mysql://localhost:3306";
            String userName = "root";
            String password = "Vikram@8210";
            Connection conn = DriverManager.getConnection(url,userName,password);
            System.out.println("Connected Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // statement create
        // execute -query
        //close connection
        
    }
    
}