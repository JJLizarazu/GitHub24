//  Una compañía fabrica focos de colores (verdes, blancos y rojos). Se desea contabilizar, de un lote de N focos,
//  el número de focos de cada color que hay en existencia. Desarrolle un algoritmo para determinar esto.
import java.util.*;
class P_48{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("= COMPAÑÍA DE FOCOS =");
        System.out.println("¿Cúantos lotes de focos desea contabilizar?");
        int batch = sc.nextInt();
        int i = 1;
        int greenBulb, whiteBulb, redBulb;
        int totalGreenBulb = 0, totalWhiteBulb = 0, totalRedBulb = 0;
        int totalBulbs = 0;
        System.out.println("== CANTIDAD DE FOCOS EN " + batch + " LOTES ==");
        while (i <= batch) {
            System.out.println("= Cantidad de focos en el lote " + i + " =");
            System.out.println("¿Cúantos focos verdes hay?");
            greenBulb = sc.nextInt();
            System.out.println("¿Cúantos focos blancos hay?");
            whiteBulb = sc.nextInt();
            System.out.println("¿Cúantos focos rojos hay?");
            redBulb = sc.nextInt();
            totalRedBulb = totalRedBulb + redBulb;
            totalGreenBulb = totalGreenBulb + greenBulb;
            totalWhiteBulb = totalWhiteBulb + whiteBulb;
            totalBulbs = totalGreenBulb + totalRedBulb + totalWhiteBulb;
            i++;
        }
        System.out.println("Hay:");
        System.out.println("-> " + totalGreenBulb + " focos verdes.");
        System.out.println("-> " + totalWhiteBulb + " focos blancos.");
        System.out.println("-> " + totalRedBulb + " focos rojos.");
        System.out.println("-> " + totalBulbs + " FOCOS EN TOTAL");
    }
}