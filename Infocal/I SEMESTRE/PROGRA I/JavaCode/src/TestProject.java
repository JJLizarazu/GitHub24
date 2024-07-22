import java.lang.reflect.Array;
import java.util.*;
class TestProject{
    public static void main(String[] args) {
        String name;
        int quantity;
        int selectorOption;
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        ArrayList<String> mainArray = new ArrayList<>();
        ArrayList<String> Array1 = new ArrayList<>();
        ArrayList<String> Array2 = new ArrayList<>();
        ArrayList<String> Array3 = new ArrayList<>();
        mainArray.add(String.valueOf(Array1));
        mainArray.add(String.valueOf(Array2));
        mainArray.add(String.valueOf(Array3));
        do {
            System.out.println("Seleccione que quiere hacer: ");
            System.out.println("1 .- agregar");
            System.out.println("2 .- mostrar");
            System.out.println("3 .- salir");
            selectorOption = sc.nextInt();
            switch (selectorOption){
                case 1:
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("Seleccione que array quiere agregar: ");
                    System.out.println("1.- Array 1");
                    System.out.println("2.- Array 2");
                    System.out.println("3.- Array 3");
                    System.out.print("-> "); int selectorArray = sc.nextInt();
                    switch (selectorArray){
                        case 1:
                            System.out.println(" ");
                            System.out.println(" ");
                            System.out.println(" ");
                            System.out.println("Introduzca un nombre para añadir al array 1");
                            System.out.print("-> "); name = scc.nextLine();
                            System.out.println("Introduzca una cantidad para añadir al array 1");
                            System.out.print("-> "); quantity = sc.nextInt();
                            Array1.add(name);
                            Array1.add(String.valueOf(quantity));
                            break;
                        case 2:
                            System.out.println(" ");
                            System.out.println(" ");
                            System.out.println(" ");
                            System.out.println("Introduzca un nombre para añadir al array 2");
                            System.out.print("-> "); name = scc.nextLine();
                            System.out.println("Introduzca una cantidad para añadir al array 2");
                            System.out.print("-> "); quantity = sc.nextInt();
                            Array2.add(name);
                            Array2.add(String.valueOf(quantity));
                            break;
                        case 3:
                            System.out.println(" ");
                            System.out.println(" ");
                            System.out.println(" ");
                            System.out.println("Introduzca un nombre para añadir al array 3");
                            System.out.print("-> "); name = scc.nextLine();
                            System.out.println("Introduzca una cantidad para añadir al array 3");
                            System.out.print("-> "); quantity = sc.nextInt();
                            Array3.add(name);
                            Array3.add(String.valueOf(quantity));
                            break;
                    }
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("Seleccione que array desea mostrar");
                    System.out.println("1.- Array 1");
                    System.out.println("2.- Array 2");
                    System.out.println("3.- Array 3");
                    int selectShow = sc.nextInt();
                    switch (selectShow){
                        case 1:
                            System.out.println(" ");
                            System.out.println(" ");
                            System.out.println(" ");
                            for (int i = 0 ; i < Array1.size() ; i++){
                                System.out.print(" | " + Array1.get(i) + " | " + Array1.get(i + 1) + " | ");
                                System.out.println(" ");
                                System.out.println(" ");
                                i++;
                            }
                            break;
                        case 2:
                            System.out.println(" ");
                            System.out.println(" ");
                            System.out.println(" ");
                            for (int i = 0 ; i < Array2.size() ; i++){
                                System.out.print(" | " + Array2.get(i) + " | " + Array2.get(i + 1) + " | ");
                                System.out.println(" ");
                                System.out.println(" ");
                                i++;
                            }
                            break;
                        case 3:
                            System.out.println(" ");
                            System.out.println(" ");
                            System.out.println(" ");
                            for (int i = 0 ; i < Array3.size() ; i++){
                                System.out.print(" | " + Array3.get(i) + " | " + Array3.get(i + 1) + " | ");
                                System.out.println(" ");
                                System.out.println(" ");
                                i++;
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
            }
        } while (selectorOption != 3);
    }
}