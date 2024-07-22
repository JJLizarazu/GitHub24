//  Almacene en una matriz de 3X2, 6 números y obtenga la cantidad de pares e impares
import java.util.Scanner;
class P_60{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int impair = 0, pair = 0;
        System.out.println("=== COLUMNAS (3 X 2) ===");
        int [][] array;
        array = new int[3][2];
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
                if (array[i][j] % 2 == 0){
                    pair++;
                } else {
                    impair++;
                }
            }
        }
        System.out.println("Hay: " + pair + " números pares");
        System.out.println("Hay: " + impair + " números impares");
    }
}