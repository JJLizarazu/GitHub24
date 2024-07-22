//  Dado 4 números enteros, obtener el porcentaje de cada uno en función a la suma de los 4 números ingresados
import java.util.*;
class P_25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4;
        System.out.println("=== PORCENTAJE DE sumA ===");
        System.out.println("Ingrese 4 números: ");
        System.out.println("Ingrese el número 1");
        num1 = sc.nextInt();
        System.out.println("Ingrese el número 2");
        num2 = sc.nextInt();
        System.out.println("Ingrese el número 3");
        num3 = sc.nextInt();
        System.out.println("Ingrese el número 4");
        num4 = sc.nextInt();
        int sum = num1 + num2 + num3 + num4;
        int percenteg1, percenteg2, percenteg3, percenteg4;
        percenteg1 = (num1 * 100) / sum;
        percenteg2 = (num2 * 100) / sum;
        percenteg3 = (num3 * 100) / sum;
        percenteg4 = (num4 * 100) / sum;
        System.out.println("El procentaje del primer número es: " + percenteg1 + "%");
        System.out.println("El procentaje del segundo número es: " + percenteg2 + "%");
        System.out.println("El procentaje del tercer número es: " + percenteg3 + "%");
        System.out.println("El procentaje del cuarto número es: " + percenteg4 + "%");
    }
}