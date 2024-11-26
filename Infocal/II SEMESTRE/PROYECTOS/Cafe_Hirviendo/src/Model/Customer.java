package Model;

import java.sql.*;

public class Customer extends Usuary{
    static int idCustomer;
    static String address;
    static int numberPhone;

    public Customer(String firstName, String lastName, String email, String password, String rol, int idCustomer, String address, int numberPhone) {
        super(firstName, lastName, email, password, rol);
        this.idCustomer = idCustomer;
        this.address = address;
        this.numberPhone = numberPhone;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public static void setIdCustomer(int idCustomer) {
        Customer.idCustomer = idCustomer;
    }

    public String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Customer.address = address;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public static void setNumberPhone(int numberPhone) {
        Customer.numberPhone = numberPhone;
    }
}
