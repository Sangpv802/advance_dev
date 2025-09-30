package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";  // sửa nếu bạn đặt user khác
    private static final String PASSWORD = "123456"; // sửa password MySQL của bạn

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver MySQL 8
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL Driver not found!", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
