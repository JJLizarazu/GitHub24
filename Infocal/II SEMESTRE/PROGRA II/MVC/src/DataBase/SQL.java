package DataBase;

import java.sql.*;

public class SQL {

    protected static final String URL = "jdbc:mysql://localhost:3306/db_school";
    protected static final String USER = "root";
    protected static final String PASSWORD = "";
    private Connection conn;

    public SQL(){
        try{
            this.conn= DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("CONEXIÓN EXITOSA CON LA BASE DE DATOS");
        } catch (SQLException e){
            System.err.println("ERROR AL CONECTAR A LA BASE DE DATOS " + e.getMessage());
        }
    }

    public Connection getConnection(){
        return this.conn;
    }

}
