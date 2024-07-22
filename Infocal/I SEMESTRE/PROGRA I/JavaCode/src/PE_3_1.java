//  EN UNA TIENDA SE VENDEN MANZANAS VERDES CON VALOR POR KILO DE 3.50BS
//  REALIZAR UN ALGORITMO QUE DETERMINE LOS VALORES SEGÚN EL PESO
//  QUE EL USUARIO QUIERA SIGUIENDO LA TABLA DE DESCUENTOS
//  0 - 2KG -> 0%
//  2.01 - 5KG -> 10%
//  5.01 - 10 -> 20%
//  MAYOR A 10 -> 30%

import java.util.*;
class PE_3_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Kilo;
        double Discount;
        System.out.println("==== TIENDA DE MANZANAS ====");
        System.out.println("Ingrese la cantidad de kilos de manzana que desea: ");
        System.out.print("--> "); Kilo = sc.nextFloat();
        if (Kilo <= 2){ // 0%
            Discount = (3.50 * Kilo);
            System.out.println("======================================");
            System.out.println("Por " + Kilo + "kg de manzanas verdes:");
            System.out.println("El precio es de: ¡" + Discount +"!");
            System.out.println("======================================");
        } else if (Kilo > 2 && Kilo <= 5) { //  10%
            Discount = ((3.50 * Kilo) - (3.50 * Kilo * 0.10));
            System.out.println("======================================");
            System.out.println("Por " + Kilo + "kg de manzanas verdes:");
            System.out.println("El precio es de: ¡" + Discount +"!");
            System.out.println("======================================");
        } else if (Kilo > 5 && Kilo <= 10){ //  20%
            Discount = ((3.50 * Kilo) - (3.50 * Kilo * 0.20));
            System.out.println("======================================");
            System.out.println("Por " + Kilo + "kg de manzanas verdes:");
            System.out.println("El precio es de: ¡" + Discount +"!");
            System.out.println("======================================");
        } else if (Kilo > 10){ //  30%
            Discount = ((3.50 * Kilo) - (3.50 * Kilo * 0.30));
            System.out.println("======================================");
            System.out.println("Por " + Kilo + "kg de manzanas verdes:");
            System.out.println("El precio es de: ¡" + Discount +"!");
            System.out.println("======================================");
        }
    }
}