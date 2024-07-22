//  lngrese 12 números en un arreglo bidimensional (Matriz) de 4X3, y obtenga la suma de cada columna.
import java.util.*;
class P_59{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int column1 = 0, column2 = 0, column3 = 0;
        System.out.println("=== SUMA MATRIZ (4 x 3) ===");
        int [][] array;
        array = new int[4][3];
        System.out.println("INGRESE LOS VALORES DE LA MATRIZ 4 X 3");

        for (int c = 1 ; c <= 12 ; c++){ // c = Contador para estética
            for (int i = 0 ; i < 4 ; i++){
                for (int j = 0 ; j < 3 ; j++){
                    System.out.println("Ingrese el " + c + "° valor de la matriz: ");
                    System.out.print("--> ");array[i][j] = sc.nextInt();
                    c++;
                }
            }
        }

        for (int c = 1 ; c <= 12 ; c++){
            for (int i = 0 ; i < 4 ; i++){
                for (int j = 0 ; j < 3 ; j++){
                    if (c == 1 || c == 4 || c == 7 || c == 10){
                        System.out.println(" ");
                    }
                    System.out.print(" | " + array[i][j] + " | ");
                    c++;
                }
            }
        }
        System.out.println(" ");
        System.out.println(" ");

        for (int i = 0 ; i < 4 ; i++){
            column1 = column1 + array[i][0];
            column2 = column2 + array[i][1];
            column3 = column3 + array[i][2];
        }
        System.out.println("La suma de la columna 1 = " + column1);
        System.out.println("La suma de la columna 2 = " + column2);
        System.out.println("La suma de la columna 3 = " + column3);
    }
}