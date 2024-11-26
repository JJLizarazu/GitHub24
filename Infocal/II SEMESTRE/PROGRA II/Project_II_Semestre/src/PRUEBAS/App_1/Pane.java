package PRUEBAS.App_1;

import javax.swing.*;

public class Pane {

    public static void mainPane() {
        JFrame frameMain = new JFrame("COLEGIO INFOCAL");
        frameMain.setContentPane(new MainFrame().panelMain);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setBounds(550,200,400,400);
        frameMain.setResizable(false);
        frameMain.setVisible(true);
    }

    public static void registerPane(){
        JFrame frameRegister = new JFrame("REGISTRO");
        frameRegister.setContentPane(new RegisterFrame().panelRegister);
        frameRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameRegister.setBounds(525,200,450,400);
        frameRegister.setVisible(true);
        frameRegister.setResizable(false);
    }

    public static void registerStudentPane(){
        JFrame frameRegisterStudent = new JFrame("REGISTRO ESTUDIANTE");
        frameRegisterStudent.setContentPane(new StudentRegisterFrame().panelStundent);
        frameRegisterStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameRegisterStudent.setBounds(525,200,450,400);
        frameRegisterStudent.setVisible(true);
        frameRegisterStudent.setResizable(false);
    }

    public static void showStudentPane(){
        JFrame frameShowStudent = new JFrame("MOSTRAR ESTUDIANTE");
        frameShowStudent.setContentPane(new ShowStudentFrame().ShowStudentPanel);
        frameShowStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameShowStudent.setBounds(525,200,540,350);
        frameShowStudent.setVisible(true);
        frameShowStudent.setResizable(false);
    }

}

