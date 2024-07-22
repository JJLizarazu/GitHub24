//  Cree un menú interactivo para realizar el llenado de una matriz de 2X2 de nombres con las siguientes opciones:
//1.-Agregar nombre
//2-Buscar nombre
//3.- Mostrar nombres
//4.- Salir
//Debe controlar que al momento de agregar un nombre verifique haya espacio en la matriz,
// si no hay debe devolver un mensaje que diga no se puede registrar mas.
//El menú debe mostrarse hasta que el usuario decida finalizarlo con la 4 opción, Recomendación utiliza un do-While para el menú.
import java.util.*;
class P_66E{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        int numberSelector, i = 0, searchCounter = 0;
        String names, searchName;

        String[] array;
        array = new String[4];

        do {
            System.out.println(" ");
            System.out.println("===== MENÚ =====");
            System.out.println("(Seleccione una opción y digite su número)");
            System.out.println("================================");
            System.out.println("1 -> AGREGAR NOMBRES A LA MATRIZ");
            System.out.println("2 -> BUSCAR NOMBRES EN LA MATRIZ");
            System.out.println("3 -> MOSTRAR NOMBRES DE LA MATRIZ");
            System.out.println("4 -> SALIR DEL MENÚ");
            System.out.println("================================");
            System.out.println("Ingrese un número para realizar su operación");
            System.out.print("-> "); numberSelector = sc.nextInt();
            switch (numberSelector) {
                case 1: // AGREGAR NOMBRES
                    System.out.println("Ingrese un nombre para guardarlo en la matriz: ");
                    System.out.print("-> "); names = scc.nextLine();
                    if (i < 4){
                        array[i] = names;
                        i++;
                        System.out.println("======================================================");
                        System.out.println("El nombre " + names + " ha sido agregado exitosamente!");
                        System.out.println("======================================================");
                    } else if (i >= 4){
                        System.out.println("==========================================================");
                        System.out.println("Ha excedido el número de nombres disponibles en la matriz!");
                        System.out.println("==========================================================");
                    }
                    break;
                case 2: // BUSCAR NOMBRES
                    System.out.println("Ingrese un nombre para buscarlo en la matriz:");
                    System.out.print("-> "); searchName = scc.nextLine();
                    for (i = 0 ; i < 4 ; i++){
                        if (searchName.equals(array[i])){
                            searchCounter++;
                        }
                    }
                    if (searchCounter >= 1){
                        System.out.println("======================================================");
                        System.out.println("El nombre ´" + searchName + "´ si existe en la matriz.");
                        System.out.println("======================================================");
                    } else {
                        System.out.println("======================================================");
                        System.out.println("Ese nombre no existe en la matriz.");
                        System.out.println("======================================================");
                    }
                    searchCounter = 0;
                    break;
                case 3: // MOSTRAR MATRIZ
                    System.out.println("=== MATRIZ ACTUAL ===");
                    System.out.println("=====================");
                    for (i = 0 ; i < 4 ; i++){
                        if ((i) % 2 == 0 || (i == 2)) {
                            System.out.println(" ");
                        }
                        System.out.print(" | " + array[i] + " | ");
                        if ((i + 1) % 4 == 0){
                            System.out.println(" ");
                        }
                    }
                    System.out.println(" ");
                    System.out.println("=====================");
                    break;
                case 4:
                    numberSelector = 4;
                    System.out.println("=======================");
                    System.out.println("Gracias, vuelva pronto!");
                    System.out.println("=======================");
                    break;
            }
        } while (numberSelector != 4);
    }
}