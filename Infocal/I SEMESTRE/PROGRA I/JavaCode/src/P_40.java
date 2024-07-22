//  Escribe un programa que imprima los números pares entre 0 y 20 usando un bucle for.
import java.util.*;
class P_40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== NÚMEROS PARES ===");
        System.out.println("(Entre 0 - 20)");
        for (int i = 1 ; i < 100 ; i+=2){
            System.out.println(i);
        }
    }
}