package Frames.CRUD;

import Controller.CustomerController;
import Controller.UsuaryController;
import Frames.Menus.homeFrame;
import Model.User.AdministratorDAO;
import Model.User.CustomerDAO;
import Model.User.UsuaryDAO;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class addFrame {
    public JPanel addPanel;
    public JButton outLogBtn;
    public JPanel body;
    public JLabel label1;
    public JTextField nameField;
    public JLabel label2;
    public JLabel label3;
    public JLabel label4;
    public JLabel label5;
    public JLabel label6;
    public JLabel label7;
    public JLabel label8;
    public JTextField lastNameField;
    public JTextField countryField;
    public JTextField cityField;
    public JTextField numberField;
    public JTextField addressField;
    public JTextField emailField;
    public JPasswordField passField;
    public JPanel header;
    public JPanel footer;
    public JButton registBtn;
    private JPanel main;

    public addFrame() {

        addPanel = new BackgroundPanel("src/Resources/addImage.png");

        header.setOpaque(true);
        header.setBackground(new Color(255, 255, 255, 0));

        body.setOpaque(true);
        body.setBackground(new Color(255, 255, 255, 0));

        footer.setOpaque(true);
        footer.setBackground(new Color(255, 255, 255, 0));

        main.setOpaque(true);
        main.setBackground(new Color(255, 255, 255, 0));
        main.setPreferredSize(new Dimension(1550, 830));

        addPanel.add(main);


        outLogBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panels.Panel.homePanel();
                SwingUtilities.getWindowAncestor(addPanel).dispose();
            }
        });

        registBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nameField.getText().isEmpty() || lastNameField.getText().isEmpty() || countryField.getText().isEmpty() ||
                        cityField.getText().isEmpty() || numberField.getText().isEmpty() || addressField.getText().isEmpty() ||
                        emailField.getText().isEmpty() || passField.getPassword().length == 0) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Por favor, complete todos los campos antes de continuar.",
                            "Campos vacíos",
                            JOptionPane.WARNING_MESSAGE);
                } else if (passField.getPassword().length < 6) {
                    JOptionPane.showMessageDialog(
                            null,
                            "La contraseña debe ser mayor a 6 caracteres.",
                            "Contraseña Insegura",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    UsuaryController.setUser(nameField, lastNameField, emailField, passField);
                    UsuaryDAO.addUsuary();
                    if (UsuaryDAO.getAdminId()){
                        AdministratorDAO.addAdmin();
                    } else {
                        CustomerController.setCustomer(addressField, numberField, countryField, cityField);
                        CustomerDAO.addCustomer();
                    }
                    Panels.Panel.homePanel();
                    SwingUtilities.getWindowAncestor(addPanel).dispose();
                }
            }
        }
        );

    }
    class BackgroundPanel extends JPanel {
        public BufferedImage backgroundImage;

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
