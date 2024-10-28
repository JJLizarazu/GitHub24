package PRUEBAS.App_SignIn;

import javax.swing.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static PRUEBAS.App_SignIn.appMain.conn;

public class JFrame_1 extends JFrame {

    protected JPanel panelMain;
    protected JLabel Title;
    protected JLabel usernameLabel;
    protected JTextField usernameField;
    protected JLabel passwordLabel;
    protected JTextField passwordField;
    protected JButton confirmRegisterBtn;

    public JFrame_1() {

        confirmRegisterBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(usernameField.getText().isEmpty() || passwordField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos!");
                } else {
                    if (passwordField.getText().length() < 10){
                        JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos 10 caracteres!");
                    } else {
                        if (conn != null){
                            String sql = "INSERT INTO customer(username, pass) VALUES (?, ?)";
                            try(PreparedStatement stmt = conn.prepareStatement(sql)){
                                stmt.setString(1, usernameField.getText());
                                stmt.setString(2, passwordField.getText());
                                stmt.executeUpdate();
                            } catch (SQLException m){
                                System.out.println("ERROR AL CONECTAR CON LA BASE DE DATOS" + m.getMessage());
                            }
                        }
                        user.username = usernameField.getText();
                        user.password = passwordField.getText();
                        SwingUtilities.getWindowAncestor(panelMain).dispose();
                        appMain.signIn();
                    }
                }
            }
        });
    }


}