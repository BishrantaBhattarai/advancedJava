package unit_two.crud_demo.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeletionExample {
    public static void main(String[] args) {
        try{

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/morgan",
                    "root",
                    "password");
            System.out.println("Connected to the database successfully");
            Statement statement = connection.createStatement();
            String deletionQuery= "DELETE FROM book WHERE id = 3";
            statement.execute(deletionQuery);
            statement.close();
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
