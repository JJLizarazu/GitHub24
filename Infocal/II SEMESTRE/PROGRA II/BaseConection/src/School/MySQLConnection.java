package School;

import java.sql.*;
import java.util.*;

public class MySQLConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/db_school";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private Connection connection;
    public MySQLConnection(){
        try{
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa");
        } catch (SQLException e){
            System.err.println("Error de conexión" + e.getMessage());
        }
    }

    public Connection getConnection(){
        return this.connection;
    }
}

class Main{
    // sc -> int, double, float
    // ssc -> String
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Resources.cleanScreen();
        do {
            Resources.mainMenu();
            op = sc.nextInt();
            switch (op){
                case 1:
                    Resources.cleanScreen();
                    Functions.addCustomer();
                    Resources.separators();
                    break;
                case 2:
                    Resources.cleanScreen();
                    Functions.showCustomer();
                    break;
                case 3:
                    Resources.cleanScreen();
                    Functions.updateCustomer();
                    break;
                case 4:
                    Resources.cleanScreen();
                    Functions.deleteCustomer();
                    break;
                case 5:
                    Resources.outMenu();
                    break;
            }
        } while (op != 5);
    }
}


class Functions{
    static MySQLConnection dbConnection = new MySQLConnection();
    static Connection connection = dbConnection.getConnection();

    public static void showCustomer(){
        Scanner sc = new Scanner(System.in);
        int opShow;
        do {
            if (connection != null){
                String sql = "SELECT id, nombre, email, telefono FROM CLIENTES";
                try(PreparedStatement stmt = connection.prepareStatement(sql)){
                    ResultSet rs = stmt.executeQuery();
                    Resources.showMenu();
                    System.out.println("----------------------------------------------------------------------");
                    System.out.printf("| %-5s | %-14s | %-28s | %10s |%n", "ID", "NOMBRE", "EMAIL", "TELEFONO");
                    System.out.println("----------------------------------------------------------------------");
                    while (rs.next()){
                        System.out.printf("| %-5s | %-14s | %-28s | %10s |%n", rs.getString("id"), rs.getString("nombre"), rs.getString("email"), rs.getString("telefono"));
                        System.out.println("----------------------------------------------------------------------");
                    }
                } catch (SQLException e){
                    System.out.println("ERROR AL CONECTAR CON LA BASE DE DATOS" + e.getMessage());
                }
            }
            Resources.continueShow(); opShow = sc.nextInt();
            if (opShow != 1){
                System.out.println("INCORRECTO, ELIJA LA OPCIÓN 1 PARA VOLVER");
            }
        } while (opShow != 1);
    }

    public static void addCustomer(){
        int numberPhone; String name, email;
        Scanner sc = new Scanner(System.in);
        Scanner ssc = new Scanner(System.in);
        Resources.addMenu();
        System.out.print("| NOMBRE: "); name = ssc.nextLine();
        System.out.println("--------------------------");
        System.out.print("| EMAIL: "); email = ssc.nextLine();
        System.out.println("--------------------------");
        System.out.print("| TELEFONO: "); numberPhone = sc.nextInt();
        if (connection != null){
            String sql = "INSERT INTO clientes(nombre, email, telefono) VALUES (?, ?, ?)";
            try(PreparedStatement stmt = connection.prepareStatement(sql)){
                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.setString(3, String.valueOf(numberPhone));
                stmt.executeUpdate();
            } catch (SQLException e){
                System.out.println("ERROR AL CONECTAR CON LA BASE DE DATOS" + e.getMessage());
            }
        }
    }
    
    public static void updateCustomer(){
        Scanner sc = new Scanner(System.in);
        Scanner ssc = new Scanner(System.in);
        int idCustomer, newNumberPhone; String newName, newEmail;

        Resources.updateMenu();
        if (connection != null){
            String sql = "SELECT id, nombre, email, telefono FROM CLIENTES";
            try(PreparedStatement stmt = connection.prepareStatement(sql)){
                ResultSet rs = stmt.executeQuery();
                Resources.showMenu();
                System.out.println("----------------------------------------------------------------------");
                System.out.printf("| %-5s | %-14s | %-28s | %10s |%n", "ID", "NOMBRE", "EMAIL", "TELEFONO");
                System.out.println("----------------------------------------------------------------------");
                while (rs.next()){
                    System.out.printf("| %-5s | %-14s | %-28s | %10s |%n", rs.getString("id"), rs.getString("nombre"), rs.getString("email"), rs.getString("telefono"));
                    System.out.println("----------------------------------------------------------------------");
                }
            } catch (SQLException e){
                System.out.println("ERROR AL CONECTAR CON LA BASE DE DATOS" + e.getMessage());
            }
        }
        //-------------------------------------------------------------------------------
        if (connection != null){
            String sql = "UPDATE clientes SET nombre = ?, email = ?, telefono = ? WHERE id = ?";
            try(PreparedStatement stmt = connection.prepareStatement(sql)){
                Resources.selectCustomer(); idCustomer = sc.nextInt();
                System.out.println("---------------------------------------");
                System.out.print("| INGRESE NUEVO NOMBRE: "); newName = ssc.nextLine();
                System.out.println("---------------------------------------");
                System.out.print("| INGRESE NUEVO EMAIL: "); newEmail = ssc.nextLine();
                System.out.println("---------------------------------------");
                System.out.print("| INGRESE NUEVO TELÉFONO: "); newNumberPhone = sc.nextInt();
                System.out.println("---------------------------------------");

                stmt.setString(1, newName);
                stmt.setString(2, newEmail);
                stmt.setString(3, String.valueOf(newNumberPhone));
                stmt.setString(4, String.valueOf(idCustomer));

                int updateRows = stmt.executeUpdate();

                if (updateRows > 0){
                    System.out.println("| ¡LOS DATOS FUERON ACTUALIZADOS CORRECTAMENTE! |");
                } else {
                    System.out.println("| ¡NO SE ENCONTRÓ UN CLIENTE CON ESE ID! |");
                }

            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void deleteCustomer(){
        Scanner sc = new Scanner(System.in);
        Scanner ssc = new Scanner(System.in);

        Resources.deleteMenu();
        if (connection != null){
            String sql = "SELECT id, nombre, email, telefono FROM CLIENTES";
            try(PreparedStatement stmt = connection.prepareStatement(sql)){
                ResultSet rs = stmt.executeQuery();
                System.out.println("----------------------------------------------------------------------");
                System.out.printf("| %-5s | %-14s | %-28s | %10s |%n", "ID", "NOMBRE", "EMAIL", "TELEFONO");
                System.out.println("----------------------------------------------------------------------");
                while (rs.next()){
                    System.out.printf("| %-5s | %-14s | %-28s | %10s |%n", rs.getString("id"), rs.getString("nombre"), rs.getString("email"), rs.getString("telefono"));
                    System.out.println("----------------------------------------------------------------------");
                }
            } catch (SQLException e){
                System.out.println("ERROR AL CONECTAR CON LA BASE DE DATOS" + e.getMessage());
            }
        }

        if (connection != null){
            String sql = "DELETE FROM clientes WHERE id = ?";
            try (PreparedStatement stmt = connection.prepareStatement(sql)){
                Resources.selectCustomer(); int idCustomer = sc.nextInt();
                stmt.setInt(1, idCustomer);
                int deleteRows = stmt.executeUpdate();
                if (deleteRows > 0){
                    System.out.println("Cliente Eliminado");
                } else {
                    System.out.println("Cliente no encontrado");
                }
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }

}

class Resources{

    public static void separators(){
        System.out.println(" ");
        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println(" ");
    }

    public static void cleanScreen(){
        for (int i = 0 ; i < 30 ; i++){
            System.out.println(" ");
        }
    }

    public static void mainMenu(){
        System.out.println("--------------------------");
        System.out.println("|          MENÚ          |");
        System.out.println("--------------------------");
        System.out.println("|  Seleccione ( 1 - 3 )  |");
        System.out.println("--------------------------");
        System.out.println("| 1 | AÑADIR CLIENTE     |");
        System.out.println("--------------------------");
        System.out.println("| 2 | MOSTRAR CLIENTES   |");
        System.out.println("--------------------------");
        System.out.println("| 3 | ACTUALIZAR         |");
        System.out.println("--------------------------");
        System.out.println("| 4 | BORRAR             |");
        System.out.println("--------------------------");
        System.out.println("| 5 | SALIR DEL MENÚ     |");
        System.out.println("--------------------------");
        System.out.print("| -> ");
    }

    public static void addMenu(){
        System.out.println("--------------------------");
        System.out.println("|          MENÚ          |");
        System.out.println("--------------------------");
        System.out.println("|     AÑADIR CLIENTE     |");
        System.out.println("--------------------------");
    }

    public static void showMenu(){
        System.out.println("--------------------------");
        System.out.println("|          MENÚ          |");
        System.out.println("--------------------------");
        System.out.println("|    MOSTRAR CLIENTES    |");
        System.out.println("--------------------------");
        System.out.println(" ");
    }


    public static void outMenu(){
        System.out.println("--------------------------");
        System.out.println("|  SALIENDO DEL MENÚ...   |");
        System.out.println("--------------------------");
    }
    
    public static void updateMenu(){
        System.out.println("--------------------------");
        System.out.println("|          MENÚ          |");
        System.out.println("--------------------------");
        System.out.println("|   ACTUALIZAR CLIENTE   |");
        System.out.println("--------------------------");
    }


    public static void deleteMenu() {
        System.out.println("--------------------------");
        System.out.println("|          MENÚ          |");
        System.out.println("--------------------------");
        System.out.println("|    ELIMINAR CLIENTE    |");
        System.out.println("--------------------------");
    }

    public static void continueShow(){
        System.out.println("--------------------------");
        System.out.println("| 1 | VOLVER AL MENÚ     |");
        System.out.println("--------------------------");
        System.out.print("| -> ");
    }

    public static void selectCustomer(){
        System.out.println("--------------------");
        System.out.println("| SELECCIONE UN ID |");
        System.out.println("--------------------");
        System.out.print("| -> ");
    }

}
