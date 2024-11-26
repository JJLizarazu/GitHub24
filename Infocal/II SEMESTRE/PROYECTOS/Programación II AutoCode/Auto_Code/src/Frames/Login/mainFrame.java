package Frames.Login;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class mainFrame {
    public JPanel mainPanel;
    public JPanel main;
    public JPanel header;
    public JPanel body;
    public JPanel footer;
    public JButton logBtn;
    public JButton registBtn;
    public JFileChooser fileChooser;

    public mainFrame() {
        mainPanel = new BackgroundPanel("src/Resources/mainImage.png");
        body.setOpaque(true);
        body.setBackground(new Color(255, 255, 255, 0));
        body.setPreferredSize(new Dimension(1550, 830));
        mainPanel.add(body);

        registBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(mainPanel).dispose();
                Panels.Panel.registPanel();
            }
        });
        logBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(mainPanel).dispose();
                Panels.Panel.loginPanel();
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
