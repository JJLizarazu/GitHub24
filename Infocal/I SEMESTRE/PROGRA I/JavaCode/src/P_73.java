//  Ejercicio de números primos: Escribe una función que verifique si un número dado es primo o no.
//  Un número primo es aquel que solo es divisible por 1 y por sí mismo.
import java.util.*;
class P_73{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        separators();
        System.out.println("====== NÚMEROS PRIMOS ======");
        separators();
        System.out.println("Ingrese un número para determinar si es primo o no es primo: ");
        System.out.print("--> "); int Num = sc.nextInt();
        primeNum(Num);
    }

    public static void separators(){
        System.out.println("============================");
    }

    static void primeNum(int Num){
        int aux = 0;
        for (int i = 1 ; i <= Num ; i++){
            if (Num % i == 0){
                aux = aux + 1;
            }
        }
        if (aux == 2){
            separators();
            System.out.println("El número " + Num + " es: ¡Primo!");
            separators();
        } else {
            separators();
            System.out.println("El número " + Num + ": ¡No es primo!");
            separators();
        }
    }
}
