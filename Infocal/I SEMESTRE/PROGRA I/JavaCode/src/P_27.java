//  Convertir grados sexagesimales a centesimales.
import java.util.*;
class P_27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sexag, cente;
        System.out.println("====        CONVERSOR       ====");
        System.out.println("= sexagESIMALES A centeSIMALES =");
        System.out.println("Ingrese los grados sexagesimales a convertir: ");
        System.out.println("-> "); sexag = sc.nextFloat();
        cente = (sexag / 360) * 100;
        System.out.println(sexag + "° en grados centesimales es: " + cente + "°.");
    }
}