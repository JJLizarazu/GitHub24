package PRUEBAS.App_SignIn;

import javax.swing.*;
import java.awt.event.*;

public class JFrame_2 {
    protected JTextField userCheckField;
    protected JLabel inicioSesiónTitle;
    protected JTextField passCheckField;
    protected JLabel userCheckLabel;
    protected JLabel passCheckLabel;
    protected JButton confirmSesionBtn;
    protected JPanel panel_2;

    public JFrame_2() {
        confirmSesionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userCheckField.getText().equals("") || passCheckField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe llenar los datos!");
                } else {
                    if (userCheckField.getText().equals(user.username) && passCheckField.getText().equals(user.password)) {
                        JOptionPane.showMessageDialog(null, "Bienvenido! " + userCheckField.getText());
                        SwingUtilities.getWindowAncestor(confirmSesionBtn).dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario y contraseña son incorrectos!");
                    }
                }
            }
        });
    }
}
