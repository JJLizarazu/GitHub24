package PRUEBAS.App_1;

import PRUEBAS.App_SignIn.SQL;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static PRUEBAS.App_1.main.connection;

public class Student extends Person{
    protected static int id;
    protected static String name;
    protected static String lastFatherName;
    protected static String lastMotherName;
    protected static int age = 0;
    protected static String gender;
    protected static String grade;
    protected static String titleShow = "ID NOMBRE APELLIDO PATERNO APELLIDO MATERNO EDAD GRADO";


    public Student(String name, String lastFatherName, String lastMotherName, int age, String gender, String grade) {
        super(name, lastFatherName, lastMotherName, age, gender);
        Student.name = name;
        Student.lastFatherName = lastFatherName;
        Student.lastMotherName = lastMotherName;
        Student.age = age;
        Student.gender = gender;
        Student.grade = grade;
    }

    public static String getName() {
        return Student.name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static String getLastFatherName() {
        return Student.lastFatherName;
    }

    public static void setLastFatherName(String lastFatherName) {
        Student.lastFatherName = lastFatherName;
    }

    public static String getLastMotherName() {
        return Student.lastMotherName;
    }

    public static void setLastMotherName(String lastMotherName) {
        Student.lastMotherName = lastMotherName;
    }

    public static int getAge() {
        return Student.age;
    }

    public static void setAge(int age) {
        Student.age = age;
    }

    public static String getGender() {
        return Student.gender;
    }

    public static void setGender(String gender) {
        Student.gender = gender;
    }

    public int getId() {
        return Student.id;
    }

    public void setId(int id) {
        Student.id = id;
    }

    public static String getGrade() {
        return Student.grade;
    }

    public static void setGrade(String grade) {
        Student.grade = grade;
    }

    public static String showStudent(){
        StringBuilder dataPrint = new StringBuilder("<html><table border='1'>");
        dataPrint.append("<tr><th>ID</th><th>Nombre</th><th>Apellido Paterno</th><th>Apellido Materno</th><th>Edad</th><th>Género</th><th>Grado</th></tr>");

        if (connection != null) {
            String sql = "SELECT id, nombre, apellidoPaterno, apellidoMaterno, edad, genero, grado FROM ESTUDIANTE ORDER BY id ASC";
            try (PreparedStatement stmt = connection.prepareStatement(sql)){
                ResultSet rs = stmt.executeQuery();
                while (rs.next()){
                    dataPrint.append("<tr>")
                            .append("<td>").append(rs.getString("id")).append("</td>")
                            .append("<td>").append(rs.getString("nombre")).append("</td>")
                            .append("<td>").append(rs.getString("apellidoPaterno")).append("</td>")
                            .append("<td>").append(rs.getString("apellidoMaterno")).append("</td>")
                            .append("<td>").append(rs.getString("edad")).append("</td>")
                            .append("<td>").append(rs.getString("genero")).append("</td>")
                            .append("<td>").append(rs.getString("grado")).append("</td>")
                            .append("</tr>");
                }
                dataPrint.append("</table></html>");
            } catch (SQLException e){
                System.out.println("ERROR AL INTENTAR MOSTRAR DATOS " + e.getMessage());
            }
        }
        return dataPrint.toString();
    }


    public static void registStudent() {
        if (Student.getName().isEmpty() || Student.getLastFatherName().isEmpty() || Student.getLastMotherName().isEmpty() ||
                Student.getAge() == 0 || Student.getGender().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para continuar.");
        } else {
            if (Student.getAge() == 12) {
                Student.setGrade("1° Secundaria");
            } else if (Student.getAge() == 13) {
                Student.setGrade("2° Secundaria");
            } else if (Student.getAge() == 14) {
                Student.setGrade("3° Secundaria");
            } else if (Student.getAge() == 15) {
                Student.setGrade("4° Secundaria");
            } else if (Student.getAge() == 16) {
                Student.setGrade("5° Secundaria");
            } else if (Student.getAge() >= 17) {
                Student.setGrade("6° Secundaria");
            } else {
                Student.setGrade("");
            }
        if (connection != null) {
            String sql = "INSERT INTO estudiante(nombre, apellidoPaterno, apellidoMaterno, edad, genero, grado) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, Student.getName());
                stmt.setString(2, Student.getLastFatherName());
                stmt.setString(3, Student.getLastMotherName());
                stmt.setString(4, String.valueOf(Student.getAge()));
                stmt.setString(5, Student.getGender());
                stmt.setString(6, Student.getGrade());
                stmt.executeUpdate();
            } catch (SQLException m) {
                System.out.println("ERROR AL CONECTAR CON LA BASE DE DATOS " + m.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "El estudiante fue añadido exitosamente.");
        }
    }
}
