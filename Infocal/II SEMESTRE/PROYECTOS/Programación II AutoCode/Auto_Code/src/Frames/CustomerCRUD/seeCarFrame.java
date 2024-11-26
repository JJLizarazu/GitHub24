package Frames.CustomerCRUD;

import View.CarView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class seeCarFrame {
    public JPanel seeCarPanel;
    public JPanel main;
    public JPanel header;
    public JPanel body;
    public JPanel footer;
    public JButton buyBtn;
    public JButton backBtn;
    public JButton button1;
    public JLabel brandLabel;
    public JLabel modelLabel;
    public JLabel yearLabel;
    public JLabel priceLabel;
    public JLabel userLabel;

    public seeCarFrame() {
        CarView.setCarDetailsById(CarView.getIdQuery(), brandLabel, modelLabel, yearLabel, priceLabel, userLabel);
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panels.Panel.rootMainPanel();
                SwingUtilities.getWindowAncestor(seeCarPanel).dispose();
            }
        });
    }

}
