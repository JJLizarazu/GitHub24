//  Ejercicio de ordenamiento de números: Escribe una función que tome un arreglo de números como parámetro
//  y lo ordene de forma ascendente utilizando el algoritmo de ordenamiento.
import java.util.*;
class P_77{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======== ORDENAMIENTO DE NÚMEROS ========");
        System.out.println("¿Cúantos números tendrá el arreglo?");
        System.out.print("-> "); int numArray = sc.nextInt();
        int[] array;
        array = new int[numArray];
        separators();
        for (int i = 0 ; i < numArray ; i++){
            System.out.println("Ingrese el " + (i + 1) + "° valor del arreglo: ");
            System.out.print("-> "); array[i] = sc.nextInt();
        }
        separators();
        orderArray(array);
        separators();
        separators();
    }

    public static void orderArray(int[] auxArray){
        int x = auxArray.length;
        for (int i = 0 ; i < x - 1 ; i++){
            for (int j = 0 ; j < x - i - 1 ; j++){
                if (auxArray[j] > auxArray[j + 1]){
                    int numTemp = auxArray [j];
                    auxArray[j] = auxArray[j + 1];
                    auxArray[j + 1] = numTemp;
                }
            }
        }
        System.out.println("====== ORDENADO ======");
        for (int i = 0 ; i < x ; i++){
            System.out.println("        | " + auxArray[i] + " | ");
        }
    }

    public static void separators(){
        System.out.println("=======================");
    }

}