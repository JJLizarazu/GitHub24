package Model;

public class Administrator extends Usuary{
    int idAdministrator;
    public Administrator(String firstName, String lastName, String email, String password, String rol) {
        super(firstName, lastName, email, password, rol);
    }

    public int getIdAdministrator() {
        return idAdministrator;
    }

    public void setIdAdministrator(int idAdministrator) {
        this.idAdministrator = idAdministrator;
    }
}
