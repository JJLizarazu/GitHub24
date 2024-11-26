package Model.User;

import DataBase.SQL;

import java.math.RoundingMode;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

public class UsuaryDAO extends Usuary {
    public static SQL sql = new SQL();
    public static Connection conn = sql.getConn();

    public UsuaryDAO(String firstName, String lastName, String email, String password, String rol) {
        super(firstName, lastName, email, password, rol);
    }

    public static void addUsuary() {
        if (conn != null) {
            String sql_1 = "INSERT INTO usuary(firstName, lastName, email, pass ,rol) VALUES(?,?,?,?,?)";

            if (rol.equalsIgnoreCase("Administrador")) {
                adminId = true;
            } else {
                adminId = false;
            }

            try (PreparedStatement stmt = conn.prepareStatement(sql_1, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, firstName);
                stmt.setString(2, lastName);
                stmt.setString(3, email);
                stmt.setString(4, password);
                stmt.setString(5, rol);

                stmt.executeUpdate();

                // Guardamos el ID generado en la variable `generatedId`
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        generatedId = generatedKeys.getInt(1);
                    }
                }

            } catch (SQLException e) {
                System.out.println("ERROR AL AÑADIR DATOS -> " + e.getMessage());
            }
        } else {
            System.out.println("La conexión es fallida");
        }
    }

    public static int getGeneratedId() {
        return generatedId;
    }

    public static boolean getAdminId() {
        return adminId;
    }


    private static boolean adminId = false;

    private static int generatedId = -1;

    public static int loggedInUserId = -1;

    public static boolean authenticateUser(JTextField email, JPasswordField password) {
        if (conn != null) {
            String sql = "SELECT id, pass FROM usuary WHERE email = ?";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, email.getText());

                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        String storedPassword = rs.getString("pass");

                        if (storedPassword.equals(password.getText())) {
                            // Almacenar el ID del usuario logueado en la variable estática
                            loggedInUserId = rs.getInt("id");
                            return true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Contraseña incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
                            return false;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Correo no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                }
            } catch (SQLException e) {
                System.out.println("ERROR AL AUTENTICAR USUARIO -> " + e.getMessage());
            }
        }
        return false;
    }

    public static int getLoggedInUserId() {
        return loggedInUserId;
    }



}

