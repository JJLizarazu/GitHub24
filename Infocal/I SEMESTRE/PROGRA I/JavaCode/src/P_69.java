//  Ejercicio de suma: Escribe una función que tome dos números como parámetros y devuelva su suma.
import java.util.*;
class P_69{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====   S U M A   =====");
        System.out.println("Ingrese un número para sumarlo: ");
        System.out.print("--> "); int num1 = sc.nextInt();
        System.out.println("Ingrese otro número para sumarlo: ");
        System.out.print("--> "); int num2 = sc.nextInt();
        Separators();
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + Sum(num1, num2) );
        Separators();
    }

    static int Sum(int num1, int num2){
        int add;
        add = num1 + num2;
        return add;
    }

    public static void Separators() {
        System.out.println("===========================");
    }
}