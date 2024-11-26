package Frames;

import Controller.CustomerController;
import Controller.UsuaryController;
import Model.AdministratorDAO;
import Model.CustomerDAO;
import Model.UsuaryDAO;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;

public class registerFrame {
    public JPanel registerPanel;
    public JPanel background;
    public JPanel header;
    public JPanel footer;
    public JPanel body;
    public JPanel bodyRight;
    public JTextField nameField;
    public JPanel bodyLeft;
    public JTextField lastNameField;
    public JTextField emailField;
    public JTextField adressField;
    public JTextField numberField;
    public JButton registBtn;
    public JPasswordField passField;
    public JButton backBtn;


    public registerFrame() {
        registerPanel = new BackgroundPanel("src/Resources/registFrame_JPG.jpg");
        background.setOpaque(true);
        background.setBackground(new Color(255, 255, 255, 0));
        registerPanel.add(background, BorderLayout.CENTER);

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(registerPanel).dispose();
                Panels.Panels.homeFrame();
            }
        });

        registBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UsuaryController.setUser(nameField, lastNameField, emailField, passField);
                UsuaryDAO.addUsuary();

                if (UsuaryDAO.getAdminId()){
                    AdministratorDAO.addAdmin();
                } else {
                    CustomerController.setCustomer(adressField, numberField);
                    CustomerDAO.addCustomer();
                }

                SwingUtilities.getWindowAncestor(registerPanel).dispose();
                Panels.Panels.homeFrame();
            }
        });
    }
    //---------------------------------------------------
    class BackgroundPanel extends JPanel {
        private BufferedImage backgroundImage;

        public BackgroundPanel(String imagePath) {
            try {
                backgroundImage = ImageIO.read(new File(imagePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }



}
