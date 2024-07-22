// Escribe un programa que imprima los números impares entre 1 y 99 usando un bucle for.
import java.util.*;
class P_41{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== IMPARES (1 - 99) ==");
        for (int i = 1 ; i < 100 ; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}