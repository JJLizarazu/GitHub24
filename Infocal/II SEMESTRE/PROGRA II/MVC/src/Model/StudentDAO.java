package Model;

import DataBase.SQL;

import javax.swing.*;
import java.sql.*;

public class StudentDAO extends Student{

    static SQL sql = new SQL();
    static Connection conn = sql.getConnection();

    public StudentDAO(String nameStudent, String lastFatherName, String lastMotherName, String email, String gender, int age, int grade) {
        super(nameStudent, lastFatherName, lastMotherName, email, gender, age, grade);
    }

    public static void addStudent(){

        if (Student.getAge() <= 12){
            Student.setGrade(1);
        } else if (Student.getAge() == 13){
            Student.setGrade(2);
        } else if (Student.getAge() == 14){
            Student.setGrade(3);
        } else if (Student.getAge() == 15){
            Student.setGrade(4);
        } else if (Student.getAge() == 16){
            Student.setGrade(5);
        } else {
            Student.setGrade(6);
        }

        String sql = "INSERT INTO student(nameStudent, lastFatherName, lastMotherName, email, gender, age, grade) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, Student.getName());
            stmt.setString(2, Student.getLastFatherName());
            stmt.setString(3, Student.getLastMotherName());
            stmt.setString(4, Student.getEmail());
            stmt.setString(5, Student.getGender());
            stmt.setInt(6, Student.getAge());
            stmt.setInt(7, Student.getGrade());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Estudiante añadido con éxito!");
        } catch (SQLException e){
            System.out.println("Error al intentar registrar estudiante " + e.getMessage());
        }

    }

    public static void updateStudent(){

    }

}
