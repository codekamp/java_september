package CodeKamp;

import java.sql.*;

/**
 * Created by cerebro on 02/10/16.
 */
public class Demo {
    public static void main(String[] args) {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println("Your computer doens't have SQLite JDBC. Please click here to install it.");
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/CodeKamp/codekamp.sqlite");
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM students");

            while(resultSet.next()) {
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("age"));
            }

        } catch (SQLException e) {
            
        }
    }
}