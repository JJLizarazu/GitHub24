package Proyect2_1;

import java.util.*;

public class Farmacos {
    private String nameFarmaco;
    private int quantityFarmaco;
    private float priceFarmaco;
    public Farmacos(String nameFarmaco, int quantityFarmaco, float priceFarmaco){
        this.nameFarmaco = nameFarmaco;
        this.quantityFarmaco = quantityFarmaco;
        this.priceFarmaco = priceFarmaco;
    }
    public void setNameFarmaco(String nameFarmaco){
        this.nameFarmaco = nameFarmaco;
    }
    public void setQuantityFarmaco(int quantityFarmaco){
        this.quantityFarmaco = quantityFarmaco;
    }
    public void setPriceFarmaco(float priceFarmaco){
        this.priceFarmaco = priceFarmaco;
    }
    private String getNameFarmaco(){
        return nameFarmaco;
    }
    private int getQuantityFarmaco(){
        return quantityFarmaco;
    }
    private float getPriceFarmaco(){
        return priceFarmaco;
    }
    @Override
    public String toString(){
        return String.format("| %-20s | %-10d | %-10.2f |", nameFarmaco, quantityFarmaco, priceFarmaco);
    }
}
class mainFarmacia{
    private static ArrayList<Farmacos> Farmacos = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in);
    private static Scanner ssc = new Scanner(System.in);
    public static void main(String[] args) {
        int opMainMenu;
        do {
            resourcesFarmacia.mainMenu();
            System.out.print("-> "); opMainMenu = sc.nextInt();
            switch (opMainMenu){
                case 1:
                    opFarmacos();
                    break;
                case 2:
                    resourcesFarmacia.outMenu();
                    break;
            }
        } while (opMainMenu != 2);
    }

    private static void opFarmacos(){
        int opMenuFarmacos;
        do {
            resourcesFarmacia.farmacosMenu();
            System.out.print("-> "); opMenuFarmacos = sc.nextInt();
            switch (opMenuFarmacos){
                case 1:
                    opFarmacosAdd();
                    break;
                case 2:
                    opFarmacosQuit();
                    break;
                case 3:
                    opFarmacosShow();
                    break;
                case 4:
                    break;
            }
        } while (opMenuFarmacos != 4);
    }

    private static void opFarmacosAdd(){
        String name; int quantity; float price;
        resourcesFarmacia.addFarmacosMenu();
        System.out.println("Ingrese el nombre del Fármaco");
        System.out.print("-> "); name = ssc.nextLine();
        resourcesFarmacia.separators();
        System.out.println("Ingrese la cantidad del Fármaco");
        System.out.print("-> "); quantity = sc.nextInt();
        resourcesFarmacia.separators();
        System.out.println("Ingrese el precio del Fármaco");
        System.out.print("-> ");price = sc.nextFloat();
        Farmacos.add(new Farmacos(name, quantity, price));
    }

    private static void opFarmacosQuit(){
        resourcesFarmacia.quitFarmacosMenu();
        System.out.println("Ingrese el nombre del fármaco a quitar");
    }

    private static void opFarmacosShow(){
        int opFarmacosShowMenu;
        do {
            resourcesFarmacia.spaces();
            for (int i = 0 ; i < Farmacos.size() ; i++){
                System.out.println(Farmacos.get(i));
            }
            resourcesFarmacia.showFarmacosMenu();
            System.out.print("-> "); opFarmacosShowMenu = sc.nextInt();
        } while (opFarmacosShowMenu != 1);
    }

}

class resourcesFarmacia{
    public static void separators(){
        System.out.println("=========================");
    }
    public static void spaces(){
        for (int i = 0 ; i < 50 ; i++){
            System.out.println(" ");
        }
    }
    public static void mainMenu(){
        spaces();
        separators();
        System.out.println("| 1 |      FARMACIA     |");
        System.out.println("| 2 |       SALIR       |");
        separators();
        System.out.println("| Seleccione una opción |");
        System.out.println("|         (1 - 2)       |");
    }
    public static void outMenu(){
        spaces();
        separators();
        System.out.println(" SALIENDO DEL SISTEMA...");
        separators();
    }
    public static void farmacosMenu(){
        spaces();
        separators();
        System.out.println("| 1 |  AÑADIR  FÁRMACO  |");
        System.out.println("| 2 |  QUITAR  FÁRMACO  |");
        System.out.println("| 3 |  MOSTRAR FÁRMACO  |");
        System.out.println("| 4 |  VOLVER AL MENÚ   |");
        separators();
        System.out.println("| Seleccione una opción |");
        System.out.println("|         (1 - 4)       |");
        separators();
    }

    public static void addFarmacosMenu(){
        spaces();
        separators();
        System.out.println("|    AÑADIR  FÁRMACO    |");
        separators();
    }
    public static void quitFarmacosMenu(){
        spaces();
        separators();
        System.out.println("|    QUITAR  FÁRMACO    |");
        separators();
    }
    public static void showFarmacosMenu(){
        separators();
        System.out.println("|    MOSTRAR FÁRMACOS   |");
        separators();
        System.out.println("| 1 |       SALIR       |");
        separators();
        System.out.println("| Seleccione una opción |");
        System.out.println("|           (1)         |");
        separators();
    }
}
