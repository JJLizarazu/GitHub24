//  Dado 3 longitudes, si forman un triángulo devolver el tipo de triángulo según sus lados.
//T. Equilátero: Sus 3 lados son iguales
//T. isósceles: 2 lados iguales.
//T. Escaleno: 3 lados diferentes
import java.util.*;
class P_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float lenght1, lenght2, lenght3;
        System.out.println("== IDENTIFICADOR DE TRIÁNGULOS ==");
        System.out.println("Ingrese uno de los lados del tríangulo");
        lenght1 = sc.nextFloat();
        System.out.println("Ingrese uno de los lados del tríangulo");
        lenght2 = sc.nextFloat();
        System.out.println("Ingrese uno de los lados del tríangulo");
        lenght3 = sc.nextFloat();
        if (lenght1 < lenght2 + lenght3 && lenght1 > lenght2 - lenght3 && lenght2 < lenght1 + lenght3 && lenght2 > lenght1 - lenght3 && lenght3 < lenght1 + lenght2 && lenght3 > lenght1 - lenght2) {
            System.out.println("ES UN TRIÁNGULO");
            if (lenght1 == lenght2 && lenght1 == lenght3) {
                System.out.println("Es un triángulo EQUILÁTERO");
            } else if (lenght1 == lenght2 || lenght2 == lenght3 || lenght1 == lenght3) {
                System.out.println("Es un triángulo ISÓCELES");
            } else {
                System.out.println("Es un triángulo ESCALENO");
            }
        } else {
            System.out.println("NO ES UN TRIÁNGULO");
        }
    }
}