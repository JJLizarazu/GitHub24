//  Un vendedor ha realizado N ventas y desea saber cuántas fueron por 10,000 o menos,
//  cuántas fueron por más de 10,000 pero por menos de 20,000, y cuánto fue el monto de las ventas de cada una y el monto global.
//  Realice un algoritmo para determinar los totales.
import java.util.*;
class P_49{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== V E N T A S ===");
        System.out.println("¿Cúantas ventas a realizado el mes de Mayo?");
        System.out.print("--> "); int sales = sc.nextInt();
        int amount;
        /* value1 = 10.000 o menos
           value2 = 10.001 - 20.000
           value3 = 20.000 o más
         */
        int value1 = 0, value2 = 0, value3 = 0;
        int totalAmount = 0;
        for (int i = 1; i <= sales ; i++){
            System.out.println("¿Cúal fúe el valor de la venta " + i + "?");
            amount = sc.nextInt();
            totalAmount = totalAmount + amount;
            if (amount <= 10000){
                value1++;
            } else if (amount > 10000 && amount <= 20000) {
                value2++;
            } else if (amount > 20000) {
                value3++;
            }
        }
        System.out.println("Hubieron " + value1 + " ventas menores a $10.000");
        System.out.println("Hubieron " + value2 + " ventas menores a $20.000  y mayores a $10.000");
        System.out.println("Hubieron " + value3 + " ventas mayores a $20.000");
        System.out.println("Hubo una venta de $" + totalAmount + " en total.");
    }
}