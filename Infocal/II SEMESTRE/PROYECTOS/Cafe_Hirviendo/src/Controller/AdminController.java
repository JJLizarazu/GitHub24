package Controller;

import Model.Administrator;
import Model.AdministratorDAO;

public class AdminController extends AdministratorDAO {
    public AdminController(String firstName, String lastName, String email, String password, String rol) {
        super(firstName, lastName, email, password, rol);
    }
}
