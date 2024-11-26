package Panels;

import Frames.*;
import javax.swing.*;

public class Panels {
    public static void homeFrame(){
        JFrame homeFrame = new JFrame("Cafe Hirviendo");
        homeFrame.setContentPane(new homeFrame().homePanel);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        homeFrame.setVisible(true);
        System.out.println(homeFrame.getBounds());
        System.out.println(homeFrame.getSize());
    }

    public static void loginFrame(){
        JFrame loginFrame = new JFrame("Iniciar Sesión");
        loginFrame.setContentPane(new loginFrame().loginPanel);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        loginFrame.setVisible(true);
    }

    public static void registFrame(){
        JFrame registFrame = new JFrame("REGISTRAR");
        registFrame.setContentPane(new registerFrame().registerPanel);
        registFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        registFrame.setVisible(true);
    }

}
