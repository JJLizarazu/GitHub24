// Pide al usuario que introduzca números enteros positivos hasta que ingrese un número negativo.
// Al final, muestra la suma de los números ingresados.
import java.util.*;
class P_50{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== NÚMEROS POSITIVOS ===");
        float num, counter;
        counter = 0;
        do {
            System.out.println("Ingrese un número:");
            System.out.print("--> ");num = sc.nextFloat();
            counter = counter + num;
        } while (num > 0);
        System.out.println("La suma de números positivos que ingresó es: ");
        System.out.println("---> " + counter);
    }
}