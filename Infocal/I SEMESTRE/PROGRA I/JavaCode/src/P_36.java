//Imprimir los números del 1 al 100, pero en lugar de imprimir los múltiplos de 3, se debe imprimir "Fizz", y en lugar de imprimir los múltiplos de 5, se debe imprimir "Buzz". Si un número es múltiplo de 3 y de 5, se debe imprimir "FizzBuzz". El código en Java sería:
import java.util.*;
class P_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("= CICLICOS ( FOR ) =");
        for (int i = 0 ; i <= 100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}