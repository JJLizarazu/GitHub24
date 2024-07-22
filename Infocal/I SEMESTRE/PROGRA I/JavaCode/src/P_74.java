//  Ejercicio de promedio de números: Escribe una función que tome un arreglo de números como parámetro y devuelva su promedio.
import java.util.*;
class P_74{
    public static void main(String[] args) {
        System.out.println("===== PROMEDIO DE NÚMEROS EN ARRAY =====");
        averageArray();
    }

    static void averageArray(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        float average;
        System.out.println("¿Cúantos números tendrá el arreglo?");
        System.out.print("-> "); int numArray = sc.nextInt();
        int[] array;
        array = new int[numArray];
        for (int i = 0 ; i < numArray ; i++){
            separator();
            System.out.println("Ingrese el °" + (i + 1) + " número para guardarlo en el arreglo: ");
            System.out.print("-> "); array[i] = sc.nextInt();
        }

        for (int i = 0 ; i < numArray ; i++){
            sum = sum + array[i];
        }
        average = (float) sum / numArray;
        separator();
        System.out.println("El promedio es: ");
        System.out.println("¡ " + average + " !");
        separator();
    }

    public static void separator() {
        System.out.println("===================================");
    }

}