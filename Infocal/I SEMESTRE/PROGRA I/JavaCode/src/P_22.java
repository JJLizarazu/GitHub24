// Realice Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto deberá pagar
// finalmente por su compra
import java.util.*;
class P_22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== TIENDA ====");
        System.out.println("¿Cúanto cuesta el artículo?");
        float cost = sc.nextFloat();
        double discount = (cost - (cost * 0.15));
        System.out.println("El precio final es de: " + discount);
    }
}