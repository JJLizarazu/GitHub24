//  Dada una cantidad de horas obtener su equivalente en minutos y segundos.
import java.util.*;
class P_26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float hours, minutes, seconds;
        System.out.println("===== CONVERSOR DE HORAS =====");
        System.out.println("Ingrese una cantidad de horas para convertirlas en minutos y segundos: ");
        System.out.println("--> "); hours = sc.nextFloat();
        minutes = hours * 60;
        seconds = minutes * 60;
        System.out.println("En " + hours + " horas, hay: ");
        System.out.println(minutes + " minutos.");
        System.out.println(seconds + " segundos.");
    }
}