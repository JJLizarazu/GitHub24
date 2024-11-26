package Model;

import DataBase.SQL;

import javax.swing.*;
import java.sql.*;

public class AdministratorDAO extends Administrator{
    public static SQL sql = new SQL();
    public static Connection conn = sql.getConn();
    public AdministratorDAO(String firstName, String lastName, String email, String password, String rol) {
        super(firstName, lastName, email, password, rol);
    }


    public static void addAdmin() {
        int idUsuary = UsuaryDAO.getGeneratedId();

        if (idUsuary == -1) {
            System.out.println("ERROR: No se pudo obtener el ID del Usuario para agregar el cliente.");
            return;
        }

        if (conn != null) {
            String sql = "INSERT INTO administrator(id_usuary) VALUES (?)";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, idUsuary);

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Administrador registrado exitosamente.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);


            } catch (SQLException e) {
                System.out.println("ERROR AL AÑADIR ADMIN -> " + e.getMessage());
            }
        }
    }

}
