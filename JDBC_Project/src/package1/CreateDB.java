package package1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class CreateDB {
    
    public void createDatabase(){
        // Load the driver
        // eastablish connection
        // create statement
        //execute query
        //close connection
        try {
            String url = "jdbc:mysql://localhost:3306";
            String name = "root";
            String password = "Vikram@8210";
            Connection conn = DriverManager.getConnection(url, name, password);
            // Create Statement
            Statement statement = conn.createStatement();
            System.out.println("Connected Successfully!!!");
            // Execute query
            String query = "create database kram";
            statement.execute(query);
            System.out.println("Database Successfully!!! Created!!!");

            // connection close
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
}

    public void createTable() {

        try {
            String url = "jdbc:mysql://localhost:3306/kram";
            String name = "root";
            String password = "Vikram@8210";
            Connection conn = DriverManager.getConnection(url, name, password);
            // Create Statement
            Statement statement = conn.createStatement();
            System.out.println("Connected Successfully!!!");
            // Execute query
            String query = "create table Student(sid int(3), name varchar(255),email varchar(255))";
            statement.execute(query);
            System.out.println("Table Successfully!!! Created!!!");

            // connection close
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void createData() {

        try {
            String url = "jdbc:mysql://localhost:3306/";
            String name = "root";
            String db = "kram";
            String password = "Vikram@8210";
            Connection conn = DriverManager.getConnection(url+db, name, password);
            // Create Statement
            Statement statement = conn.createStatement();
            System.out.println("Connected Successfully!!!");
            // Execute query
            String query = "INSERT  INTO student(sid,name,email) VALUES (2,'Shrama','b@gmail.com')";
            statement.execute(query);
            System.out.println("data inserted!!! sucessfully!!!");

            // connection close
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       
    }

    // Read Data
    public void readData() {

        try {
            String url = "jdbc:mysql://localhost:3306/";
            String name = "root";
            String db = "kram";
            String password = "Vikram@8210";
            Connection conn = DriverManager.getConnection(url+db, name, password);
            // Create Statement
            Statement statement = conn.createStatement();
            // Execute query
            String query = "select * from student;";
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                System.out.println("id " + rs.getInt(1));
                System.out.println("name " + rs.getString(2));
                System.out.println("email " + rs.getString(3));
                
            }
            System.out.println("read!!! sucessfully!!!");

            // connection close
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void updateData() {

        try {
            String url = "jdbc:mysql://localhost:3306/kram";
            String name = "root";
            String password = "Vikram@8210";
            Connection conn = DriverManager.getConnection(url, name, password);
            // Create Statement
            Statement statement = conn.createStatement();
            System.out.println("Connected Successfully!!!");
            // Execute query
            String query = "UPDATE student SET name = 'Ram' WHERE sid = 1;";
            statement.execute(query);
            System.out.println("Database Successfully!!! updated!!!");

            // connection close
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void deleteData() {
        try {
            String url = "jdbc:mysql://localhost:3306/kram";
            String name = "root";
            String password = "Vikram@8210";
            Connection conn = DriverManager.getConnection(url, name, password);
            // Create Statement
            Statement statement = conn.createStatement();
            System.out.println("Connected Successfully!!!");
            // Execute query
            String query = "DELETE FROM student WHERE sid=1;";
            statement.execute(query);
            System.out.println("Data Successfully!!! Deleted!!!");

            // connection close
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    
}
