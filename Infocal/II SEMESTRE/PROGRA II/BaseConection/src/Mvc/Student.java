package Mvc;

import javax.swing.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import static Mvc.school.conn;

public class Student {
    protected static String nameStudent;
    protected static String lastNameFather;
    protected static String lastNameMother;
    protected static int numberPhone;
    protected static String email;

    public Student(String nameStudent, String lastNameFather, String lastNameMother, int numberPhone, String email) {
        Student.nameStudent = nameStudent;
        Student.lastNameFather = lastNameFather;
        Student.lastNameMother = lastNameMother;
        Student.numberPhone = numberPhone;
        Student.email = email;
    }

    public static String getNameStudent() {
        return nameStudent;
    }

    public static void setNameStudent(String nameStudent) {
        Student.nameStudent = nameStudent;
    }

    public static String getLastNameFather() {
        return lastNameFather;
    }

    public static void setLastNameFather(String lastNameFather) {
        Student.lastNameFather = lastNameFather;
    }

    public static String getLastNameMother() {
        return lastNameMother;
    }

    public static void setLastNameMother(String lastNameMother) {
        Student.lastNameMother = lastNameMother;
    }

    public static int getNumberPhone() {
        return numberPhone;
    }

    public static void setNumberPhone(int numberPhone) {
        Student.numberPhone = numberPhone;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Student.email = email;
    }
    
    public static  void addStudent(){
        if (conn != null){
            String sql = "INSERT INTO student(firstName, lastFatherName, lastMotherName, numberPhone, email) VALUES (?, ?, ?, ?, ?)";
            try(PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setString(1, Student.getNameStudent());
                stmt.setString(2, Student.getLastNameFather());
                stmt.setString(3, Student.getLastNameMother());
                stmt.setInt(4, Student.getNumberPhone());
                stmt.setString(5, Student.getEmail());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Estudiante añadido correctamente!");
            } catch (SQLException m){
                JOptionPane.showMessageDialog(null, "Error al insertar datos de estudiante " + m.getMessage());
            }
        }
    }

    
}
