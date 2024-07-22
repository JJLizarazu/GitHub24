//  Escribe un programa que lea un número entero y determine si es divisible por 3 y por 5
//  usando una estructura selectiva doble. Si el número es divisible por ambos,
//  muestra el mensaje “El número es divisible por 3 y por 5”.
//  Si el número es divisible solo por uno de ellos, muestra el mensaje
//  “El número es divisible solo por 3” o “El número es divisible solo por 5” según corresponda.
//  Si el número no es divisible por ninguno, muestra el mensaje “El número no es divisible
//  ni por 3 ni por 5”.
import java.util.*;
class P_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num;
        System.out.println("=== DIVISIBILIDAD POR 3 Y 5 ===");
        System.out.println("Ingrese un número para determinar si es divisible por 3 y 5: ");
        num = sc.nextFloat();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Es divisible por 3 y por 5");
        } else if (num % 5 == 0) {
            System.out.println("Es divisible por 5");
        } else if (num % 3 == 0) {
            System.out.println("Es divisible por 3");
        } else {
            System.out.println("No es divisible por 3 ni por 5");
        }
    }
}
