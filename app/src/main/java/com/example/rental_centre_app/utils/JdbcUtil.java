package com.example.rental_centre_app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JdbcUtil {
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://192.168.68.103:3306/rentalapp/test?characterEncoding=utf-8";
    private static final String USER = "root";
    private static final String PSWD = "php980825";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = (Connection) DriverManager.getConnection(URL,USER,PSWD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

}

