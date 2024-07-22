//  Dado un rango numérico entero positivo A y B obtener la suma y la cantidad de los números pares, impares y múltiplos de 3;
import java.util.*;
class PE_3_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int StartNumber, FinishNumber, i;
        int Sum = 0, Pairs = 0, Impairs = 0, Multiply3 = 0;
        System.out.println("=== RANGO NUMÉRICO ===");
        System.out.println("Ingrese el número donde empezará el rango: ");
        System.out.print("--> "); StartNumber = sc.nextInt();
        System.out.println("Ingrese el número donde terminará el rango: ");
        System.out.print("--> "); FinishNumber = sc.nextInt();
        for (i = StartNumber ; i <= FinishNumber ; i++){

            Sum = Sum + i; // SUMA DE LOS NÚMEROS

            if (i % 2 == 0){  // PARES
                Pairs++;
            }
            if (i % 2 != 0){  // IMPARES
                Impairs++;
            }
            if (i % 3 == 0){  // MÚLTIPLOS DE 3
                Multiply3++;
            }
        }
        System.out.println("La suma de números entre " + StartNumber + " y " + FinishNumber + " es:");
        System.out.println("------> " + Sum + " <------");
        System.out.println("La cantidad de números pares entre " + StartNumber + " y " + FinishNumber + " es:");
        System.out.println("------> " + Pairs + " <------");
        System.out.println("La cantidad de números impares entre " + StartNumber + " y " + FinishNumber + " es:");
        System.out.println("------> " + Impairs + " <------");
        System.out.println("La cantidad de múltiplos de 3 entre " + StartNumber + " y " + FinishNumber + " es:");
        System.out.println("------> " + Multiply3 + " <------");
    }
}