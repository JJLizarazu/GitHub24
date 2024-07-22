//  Ejercicio de conversión de temperatura: Escribe una función que convierta una temperatura dada en grados
//  Celsius a grados Fahrenheit. La fórmula para la conversión es: Fahrenheit = Celsius * 9/5 + 32.
import java.util.*;
class P_75{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== CONVERSOR DE GRADOS A CELSIUS ==");
        System.out.println("Ingrese los grados Celsius a convertir: ");
        System.out.print("-> "); float celsiusGrades = sc.nextFloat();
        celsiusConverse(celsiusGrades);
    }

    static void celsiusConverse(float celsiusGrades){
        float fahrenheitGrades;
        fahrenheitGrades = (celsiusGrades * 9 / 5) + 32;
        System.out.println("==========================");
        System.out.println(celsiusGrades + "° Celsius en grados Fahrenheit es: ");
        System.out.println("¡ " + fahrenheitGrades + " !");
        System.out.println("==========================");
    }

}
