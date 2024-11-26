package Panels;

import Frames.CRUD.addFrame;
import Frames.CRUD.showFrame;
import Frames.Menus.homeFrame;
import Frames.Menus.rootMainFrame;
import Frames.Login.loginFrame;
import Frames.Login.mainFrame;
import Frames.Login.registFrame;

import javax.swing.*;

public class Panel {
    public static void mainPanel(){
        JFrame mainFrame = new JFrame("AUTO CODE");
        mainFrame.setContentPane(new mainFrame().mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainFrame.setVisible(true);
        System.out.println(mainFrame.getSize());
    }

    public static void registPanel(){
        JFrame registFrame = new JFrame("REGISTRARSE");
        registFrame.setContentPane(new registFrame().registPanel);
        registFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        registFrame.setVisible(true);
    }

    public static void loginPanel(){
        JFrame loginFrame = new JFrame("INICIAR SESIÓN");
        loginFrame.setContentPane(new loginFrame().loginPanel);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        loginFrame.setVisible(true);
    }

    public static void homePanel(){
        JFrame homeFrame = new JFrame("HOME");
        homeFrame.setContentPane(new homeFrame().homePanel);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        homeFrame.setVisible(true);
    }


    public static void rootMainPanel(){
        JFrame rootMainFrame = new JFrame("PANEL DE CONTROL");
        rootMainFrame.setContentPane(new rootMainFrame().rootMainPanel);
        rootMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rootMainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        rootMainFrame.setVisible(true);
    }

    public static void addPanel(){
        JFrame addFrame = new JFrame("AÑADIR CLIENTE");
        addFrame.setContentPane(new addFrame().addPanel);
        addFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        addFrame.setVisible(true);
    }

    public static void showPanel(){
        JFrame showFrame = new JFrame("MOSTRAR");
        showFrame.setContentPane(new showFrame().showPanel);
        showFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        showFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        showFrame.setVisible(true);
    }


}
