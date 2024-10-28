package PRUEBAS.App_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
    JPanel panelMain;
    private JLabel titleMain;
    private JButton register;
    private JButton show;
    private JButton update;
    private JPanel panelMain_1;

    public MainFrame() {
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(panelMain).dispose();
                Pane.registerPane();
            }
        });
    }
}
