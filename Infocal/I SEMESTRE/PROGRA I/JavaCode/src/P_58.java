//  Ingrese 6 números en un arreglo de dos dimensiones (matriz) de 3X2 y obtenga la suma de los números ingresados.
import java.util.*;
class P_58{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("=== sumA MATRIZ (3 X 2) ===");
        int [][] array = new int[3][2];
        System.out.println("INGRESE LOS VALORES DE LA MATRIZ 3 X 2");

        for (int c = 1 ; c <= 6 ; c++){ // c = Contador para estética
            for (int i = 0 ; i < 3 ; i++){
                for (int j = 0 ; j < 2 ; j++){
                    System.out.println("Ingrese el " + c + "° valor de la matriz: ");
                    System.out.print("--> ");array[i][j] = sc.nextInt();
                    c++;
                }
            }
        }

        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 2 ; j++){
                sum = sum + array[i][j];
            }
        }
        System.out.println("La suma de la matriz es igual a: " + sum);
    }
}