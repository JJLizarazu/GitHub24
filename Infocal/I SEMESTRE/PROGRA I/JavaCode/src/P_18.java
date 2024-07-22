// Realice Un programa que calcula la hipotenusa de un triángulo rectángulo conociendo sus catetos
import java.util.*;
class P_18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double opositeCathetus, adjacentCathetus, hypotenus;
        System.out.println("=== HIPOTENUSA ===");
        System.out.println("¿Cúal es el cateto opuesto de tu triángulo?");
        opositeCathetus = sc.nextFloat();
        System.out.println("¿Cúal es el cateto adyacente de tu triángulo?");
        adjacentCathetus = sc.nextFloat();
        hypotenus = Math.sqrt((opositeCathetus * opositeCathetus) + (adjacentCathetus * adjacentCathetus));
        System.out.println("===============================================");
        System.out.println("La hipotenusa de tu triángulo es: " + hypotenus);

    }
}
