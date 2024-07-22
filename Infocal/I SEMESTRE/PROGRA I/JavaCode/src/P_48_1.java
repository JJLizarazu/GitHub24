// Una compañía fabrica focos de colores (verdes, blancos y rojos). Se desea contabilizar, de un lote de N focos,
//  el número de focos de cada color que hay en existencia. Desarrolle un algoritmo para determinar esto.

import java.util.*;
class P_48_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("= COMPAÑÍA DE FOCOS =");
        System.out.println("¿Cúantos focos llegaron en el lote?");
        System.out.print("---> "); int bulbs = sc.nextInt();
        int bulbCounter;
        int greenCounter = 0, whiteCounter = 0, redCounter = 0;
        System.out.println("Inserte un número ( 1 - 3 ) según el color del foco:");
        for (int i = 1 ; i <= bulbs ; i++){
            System.out.println("¿De qúe color es el foco " + i + "?");
            System.out.println("-> 1 = VERDE");
            System.out.println("-> 2 = BLANCO");
            System.out.println("-> 3 = ROJO");
            System.out.print("---> ");bulbCounter = sc.nextInt();
            if (bulbCounter == 1){
                greenCounter++;
            } else if (bulbCounter == 2) {
                whiteCounter++;
            } else if (bulbCounter == 3) {
                redCounter++;
            } else {
                System.out.println("Ese número no existe");
            }
        }
        System.out.println("EN EL LOTE HAY:");
        System.out.println("-> " + greenCounter + " focos verdes.");
        System.out.println("-> " + whiteCounter + " focos blancos.");
        System.out.println("-> " + redCounter + " focos rojos.");
    }
}