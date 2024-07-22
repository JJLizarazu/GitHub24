//  Dado la matriz A de 2X2,la matriz B de 2X2, obtenga la suma de dichas matriz
import java.util.*;
class P_62{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayA;
        arrayA = new int[4];
        int[] arrayB;
        arrayB = new int[4];
        int[] arrayC;
        arrayC = new int[4];
        System.out.println("== SUMA DE MATRICES 2 X 2 ==");
        System.out.println("INGRESE LOS NÚMEROS DE LA MATRIZ A: ");
        for (int i = 0 ; i < 4 ; i++){
            System.out.println("Ingrese el " + (i + 1) + "° número: ");
            System.out.print("--> ");arrayA[i] = sc.nextInt();
        }

        System.out.println("INGRESE LOS NÚMEROS DE LA MATRIZ B: ");
        for (int i = 0 ; i < 4 ; i++){
            System.out.println("Ingrese el " + (i + 1) + "° número: ");
            System.out.print("--> ");arrayB[i] = sc.nextInt();
        }

        System.out.println("=== > LA SUMA DE A Y B ES: ");
        for (int i = 0 ; i < 4 ; i++){
            arrayC[i] = arrayA[i] + arrayB[i];
            System.out.print(" | " + arrayC[i] + " | ");
        }
    }
}