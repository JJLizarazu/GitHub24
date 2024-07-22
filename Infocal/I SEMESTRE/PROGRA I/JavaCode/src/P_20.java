// Realice Un programa que convierte un valor dado en grados fahrenheit a grados celsius .
import java.util.*;
class P_20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CONVERSOR fahrenheit A celsius ===");
        System.out.println("Introduzca el valor en fahrenheit a convertir: ");
        float fahrenheit = sc.nextFloat();
        float celsius = (fahrenheit - 32) * (5 / 9);
        System.out.println("El valor en celsius de " + fahrenheit + "° fahrenheit, es: " + celsius);
    }
}