//  Busque un número en 7 números ingresados en un array y determine la posición y si existe o no el número buscado, use el método de búsqueda secuencial.
import java.util.*;
class P_56{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("= BÚSQUEDA NÚMERO INGRESADO =");
        int searchNumber, answer = 0, position = 0;
        int[] array;
        array = new int[7];
        for (int i = 0 ; i < 7 ; i++){
            System.out.println("Ingrese el número que estará en la posición " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        for (int i = 0 ; i < 7 ; i++){
            System.out.println((i + 1) + "° Número = " + array[i]);
        }

        System.out.println("Ingrese el número que desea buscar: ");
        System.out.print("--> "); searchNumber = sc.nextInt();
        for (int i = 0 ; i < 7 ; i++){
            if (searchNumber == array[i]){
                answer++;
                position = i + 1;
            }
        }
        if(answer == 1){
            System.out.println("ESE NÚMERO EXISTE");
            System.out.println("ESTÁ EN LA POSICIÓN " + position);
        } else {
            System.out.println("ESE NÚMERO NO EXISTE");
        }
    }
}