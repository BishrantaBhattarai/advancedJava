package unit_two.crud_demo.book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ResultSetExample {
    public static void main(String[] args) {


        try{
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/morgan",
                    "root",
                    "password");
        System.out.println("*************CONNECTION ESTABLISHED ***********");
            Statement statement = connection.createStatement();
            String query = "select * from book";
            ResultSet resultSet = statement.executeQuery(query);
            List<Book> books = new ArrayList<>();
            while (resultSet.next()) {
                System.out.println("************");
                Book book = new Book();
                System.out.println(resultSet.getString("name"));
                 book.setName(resultSet.getString("name"));
                System.out.println(resultSet.getString("genre"));
                book.setGenre(resultSet.getString("genre"));
                System.out.println(resultSet.getString("author"));
                book.setAuthor(resultSet.getString("author"));
                System.out.println(resultSet.getString("isbn"));
                    book.setIsbn(resultSet.getString("isbn"));
                System.out.println(resultSet.getDouble("price"));
                book.setPrice(resultSet.getDouble("price"));
                System.out.println(resultSet.getInt("id"));
                book.setId(resultSet.getInt("id"));
                System.out.println("************");
                books.add(book);
            }
            System.out.println("List Of Books");
            System.out.println();
            //Demonstration of how arraylist works
            List<Integer> integerList = new ArrayList<>();
            integerList.add(1);
            integerList.add(2);
            integerList.add(3);
                resultSet.close();
                statement.close();
                connection.close();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();


        }
    }
}
