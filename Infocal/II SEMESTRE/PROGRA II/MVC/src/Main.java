import DataBase.SQL;
import Frames.Panels;
import Model.Student;

import java.sql.Connection;

public class Main {
    static SQL sql = new SQL();
    static Connection conn = sql.getConnection();

    public static void main(String[] args) {
        Panels.mainFrame();
    }
}