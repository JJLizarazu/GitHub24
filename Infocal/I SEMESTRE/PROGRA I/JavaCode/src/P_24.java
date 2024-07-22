// Dada una cantidad de milímetros, expresarlo en metros, decímetros, centímetros, y milímetros.
import java.util.Scanner;
class P_24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== CONVERSOR DE MILÍMETROS ==");
        System.out.println("Ingrese una cantidad (EN MILÍMETROS):");
        float milimeter = sc.nextFloat();
        double meters, decimeters, centimeters;
        /* Metros */
        meters = milimeter * 0.001;
        System.out.println("En metros: " + meters);
        /* Decímetros*/
        decimeters = milimeter * 0.01;
        System.out.println("En decímetros: " + decimeters);
        /* Centímetros */
        centimeters = milimeter * 0.1;
        System.out.println("En centímetros: " + centimeters);
    }
}