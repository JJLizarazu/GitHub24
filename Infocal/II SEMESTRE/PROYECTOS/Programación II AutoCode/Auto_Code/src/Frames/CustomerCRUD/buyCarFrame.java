package Frames.CustomerCRUD;

import View.CarView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class buyCarFrame {
    public JPanel buyCarPanel;
    public JPanel main;
    public JPanel header;
    public JPanel body;
    public JPanel footer;
    public JButton backBtn;
    public JScrollPane Scroll;
    public JLabel info;
    private JTextField idSearchField;
    private JButton seeBtn;
    private JLabel label2;

    public buyCarFrame(){
        buyCarPanel = new BackgroundPanel("src/Resources/homeImage.png");
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

        buyCarPanel.add(main);
        ArrayList<String> cars = CarView.getAutosList();

        for (String car : cars) {
            info.setText(car);
            info.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panels.Panel.homePanel();
            }
        });
        seeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (idSearchField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(main, "Please enter car ID");
                } else {
                    CarView.setIdQuery(idSearchField);
                    System.out.println(idSearchField.getText());
                    Panels.Panel.seeCarPanel();
                    SwingUtilities.getWindowAncestor(buyCarPanel).dispose();
                }
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
