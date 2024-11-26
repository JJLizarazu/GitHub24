package Frames.CRUD;
import View.UsuaryView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class showFrame {
    public JPanel showPanel;
    public JPanel main;
    public JPanel header;
    public JPanel body;
    public JPanel footer;
    public JButton backBtn;
    public JLabel info;
    public JScrollPane Scroll;

    public showFrame() {
        showPanel = new BackgroundPanel("src/Resources/mainImage.png");
        header.setOpaque(true);
        header.setBackground(new Color(255, 255, 255, 0));

        body.setOpaque(true);
        body.setBackground(new Color(255, 255, 255, 0));

        footer.setOpaque(true);
        footer.setBackground(new Color(255, 255, 255, 0));

        Scroll.setOpaque(true);
        Scroll.setBackground(new Color(255, 255, 255, 0));

        main.setOpaque(true);
        main.setBackground(new Color(255, 255, 255, 0));
        main.setPreferredSize(new Dimension(1550, 830));

        showPanel.add(main);

        ArrayList<String> users = UsuaryView.getUsuaryList();
        for (String user : users) {
            info.setText(user);
        }
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panels.Panel.homePanel();
                SwingUtilities.getWindowAncestor(showPanel).dispose();
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
