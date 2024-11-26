package Panels;

import Frames.CustomerCRUD.addCarFrame;
import Frames.CustomerCRUD.buyCarFrame;
import Frames.CustomerCRUD.seeCarFrame;
import Frames.Menus.homeFrame;
import Frames.Menus.rootCustomerFrame;
import Frames.Menus.rootControlFrame;
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

    public static void rootHomePanel(){
        JFrame rootHomeFrame = new JFrame("ADMIN HOME");
        rootHomeFrame.setContentPane(new rootControlFrame().rootHomePanel);
        rootHomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rootHomeFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        rootHomeFrame.setVisible(true);
    }

    public static void rootMainPanel(){
        JFrame rootMainFrame = new JFrame("PANEL DE CONTROL");
        rootMainFrame.setContentPane(new rootMainFrame().rootMainPanel);
        rootMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rootMainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        rootMainFrame.setVisible(true);
    }

    public static void rootCustomerPanel(){
        JFrame rootCustomerFrame = new JFrame("ADMIN CLIENTE");
        rootCustomerFrame.setContentPane(new rootCustomerFrame().rootCustomerPanel);
        rootCustomerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rootCustomerFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        rootCustomerFrame.setVisible(true);
    }

    public static void addCarPanel(){
        JFrame addCarFrame = new JFrame("AÑADIR AUTO");
        addCarFrame.setContentPane(new addCarFrame().addCarPanel);
        addCarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addCarFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        addCarFrame.setVisible(true);
    }

    public static void buyCarPanel(){
        JFrame buyCarFrame = new JFrame("COMPRAR AUTO");
        buyCarFrame.setContentPane(new buyCarFrame().buyCarPanel);
        buyCarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buyCarFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        buyCarFrame.setVisible(true);
    }

    public static void seeCarPanel(){
        JFrame seeCarFrame = new JFrame("VISUALIZAR AUTO");
        seeCarFrame.setContentPane(new seeCarFrame().seeCarPanel);
        seeCarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        seeCarFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        seeCarFrame.setVisible(true);}

}
