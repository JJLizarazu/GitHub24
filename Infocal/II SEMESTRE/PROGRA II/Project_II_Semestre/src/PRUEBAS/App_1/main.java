package PRUEBAS.App_1;

import javax.swing.*;
import java.sql.*;

public class main {
    static MySQLConnection mysql = new MySQLConnection();
    static Connection connection = mysql.getConnection();
    public static void main(String[] args) {
        Pane.mainPane();
    }
}

