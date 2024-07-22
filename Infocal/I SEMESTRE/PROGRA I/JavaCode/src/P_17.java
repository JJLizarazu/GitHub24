// Realice Un programa que calcula el perímetro y el área de un rectángulo dada su base y su altura
import java.util.*;
class P_17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base, high, perimeter, area;
        System.out.println("===== RECTÁNGULO =====");
        System.out.println("¿Cúal es la base de tu rectángulo?");
        base = sc.nextFloat();
        System.out.println("¿Cúal es la altura de tu rectángulo?");
        high = sc.nextFloat();
        perimeter = (2 * (base) + 2 * (high));
        area = (base * high);
        System.out.println("El área de tu rectángulo es: " + area);
        System.out.println("El períemtro de tu rectangulo es: " + perimeter);
    }
}