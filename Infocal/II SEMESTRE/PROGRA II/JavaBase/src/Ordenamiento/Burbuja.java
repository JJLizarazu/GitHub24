package Ordenamiento;

import java.util.ArrayList;
import java.util.Arrays;

public class Burbuja {
    public static void main(String[] args) {
        int[] array = {14, 8, 12, 4, 9, 5, 10, 20, 3, 100, 3, 1, 0 , 16};
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("|   Ant: ");
        printArray(array);
        Burbuja(array);
        System.out.print("|   New: ");
        printArray(array);
    }
    
    public static void Burbuja(int[] array){
        // "i" -> Número de veces que hará el ordenamiento con todos los números -1 para no ordenar los que ya están ordenados
        for (int i = 0 ; i < array.length - 1; i++){
            // "j" -> index para recorrer el array
            for (int j = 0 ; j < array.length - i - 1; j++){
                if (array[j] > array[j + 1]){
                    // "tempo" -> menor numero
                    int tempo = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempo;
                }
            }
        }
    }
    public static void printArray(int[] array){
        int n = array.length;
        for (int i = 0 ; i < n ; i++){
            if (i == 0){
                System.out.print("[");
            }
            System.out.print(" " + array[i] + " ");
            if (i < n - 1){
                System.out.print(",");
            }
            if (i == n - 1){
                System.out.print("]");
            }
        }
        System.out.println(" ");
    }
    
}
