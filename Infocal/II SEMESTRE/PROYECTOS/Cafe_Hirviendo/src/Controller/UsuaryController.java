package Controller;

import Model.UsuaryDAO;

import javax.swing.*;

public class UsuaryController extends UsuaryDAO {

    public UsuaryController(String firstName, String lastName, String email, String password, String rol) {
        super(firstName, lastName, email, password, rol);
    }


    public static void setUser(JTextField name, JTextField lastName, JTextField email, JPasswordField password) {
        UsuaryDAO.setFirstName(name.getText());
        UsuaryDAO.setLastName(lastName.getText());
        UsuaryDAO.setEmail(email.getText());
        UsuaryDAO.setPassword(password.getText());
        if (name.getText().equalsIgnoreCase("root")){
            UsuaryDAO.setRol("Administrador");
        } else {
            UsuaryDAO.setRol("Cliente");
        }
    }
}
