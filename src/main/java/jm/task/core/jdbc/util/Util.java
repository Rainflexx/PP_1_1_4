package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static  final  String DB_URL ="jdbc:mysql://localhost:3306/user";
    private static  final  String DBUsername ="root";
    private static  final  String DBPassword ="root";

    public static Connection getConnection() {
        Connection connection =null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL,DBUsername,DBPassword);
        } catch (SQLException e) {
            System.err.println(" Connection error");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}


