package Model.User;

public class Usuary {
    static String firstName;
    static String lastName;
    static String email;
    static String password;
    static String rol;

    public Usuary(String firstName, String lastName, String email, String password, String rol) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Usuary.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Usuary.lastName = lastName;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Usuary.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Usuary.password = password;
    }

    public static String getRol() {
        return rol;
    }

    public static void setRol(String rol) {
        Usuary.rol = rol;
    }
}
