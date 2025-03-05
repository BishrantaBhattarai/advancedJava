package unit_two.crud_demo.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ResultSetExample {
    public static void main(String[] args) {


        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/morgan",
                    "root",
                    "password");
        System.out.println("*************CONNECTION ESTABLISHED ***********");
        }catch (SQLException sqlException){
            sqlException.printStackTrace();


        }
    }
}
