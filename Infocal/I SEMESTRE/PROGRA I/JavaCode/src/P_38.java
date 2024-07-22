// Escribe un programa que imprima la tabla de multiplicar de un número dado por el usuario usando un bucle for.
import java.util.*;
class P_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== TABLA DE MULTIPLICAR ==");
        System.out.println("¿De qué número desea la tabla de multiplicar?");
        int n = sc.nextInt();
        for (int i = 0; i <= 10 ; i++){
            System.out.println(i + " X " + n + " = " + i * n);
        }
    }
}