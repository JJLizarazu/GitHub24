// Realice Un programa que dados dos números, muestra su suma, resta, división y multiplicación .
import java.util.*;
class P_19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2, sum, rest, multiply, division;
        System.out.println("== OPERACIONES FUNDAMENTALES ==");
        System.out.println("Ingrese el primer número: ");
        num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo número: ");
        num2 = sc.nextFloat();
        System.out.println("==================");
        // suma
        sum = num1 + num2;
        System.out.println("La suma es: " + sum);
        // resta
        rest = num1 - num2;
        System.out.println("La resta es: " + rest);
        // Multiplicación
        multiply = num1 * num2;
        System.out.println("La multiplicación es: " + multiply);
        // División
        division = num1 / num2;
        System.out.println("La división es: " + division);

    }
}