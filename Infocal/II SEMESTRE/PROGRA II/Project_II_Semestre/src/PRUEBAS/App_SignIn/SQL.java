package PRUEBAS.App_SignIn;
import java.sql.*;


public class SQL {
    protected static final String URL = "jdbc:mysql://localhost:3306/db_logintest";
    protected static final String USER = "root";
    protected static final String PASS = "";

    protected Connection con;

    public SQL(){
        try{
            this.con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conectado a la base de datos exitosamente!");
        } catch (SQLException e){
            System.err.println("Error al conectar con la base de datos! " + e.getMessage());
        }
    }

    public Connection getConnection(){
        return this.con;
    }

}
