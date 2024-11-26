package Frames.Menus;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class rootControlFrame {
    public JPanel rootHomePanel;
    public JPanel main;
    public JButton backBtn;
    public JPanel header;
    public JPanel body;
    public JPanel footer;
    public JButton addBtn;
    public JButton showBtn;
    public JButton updateBtn;
    public JButton deleteBtn;
    private JButton outLogBtn;

    public rootControlFrame() {
        rootHomePanel = new BackgroundPanel("src/Resources/homeImage.png");
        header.setOpaque(true);
        header.setBackground(new Color(255, 255, 255, 0));

        body.setOpaque(true);
        body.setBackground(new Color(255, 255, 255, 0));

        footer.setOpaque(true);
        footer.setBackground(new Color(255, 255, 255, 0));

        main.setOpaque(true);
        main.setBackground(new Color(255, 255, 255, 0));
        main.setPreferredSize(new Dimension(1550, 830));

        rootHomePanel.add(main);

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panels.Panel.rootMainPanel();
                SwingUtilities.getWindowAncestor(rootHomePanel).dispose();
            }
        });

        outLogBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panels.Panel.mainPanel();
                SwingUtilities.getWindowAncestor(rootHomePanel).dispose();
            }
        });
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panels.Panel.addCarPanel();
                SwingUtilities.getWindowAncestor(rootHomePanel).dispose();
            }
        });
        showBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panels.Panel.buyCarPanel();
                SwingUtilities.getWindowAncestor(rootHomePanel).dispose();
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
