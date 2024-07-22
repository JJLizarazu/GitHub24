// Realice un Un programa que pide al usuario su nombre y luego lo saluda .
import java.util.*;
class P_16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== HELLO! ====");
        System.out.println("¿Cúal es tu nombre?");
        String name = sc.nextLine();
        System.out.println("¡HOLA, " + name +  "!");
    }
}
