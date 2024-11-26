package Frames.Menus;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class rootMainFrame {
    public JPanel rootMainPanel;
    public JPanel main;
    public JPanel header;
    public JPanel body;
    public JPanel footer;
    public JButton showBtn;
    public JButton addBtn;
    public JButton backBtn;
    public JButton outLogBtn;
    public JButton updateBtn;
    public JButton deleteBtn;

    public rootMainFrame() {

        rootMainPanel = new BackgroundPanel("src/Resources/mainImage.png");
        header.setOpaque(true);
        header.setBackground(new Color(255, 255, 255, 0));

        body.setOpaque(true);
        body.setBackground(new Color(255, 255, 255, 0));

        footer.setOpaque(true);
        footer.setBackground(new Color(255, 255, 255, 0));

        main.setOpaque(true);
        main.setBackground(new Color(255, 255, 255, 0));
        main.setPreferredSize(new Dimension(1550, 830));

        rootMainPanel.add(main);


        outLogBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panels.Panel.mainPanel();
                SwingUtilities.getWindowAncestor(rootMainPanel).dispose();
            }
        });

        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panels.Panel.addPanel();
                SwingUtilities.getWindowAncestor(rootMainPanel).dispose();
            }
        });
        showBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panels.Panel.showPanel();
                SwingUtilities.getWindowAncestor(rootMainPanel).dispose();
            }
        });
        deleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
