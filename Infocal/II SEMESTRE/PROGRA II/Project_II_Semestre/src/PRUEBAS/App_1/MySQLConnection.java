package PRUEBAS.App_1;

import java.sql.*;

public class MySQLConnection {
    protected static final String URL = "jdbc:mysql://localhost:3306/db_app1";
    protected static final String USER = "root";
    protected static final String PASSWORD = "";
    private Connection connection;
    public MySQLConnection(){
        try{
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa");
        } catch (SQLException e){
            System.err.println("Error de conexión" + e.getMessage());
        }
    }

    public Connection getConnection(){
        return this.connection;
    }

}