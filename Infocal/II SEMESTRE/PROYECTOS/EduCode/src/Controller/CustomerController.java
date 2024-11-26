package Controller;

import Model.User.Customer;
import Model.User.CustomerDAO;

import javax.swing.*;

public class CustomerController extends Customer {
    public CustomerController(String firstName, String lastName, String email, String password, String rol, int idCustomer, String address, int numberPhone, String country, String city) {
        super(firstName, lastName, email, password, rol, idCustomer, address, numberPhone, country, city);
    }

    public static void setCustomer(JTextField address, JTextField numberPhone, JTextField country, JTextField city) {
        CustomerDAO.setAddress(address.getText());
        CustomerDAO.setNumberPhone(Integer.parseInt(numberPhone.getText()));
        CustomerDAO.setCountry(country.getText());
        CustomerDAO.setCity(city.getText());
    }



}
