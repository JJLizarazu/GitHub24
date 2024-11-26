package View;

import DataBase.SQL;
import Model.User.UsuaryDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuaryView extends UsuaryDAO {
    public UsuaryView(String firstName, String lastName, String email, String password, String rol) {
        super(firstName, lastName, email, password, rol);
    }

    public static ArrayList<String> getUsuaryList() {
        ArrayList<String> userList = new ArrayList<>();
        String query = "SELECT u.id, u.firstName, u.lastName, u.email, c.address, c.numberPhone, c.country, c.city FROM usuary u JOIN customer c ON u.id = \n" +
                "c.id_usuary";

        try (Statement stmt = SQL.conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                String userInfo = "                               "+
                rs.getString("firstName") + "           " + rs.getString("lastName") + "           " +
                rs.getString("email") + "           " + rs.getString("address") + "           " +
                rs.getString("numberPhone") + "            " +  rs.getString("country") + "           " +
                rs.getString("city") + "\n";
                userList.add(userInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

}
