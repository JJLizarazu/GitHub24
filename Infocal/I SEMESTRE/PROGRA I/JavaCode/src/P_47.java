//  Escribe un programa que imprima los números pares entre 0 y 20 usando un bucle DO- WHILE.
import java.util.*;
class P_47{
    public static void main(String[] args) {
        System.out.println("= P A R E S =");
        int i = 0;
        do {
            System.out.println(i);
            i+=2;
        } while (i <= 20);
    }
}