package Pharmacy_Project;

public class Resources {

    protected static void separators(){
        System.out.println("=========================");
    }

    protected static void clearScreen(){
        for (int i = 0 ; i < 50 ; i++){
            System.out.println(" ");
        }
    }

    protected static void mainMenu(){
        clearScreen();
        System.out.println("|-----------------------|");
        System.out.println("|        FARMACIA       |");
        System.out.println("|-----------------------|");
        System.out.println("|      ¡BIENVENIDO!     |");
        System.out.println("|-----------------------|");
        System.out.println("| Seleccione una opción |");
        System.out.println("|         (1 - 3)       |");
        System.out.println("|-----------------------|");
        System.out.println("| 1 |    INVENTARIO     |");
        System.out.println("|-----------------------|");
        System.out.println("| 2 |     FACTURAS      |");
        System.out.println("|-----------------------|");
        System.out.println("| 3 |  SALIR DEL MENÚ   |");
        System.out.println("|-----------------------|");
    }

    protected static void opInventory(){
        clearScreen();
        System.out.println("|-----------------------|");
        System.out.println("|       INVENTARIO      |");
        System.out.println("|-----------------------|");
        System.out.println("| Seleccione una opción |");
        System.out.println("|         (1 - 4)       |");
        System.out.println("|-----------------------|");
        System.out.println("| 1 |  AÑADIR FÁRMACO   |");
        System.out.println("|-----------------------|");
        System.out.println("| 2 |  QUITAR FÁRMACO   |");
        System.out.println("|-----------------------|");
        System.out.println("| 3 |    INVENTARIO     |");
        System.out.println("|-----------------------|");
        System.out.println("| 4 |      VOLVER       |");
        System.out.println("|-----------------------|");
    }

    protected static void addInvetory(){
        clearScreen();
        System.out.println("|-----------------------|");
        System.out.println("|     AÑADIR FÁRMACO    |");
        System.out.println("|-----------------------|");
    }

    protected static void removeInventory(){
        System.out.println("|-----------------------|");
        System.out.println("|     QUITAR FÁRMACO    |");
        System.out.println("|-----------------------|");
    }

    protected static void pharmacosEmpty(){
        System.out.println("|----------------------------|");
        System.out.println("|  EL INVENTARIO ESTÁ VACÍO  |");
        System.out.println("|----------------------------|");
    }

}
