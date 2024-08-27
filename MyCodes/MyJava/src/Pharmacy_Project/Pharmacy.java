package Pharmacy_Project;
import java.util.*;
public class Pharmacy {
    static ArrayList <Pharmacos> pharmacosPharmacy = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static Scanner ssc = new Scanner(System.in);

    public static void main(String[] args) {
        int opMainMenu;
        do {
            Resources.mainMenu();
            System.out.print("-> "); opMainMenu = sc.nextInt();
            switch (opMainMenu){
                case 1:
                    int opMenuInvetory;
                    Resources.opInventory();
                    System.out.print("-> "); opMenuInvetory = sc.nextInt();
                    switch (opMenuInvetory){
                        case 1:
                            Resources.addInvetory();
                            pharmacoDetail();
                            break;
                        case 2:
                            Resources.removeInventory();
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } while (opMainMenu != 3);
    }

    private static void pharmacoDetail(){
        String name; int quantity; float price;
        System.out.println("Ingrese el nombre del Fármaco: ");
        System.out.print("-> "); name = ssc.nextLine();
        System.out.println("Ingrese la cantidad del Fármaco: ");
        System.out.print("-> x"); quantity = sc.nextInt();
        System.out.println("Ingrese el precio por unidad del Fármaco: ");
        System.out.print("-> Bs."); price = sc.nextFloat();
        pharmacosPharmacy.add(new Pharmacos(name, quantity, price));
    }


}
