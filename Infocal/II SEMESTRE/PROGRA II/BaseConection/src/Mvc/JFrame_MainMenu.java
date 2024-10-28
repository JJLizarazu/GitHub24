package Mvc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrame_MainMenu {
    JPanel panelMain;
    protected JLabel title;
    protected JPanel header;
    protected JButton addButton;
    protected JPanel body;
    protected JButton showButton;
    protected JButton updateButton;
    protected JButton deleteButton;
    protected JButton outMenuButton;

    public JFrame_MainMenu() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(panelMain).dispose();
                Pane.addStudentPane();
            }
        });

        outMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(panelMain).dispose();
            }
        });
    }
}
