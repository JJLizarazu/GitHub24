package Controller.User;

import Model.User.AdministratorDAO;

public class AdminController extends AdministratorDAO {
    public AdminController(String firstName, String lastName, String email, String password, String rol) {
        super(firstName, lastName, email, password, rol);
    }
}
