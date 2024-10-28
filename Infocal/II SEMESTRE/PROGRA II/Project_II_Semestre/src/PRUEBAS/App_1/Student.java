package PRUEBAS.App_1;

import javax.swing.*;
import java.sql.PreparedStatement;
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