//  Ejercicio de factorial: Escribe una función que calcule el factorial de un número dado.
//  El factorial de un número entero positivo N se define como el producto de todos los
//  números enteros positivos desde 1 hasta N.
import java.util.*;
class P_70{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====   F A C T O R I A L   ====");
        System.out.println("Ingrese un número para determinar su factorial: ");
        System.out.print("--> "); int num = sc.nextInt();
        separators();
        System.out.println("El factorial del número | " + num + " | es: " + factorial(num));
        separators();
    }

    static int factorial(int num){
        int multiply = 1;
        for (int i = 1 ; i <= num ; i++){
            multiply = multiply * i;
        }
        return multiply;
    }

    public static void separators() {
        System.out.println("=======================================");
    }

}
