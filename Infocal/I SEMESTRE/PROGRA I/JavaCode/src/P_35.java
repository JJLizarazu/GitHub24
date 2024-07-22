//  Escribe un programa que lea dos números enteros y determine si son iguales, diferentes,
//  mayores o menores usando una estructura selectiva múltiple(If-Else). Si los números son iguales,
//  muestra el mensaje “Los números son iguales”. Si los números son diferentes, muestra el mensaje
//  “Los números son diferentes”. Si el primer número es mayor que el segundo, muestra el mensaje
//  “El primer número es mayor que el segundo”. Si el primer número es menor que el segundo, muestra el mensaje
//  “El primer número es menor que el segundo”.
import java.util.*;
class P_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2;
        System.out.println("= MAYOR, MENOR, IGUAL, DESIGUAL =");
        System.out.println("Ingrese un número: ");
        num1 = sc.nextFloat();
        System.out.println("Ingrese otro número para compararlo: ");
        num2 = sc.nextFloat();


        if (num1 < num2){
            System.out.println("El número " + num2 + " es mayor a " + num1);
        } else if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor a " + num2);
        }

        if (num1 == num2) {
            System.out.println("Los números " + num1 + " y " + num2 + " son iguales");
        } else if (num1 != num2) {
            System.out.println("Los números " + num1 + " y " + num2 + " son diferentes");
        }
    }
}

