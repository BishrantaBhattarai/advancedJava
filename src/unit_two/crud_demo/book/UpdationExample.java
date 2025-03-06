package unit_two.crud_demo.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdationExample {
    public static void main(String[] args) throws SQLException {
        Connection connection=null;
        try{

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/morgan",
                    "root",
                    "password");
            System.out.println("Connected to the database successfully");
            Statement statement = connection.createStatement();
            String updateQuery="UPDATE book SET genre = 'PROGRAMMING' WHERE id = 3";
            statement.executeUpdate(updateQuery);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
        }
    }
}
