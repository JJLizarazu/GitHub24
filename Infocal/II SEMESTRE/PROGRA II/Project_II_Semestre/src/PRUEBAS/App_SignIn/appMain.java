package PRUEBAS.App_SignIn;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class appMain extends JFrame {

    static SQL sql = new SQL();
    static Connection conn = sql.getConnection();

    public static void main(String[] args) {
        register();
    }

    public static void register(){
        JFrame frame = new JFrame("Registro Usuario");
        frame.setContentPane(new JFrame_1().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 200, 500,200);
        frame.setVisible(true);
    }

    public static void signIn(){
        JFrame frame_1 = new JFrame("Registro Usuario");
        frame_1.setContentPane(new JFrame_2().panel_2);
        frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_1.setBounds(500, 200, 500,200);
        frame_1.setVisible(true);
    }

}
