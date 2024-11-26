package View;

import DataBase.SQL;
import Model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentVIEW extends Student {

    static SQL sql = new SQL();
    static Connection conn = sql.getConnection();

    public StudentVIEW(String nameStudent, String lastFatherName, String lastMotherName, String email, String gender, int age, int grade) {
        super(nameStudent, lastFatherName, lastMotherName, email, gender, age, grade);
    }

    public static String showStudent(){
        StringBuilder dataPrint = new StringBuilder("<html><table border='1'>");
        dataPrint.append("<tr><th>Nombre</th><th>Apellido Paterno</th><th>Apellido Materno</th><th>Correo</th><th>Género</th><th>Edad</th><th>Grado</th></tr>");


        if (conn != null) {
            String sql = "SELECT id, nameStudent, lastFatherName, lastMotherName, email, gender, age, grade FROM STUDENT ORDER BY id ASC";
            try (PreparedStatement stmt = conn.prepareStatement(sql)){
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    dataPrint.append("<tr>")
                            .append("<td>").append(rs.getString("nameStudent")).append("</td>")
                            .append("<td>").append(rs.getString("lastFatherName")).append("</td>")
                            .append("<td>").append(rs.getString("lastMotherName")).append("</td>")
                            .append("<td>").append(rs.getString("email")).append("</td>")
                            .append("<td>").append(rs.getString("gender")).append("</td>")
                            .append("<td>").append(rs.getInt("age")).append("</td>")
                            .append("<td>").append(rs.getInt("grade")).append("° secundaria</td>")
                            .append("</tr>");
                }
                dataPrint.append("</table></html>");
            } catch (SQLException e){
                System.out.println("ERROR AL INTENTAR MOSTRAR DATOS " + e.getMessage());
            }
        }
        return dataPrint.toString();
    }

}
