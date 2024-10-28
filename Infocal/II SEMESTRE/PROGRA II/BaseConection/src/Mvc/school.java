package Mvc;

import javax.swing.*;
import java.sql.*;
import java.util.*;

public class school {
    static SQL sql = new SQL();
    static Connection conn = sql.getConnection();

    public static void main(String[] args) {
        Pane.mainPane();
    }
}

class Pane {

    public static void mainPane() {
        JFrame mainFrame = new JFrame("SCHOOL");
        mainFrame.setContentPane(new JFrame_MainMenu().panelMain);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBounds(600, 200, 300, 400);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }

    public static void addStudentPane(){
        JFrame addFrame = new JFrame("AÑADIR ESTUDIANTE");
        addFrame.setContentPane(new JFrame_addStudent().addStudentPanel);
        addFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addFrame.setBounds(500, 200, 500, 400);
        addFrame.setResizable(false);
        addFrame.setVisible(true);
    }

}
