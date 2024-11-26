package Frames.Login;

import Model.User.UsuaryDAO;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class loginFrame {
    public JPanel loginPanel;
    public JPanel main;
    public JPanel header;
    public JPanel body;
    public JPanel footer;
    public JLabel label1;
    public JTextField emailField;
    public JPasswordField passField;
    public JButton registBtn;
    public JButton backBtn;
    public JLabel label2;

    public loginFrame() {
        loginPanel = new loginFrame.BackgroundPanel("src/Resources/loginImage.png");
        header.setOpaque(true);
        header.setBackground(new Color(255, 255, 255, 0));

        body.setOpaque(true);
        body.setBackground(new Color(255, 255, 255, 0));

        footer.setOpaque(true);
        footer.setBackground(new Color(255, 255, 255, 0));

        main.setOpaque(true);
        main.setBackground(new Color(255, 255, 255, 0));
        main.setPreferredSize(new Dimension(1550, 830));

        loginPanel.add(main);

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panels.Panel.mainPanel();
                SwingUtilities.getWindowAncestor(loginPanel).dispose();
            }
        });

        registBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( UsuaryDAO.authenticateUser(emailField, passField)){
                    if (emailField.getText().equalsIgnoreCase("root")){
                        JOptionPane.showMessageDialog(
                                null,
                                "¡Bienvenido, Administrador!\nEstás en el panel de control.",
                                "Bienvenida",
                                JOptionPane.INFORMATION_MESSAGE);
                        Panels.Panel.rootMainPanel();
                        SwingUtilities.getWindowAncestor(loginPanel).dispose();
                    } else {
                        JOptionPane.showMessageDialog(
                                null,
                                "¡Bienvenido a Auto Code!",
                                "Bienvenida",
                                JOptionPane.INFORMATION_MESSAGE);
                        System.out.println(UsuaryDAO.getLoggedInUserId());
                        Panels.Panel.homePanel();
                        SwingUtilities.getWindowAncestor(loginPanel).dispose();
                    }
                } else {
                    Panels.Panel.loginPanel();
                    SwingUtilities.getWindowAncestor(loginPanel).dispose();
                }
            }
        });
    }

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
