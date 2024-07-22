//  Escribe un programa que imprima el factorial de un número dado por el usuario usando un bucle WHILE
import java.util.*;
class P_45{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, factorial, multiply;
        System.out.println("== F A C T O R I A L ==");
        System.out.println("Ingresa un número para determinar su factorial: ");
        num = sc.nextInt();
        System.out.println("= factorial DEL NÚMERO " + num + " =");
        multiply = 1;
        factorial = 1;
        while (factorial <= num){
            multiply = multiply * factorial;
            factorial++;
        }
        System.out.println("---> " + multiply + " <---");
    }
}