import java.util.*;
class P_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("== MAYORÍA DE EDAD ==");
        System.out.println("Ingrese la edad de la persona: ");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("La persona es MAYOR de edad.");
        } else {
            System.out.println("La persona es MENOR de edad.");
        }
    }
}

//   TERNARIA ->  System.out.println(age >= 18 ? "Es mayor de edad" : "No es mayor de edad");
//  (SOLO CUANDO HAY UNA SOLA CONDICIÓN)
