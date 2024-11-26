package View;

import DataBase.SQL;
import Model.User.UsuaryDAO;

import javax.swing.*;
import java.math.RoundingMode;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CarView extends UsuaryDAO {

    public CarView(String firstName, String lastName, String email, String password, String rol) {
        super(firstName, lastName, email, password, rol);
    }
    public static ArrayList<String> getAutosList() {
        ArrayList<String> autosList = new ArrayList<>();
        String query = "SELECT id, brand, model, yearCar, miles, price FROM car ORDER BY id DESC";

        try (Statement stmt = SQL.conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                String autoInfo = "                       " + rs.getString("id")+ "           " + rs.getString("brand") + "           " +
                        rs.getString("model") + "           " + rs.getInt("yearCar") + "           " +
                        rs.getInt("miles") + "           $ " +
                        rs.getBigDecimal("price").setScale(2, RoundingMode.HALF_UP);
                autosList.add(autoInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return autosList;
    }

    public static void setCarDetailsById(String carId, JLabel brandLabel, JLabel modelLabel, JLabel yearLabel, JLabel priceLabel, JLabel userLabel) {
        String query = "SELECT c.brand, c.model, c.yearCar, c.price, u.firstName " +
                "FROM car c " +
                "JOIN usuary u ON c.id_usuary = u.id " +
                "WHERE c.id = ?";

        try (PreparedStatement stmt = SQL.conn.prepareStatement(query)) {
            stmt.setString(1, carId);  // Establecer el ID del auto en el query
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    brandLabel.setText("Marca: " + rs.getString("brand"));
                    modelLabel.setText("Modelo: " + rs.getString("model"));
                    yearLabel.setText("Año: " + rs.getInt("yearCar"));
                    priceLabel.setText("Precio: $" + rs.getBigDecimal("price").setScale(2, RoundingMode.HALF_UP));
                    userLabel.setText("Propietario: " + rs.getString("username"));
                } else {
                    brandLabel.setText("Marca: No disponible");
                    modelLabel.setText("Modelo: No disponible");
                    yearLabel.setText("Año: No disponible");
                    priceLabel.setText("Precio: No disponible");
                    userLabel.setText("Usuario: No disponible");
                }
            }
        } catch (SQLException e) {
            brandLabel.setText("Marca: Error");
            modelLabel.setText("Modelo: Error");
            yearLabel.setText("Año: Error");
            priceLabel.setText("Precio: Error");
            userLabel.setText("Usuario: Error");
        }
    }
     public static int idQuery = -1;

    public static void setIdQuery(JTextField idQuery) {
        CarView.idQuery = Integer.parseInt(idQuery.getText());
    }

    public static String getIdQuery(){
        return String.valueOf(CarView.idQuery);
    }


}
