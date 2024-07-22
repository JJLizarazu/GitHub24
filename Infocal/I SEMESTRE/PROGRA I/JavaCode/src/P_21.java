//  Realice Un programa que calcula la media de tres números introducidos por teclado
import java.util.*;
class P_21{
    public static void main(String[] args) {
        double num1, num2, num3, average;
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MEDIA ===");
        System.out.println("Introduzca el primer valor");
        num1 = sc.nextFloat();
        System.out.println("Introduzca el segundo valor");
        num2 = sc.nextFloat();
        System.out.println("Introduzca el tercer valor");
        num3 = sc.nextFloat();
        average = (num1 + num2 + num3) / 3;
        System.out.println("=========================");
        System.out.println("La media es de: " + average);
    }
}