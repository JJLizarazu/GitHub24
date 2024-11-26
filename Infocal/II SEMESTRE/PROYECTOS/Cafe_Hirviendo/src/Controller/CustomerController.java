package Controller;

import DataBase.SQL;
import Model.Customer;
import Model.CustomerDAO;
import Model.UsuaryDAO;

import javax.swing.*;
import java.sql.*;

public class CustomerController extends CustomerDAO {
    public CustomerController(String firstName, String lastName, String email, String password, String rol, int idCustomer, String address, int numberPhone) {
        super(firstName, lastName, email, password, rol, idCustomer, address, numberPhone);
    }

    public static void setCustomer(JTextField address, JTextField numberPhone) {
        CustomerDAO.setAddress(address.getText());
        CustomerDAO.setNumberPhone(Integer.parseInt(numberPhone.getText()));
    }


}

