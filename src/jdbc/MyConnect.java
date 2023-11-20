package jdbc;

import java.sql.*;
import java.util.regex.Pattern;

public class MyConnect {

    private static String JDBC_URL="jdbc:mysql://localhost:3306/microservices";
    private static String USERNAME="root";
    private static String PASSWORD="3479";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(JDBC_URL,USERNAME, PASSWORD);
        String query ="insert into micro_users values('50','khan',prt@gmai.com','jhnadu')";
        PreparedStatement statement = connection.prepareStatement(query);

        int row = statement.executeUpdate();

        System.out.println("Rows "+row);

    }


}
