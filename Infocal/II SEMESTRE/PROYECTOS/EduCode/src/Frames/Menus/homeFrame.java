package Frames.Menus;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class homeFrame {
    public JPanel homePanel;
    public JButton buyBtn;
    public JPanel main;
    public JPanel header;
    public JPanel body;
    public JButton backBtn;
    public JPanel footer;
    public JButton showBtn;
    public JButton profileBtn;
    public JButton outLogBtn;

    public homeFrame() {

        homePanel = new BackgroundPanel("src/Resources/mainImage.png");

        header.setOpaque(true);
        header.setBackground(new Color(255, 255, 255, 0));

        body.setOpaque(true);
        body.setBackground(new Color(255, 255, 255, 0));

        footer.setOpaque(true);
        footer.setBackground(new Color(255, 255, 255, 0));

        main.setOpaque(true);
        main.setBackground(new Color(255, 255, 255, 0));
        main.setPreferredSize(new Dimension(1550, 830));

        homePanel.add(main);


        outLogBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panels.Panel.mainPanel();
                SwingUtilities.getWindowAncestor(homePanel).dispose();
            }
        });

        showBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panels.Panel.showPanel();
                SwingUtilities.getWindowAncestor(homePanel).dispose();
            }
        });
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
