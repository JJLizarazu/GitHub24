import java.util.*;
//  Escribe un programa que imprima los números de la serie de Fibonacci menores que 100 usando un bucle for.
//  c = a + b; a = b; b = c;
class P_43{
    public static void main(String[] args) {
        System.out.println("=== F I B O N A C C I ===");
        System.out.println("======= 0 - 100 =========");
        int num1 = 0, num2 = 1, num3;
        System.out.println("|" + num1 + "|");
        System.out.println("|" + num2 + "|");

        /* for (int i = 0 ; i <= 100 ; i++){
            num3 = num1 + num2;
            if (num3 <= 100){
                System.out.println("|" + num3 + "|");
                num1 = num2;
                num2 = num3;
            }
        }*/

        // OTRA FORMA

        for (int i = 0 ; i < 10 ; i++){
            num3 = num1 + num2;
            System.out.println("|" + num3 + "|");
            num1 = num2;
            num2 = num3;
        }
    }
}