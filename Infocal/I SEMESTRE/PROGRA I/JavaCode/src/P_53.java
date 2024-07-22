//  Se requiere obtener la suma de las cantidades contenidas en un arreglo de 10 elementos. Realice el algoritmo
import java.util.Scanner;

class P_53{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        array = new int[10];
        int sum = 0, i;
        for (i = 0 ; i < 10 ; i++){
            System.out.println("Ingrese el valor " + (i + 1)); // + 1 <- Para que muestre "Ingrese el valor 1" y no "Ingrese el valor 0" (estética)
            array[i] = sc.nextInt();
            sum = sum + array[i];
        }
        System.out.println("La suma de 10 elementos contenidos en un array es igual a: ");
        System.out.println("---> " + sum);
    }
}