package Mvc;

import java.sql.*;
import java.awt.*;

public class SQL {
    private static final String URL = "jdbc:mysql://localhost:3306/db_school";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private Connection conn;
    public SQL(){
        try {
            this.conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to database");
        } catch (SQLException e) {
            System.err.println("Connection to database Failed!" + e.getMessage());
        }
    }

    public Connection getConnection(){
        return this.conn;
    }

}
