package Frames;

import Model.UsuaryDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class loginFrame {
    public JPanel loginPanel;
    public JPanel header;
    public JPanel body;
    public JPanel footer;
    public JButton logBtn;
    private JTextField emailField;
    private JPanel bodyRight;
    private JPanel bodyLeft;
    private JPasswordField passField;
    private JButton backBtn;

    public loginFrame() {
        logBtn.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                super.componentMoved(e);
            }
        });
        logBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                logBtn.setBackground(new Color(51, 26, 0));
            }
        });

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(loginPanel).dispose();
                Panels.Panels.homeFrame();
            }
        });

        logBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( UsuaryDAO.authenticateUser(emailField, passField)){
                    JOptionPane.showMessageDialog(null, "Bienvenido! Ha ingresado correctamente.", "Bienvenida", JOptionPane.INFORMATION_MESSAGE);
                    SwingUtilities.getWindowAncestor(loginPanel).dispose();
                    Panels.Panels.homeFrame();
                } else {
                    SwingUtilities.getWindowAncestor(loginPanel).dispose();
                    Panels.Panels.homeFrame();
                }
            }
        });
    }

}
