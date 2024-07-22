//  Busque un número dentro de una matriz de 4X3 y determine la posición y si existe o no el número buscado, use el método de búsqueda secuencial.
import java.util.*;
class P_61{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("= BÚSQUEDA NÚMERO INGRESADO (4 x 3) =");
        int searchNumber, answer = 0, positionI = 0, positionJ = 0;
        int[][] array;
        array = new int[4][3];

        for (int c = 1 ; c <= 12 ; c++){ // c = Contador para estética
            for (int i = 0 ; i < 4 ; i++){
                for (int j = 0 ; j < 3 ; j++){
                    System.out.println("Ingrese el " + c + "° valor de la matriz: ");
                    System.out.print("--> ");array[i][j] = sc.nextInt();
                    c++;
                }
            }
        }

        for (int c = 1 ; c <= 12; c++){ // c = Contador para estética
            for (int i = 0 ; i < 4 ; i++){
                for (int j = 0 ; j < 3 ; j++){
                    System.out.println((c) + "° Número = " + array[i][j]);
                    c++;
                }
            }
        }

        System.out.println("Ingrese el número que desea buscar: ");
        System.out.print("--> "); searchNumber = sc.nextInt();
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                if (searchNumber == array[i][j]){
                    answer++;
                    positionI = i + 1;
                    positionJ = j + 1;
                }
            }
        }


        if(answer == 1){
            System.out.println("ESE NÚMERO EXISTE");
            System.out.println("ESTÁ EN LA POSICIÓN (" + positionI + ", " + positionJ + ")");
        } else {
            System.out.println("ESE NÚMERO NO EXISTE");
        }
    }
}