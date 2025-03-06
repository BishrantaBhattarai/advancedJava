package unit_two.crud_demo.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertionExample {
    public static void main(String[] args) {
        try{

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/morgan",
                    "root",
                    "password");
            System.out.println("Connected to the database successfully");
            Statement statement = connection.createStatement();
            String insertionQuery= "INSERT INTO book (name, genre,author,price,isbn) VALUES ('Advanced Java','Academic','Lutta Prasad Phuyal',5000.00,'ACA-225-11')";
             statement.execute(insertionQuery);
             statement.close();
             connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
