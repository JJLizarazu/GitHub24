package Model.User;

public class Customer extends Usuary {
    static int idCustomer;
    static String address;
    static int numberPhone;
    static String country;
    static String city;

    public Customer(String firstName, String lastName, String email, String password,
                    String rol, int idCustomer, String address, int numberPhone, String country, String city) {
        super(firstName, lastName, email, password, rol);
        this.idCustomer = idCustomer;
        this.address = address;
        this.numberPhone = numberPhone;
        this.country = country;
        this.city = city;
    }

    public static int getIdCustomer() {
        return idCustomer;
    }

    public static void setIdCustomer(int idCustomer) {
        Customer.idCustomer = idCustomer;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Customer.address = address;
    }

    public static int getNumberPhone() {
        return numberPhone;
    }

    public static void setNumberPhone(int numberPhone) {
        Customer.numberPhone = numberPhone;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Customer.country = country;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Customer.city = city;
    }
}
