//  Escribe un programa que imprima el factorial de un número dado por el usuario usando un bucle for.
import java.util.*;
class P_44{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, factorial, multiply;
        System.out.println("== F A C T O R I A L ==");
        System.out.println("Ingresa un número para determinar su factorial: ");
        System.out.print("--> "); num = sc.nextInt();
        System.out.println("= factorial DEL NÚMERO [" + num + "] =");
        multiply = 1;
        for (factorial = 1 ; factorial <= num ; factorial++){
            multiply = multiply * factorial;
        }
        System.out.print("    ---> " + multiply + " <---");
    }
}
