package Model.Car;

import DataBase.SQL;
import Model.User.UsuaryDAO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarDAO extends Car {
    public static SQL sql = new SQL();
    public static Connection conn = sql.getConn();
    public CarDAO(String brand, String model, int year, int miles,String purpose, double price, String status, String image, int id_usuary) {
        super(brand, model, year, miles, purpose, price, status, image, id_usuary);
    }



    public static void addCar(){
        if(conn != null){
            String query = "INSERT INTO car(brand, model, yearCar, purpose, miles, price, statusCar, image, id_usuary) VALUES (?,?,?,?,?,?,?,?,?)";
            try(PreparedStatement stmt = conn.prepareStatement(query)){
                stmt.setString(1, brand);
                stmt.setString(2, model);
                stmt.setInt(3, year);
                stmt.setString(4, purpose);
                stmt.setInt(5, miles);
                stmt.setDouble(6, price);
                stmt.setString(7, status);
                stmt.setString(8, image);
                stmt.setInt(9, UsuaryDAO.getLoggedInUserId());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(
                        null,
                        "¡El auto se ha registrado correctamente!.",
                        "Registro Exitoso",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } catch (SQLException e){
                System.out.println("ERROR AL AÑADIR DATOS -> " + e.getMessage());
            }
        } else {
            System.out.println("La conexión al cargar datos del auto es fallida");
        }
    }

}
