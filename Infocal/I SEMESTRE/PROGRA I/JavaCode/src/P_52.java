//  Pide al usuario que introduzca números enteros positivos hasta que ingrese un número igual a cero.
//  Al final, muestra el promedio de los números ingresados.
import java.util.*;
class P_52{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num, counter = 0, average = 0;
        int i = 0;
        System.out.println("== NÚMEROS POSITIVOS - PROMEDIO ==");
        do {
            System.out.println("Ingrese un número: ");
            num = sc.nextFloat();
            counter = counter + num;
            i++;
            if (num == 0){
                i--;
            }
        } while (num != 0);
        average = counter / (i);
        System.out.println("El promedio de los números ingresados es:");
        System.out.println(average);
    }
}