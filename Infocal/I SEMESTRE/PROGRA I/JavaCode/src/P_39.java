//  Escribe un programa que determine si un número es primo o no usando un bucle for.
import java.util.*;
class P_39{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== NÚMERO PRIMO ===");
        System.out.println("Ingrese un número para determinar: ");
        int num = sc.nextInt();
        int aux = 0;
        for (int i = 1 ; i <= num ; i++){
            if (num % i == 0){
                aux = aux + 1;
            }
        }
        if (aux == 2){
            System.out.println("El número " + num + " es primo");
        } else {
            System.out.println("El número " + num + " no es primo");
        }
    }
}