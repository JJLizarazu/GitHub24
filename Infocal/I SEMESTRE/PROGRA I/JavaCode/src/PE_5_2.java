//Escribe un programa que imprima los números impares entre 9 y 20 usando un bucle for.
import java.util.*;
class PE_5_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== NÚMEROS IMPARES ( 9 - 20 ) ===");
        impairs();
    }

    static void impairs(){
        for (int i = 9 ; i <= 20 ; i++){
            if (i % 2 != 0 && i % i == 0 && i % 1 == 0){
                System.out.print(" |" + i + "| ");
            }
        }
        System.out.println(" ");
        System.out.println("==================================");
    }

}