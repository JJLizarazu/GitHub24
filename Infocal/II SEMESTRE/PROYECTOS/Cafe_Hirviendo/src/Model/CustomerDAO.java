package Model;

import DataBase.SQL;
import Controller.*;
import Model.*;

import java.sql.*;
import java.util.*;
import javax.swing.*;

public class CustomerDAO extends Customer{
    public static SQL sql = new SQL();
    public static Connection conn = sql.getConn();


    public CustomerDAO(String firstName, String lastName, String email, String password, String rol, int idCustomer, String address, int numberPhone) {
        super(firstName, lastName, email, password, rol, idCustomer, address, numberPhone);
    }


    public static void addCustomer() {
        int idUsuary = UsuaryDAO.getGeneratedId();

        if (idUsuary == -1) {
            System.out.println("ERROR: No se pudo obtener el ID de Usuary para agregar el cliente.");
            return;
        }

        if (conn != null) {
            String sql = "INSERT INTO customer(address, numberPhone, id_usuary) VALUES (?, ?, ?)";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, address);
                stmt.setInt(2, numberPhone);
                stmt.setInt(3, idUsuary);

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);


            } catch (SQLException e) {
                System.out.println("ERROR AL AÑADIR CLIENTE -> " + e.getMessage());
            }
        }
    }

}
