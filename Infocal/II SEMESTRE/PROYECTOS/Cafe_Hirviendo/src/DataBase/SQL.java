package DataBase;

import java.sql.*;

public class SQL {
    private static final String URL = "jdbc:mysql://localhost:3306/db_cafehirviendo";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    public Connection conn;
    public SQL(){
        try{
            this.conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado a la base de datos");
        } catch (SQLException e){
            System.out.println("Error al conectar con la base de datos " + e.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }
}
