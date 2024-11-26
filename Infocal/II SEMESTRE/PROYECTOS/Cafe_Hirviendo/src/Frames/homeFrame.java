package Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class homeFrame {
    public JPanel homePanel;
    public JPanel body;
    public JButton loginBtn;
    public JButton registBtn;

    public homeFrame() {
        homePanel = new BackgroundPanel("src/Resources/homeFrame_JPG1.jpg");
        body.setOpaque(true);
        body.setBackground(new Color(255, 255, 255, 0));
        homePanel.add(body, BorderLayout.PAGE_END);

        loginBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                loginBtn.setBackground(new Color(51, 26, 0));
            }
        });

        registBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                registBtn.setBackground(new Color(51, 26, 0));
            }
        });

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(homePanel).dispose();
                Panels.Panels.loginFrame();
            }
        });

        registBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(homePanel).dispose();
                Panels.Panels.registFrame();
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
