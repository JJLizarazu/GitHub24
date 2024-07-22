//  lngrese 6 números en una matriz de 3X2 y obtenga el numero mayor ingresado
import java.util.*;
class P_63{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempArray = 0;
        int[][] array;
        array = new int[3][2];
        System.out.println("== MAYOR NÚMERO (3 X 2) ==");
        System.out.println("Ingrese los valores de la matriz: ");
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
                if (array[i][j] > tempArray){
                    tempArray = array[i][j];
                }
            }
        }
        System.out.println("El Mayor es: " + tempArray);
    }
}