//  Se requiere un algoritmo para obtener un vector (C) de N elementos que contenga la suma de los elementos correspondientes
//  de otros dos vectores (A y B).     (C=A+B)
import java.util.Scanner;
class P_54{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayA;
        int[] arrayB;
        int[] arrayC;
        int elements, i;
        System.out.println("=== SUMA DE MATRICES ===");
        System.out.println("Ingrese cuantos elementos tendrán las matrices");
        elements = sc.nextInt();
        arrayA = new int[elements];
        arrayB = new int[elements];
        arrayC = new int[elements];
        System.out.println("INGRESE LOS VALORES DEL VECTOR A: ");
        System.out.println("==================================");
        for (i = 0 ; i < elements ; i++){ // MATRIZ A
            System.out.println("Ingrese el elemento: " + (i + 1));
            arrayA[i] = sc.nextInt();
        }
        System.out.println("INGRESE LOS VALORES DEL VECTOR B: ");
        System.out.println("==================================");
        for (i = 0 ; i < elements ; i++){ // MATRIZ B
            System.out.println("Ingrese el elemento: " + (i + 1));
            arrayB[i] = sc.nextInt();
        }
        for (i = 0 ; i < elements ; i++){
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        System.out.println("EL VECTOR C, ES IGUAL A: ");
        for (i = 0 ; i < elements ; i++){
            System.out.print(" | " + arrayC[i] + " | ");
        }
    }
}