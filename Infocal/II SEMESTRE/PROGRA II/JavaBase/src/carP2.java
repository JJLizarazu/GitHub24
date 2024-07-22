import java.util.*;
public class carP2 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        car car1 = new car();
        perro.separators();
        System.out.println("Ingrese el color del auto: ");
        System.out.print("-> "); car1.color = scc.nextLine();
        System.out.println("Ingrese la marca del auto: ");
        System.out.print("-> "); car1.brand = scc.nextLine();
        System.out.println("Ingrese el modelo del auto: ");
        System.out.print("-> "); car1.model = scc.nextLine();
        perro.separators();
        System.out.println("| - MARCA -");
        System.out.println("| " + car1.brand);
        System.out.println("| - MODELO -");
        System.out.println("| " + car1.model);
        System.out.println("| - COLOR -");
        System.out.println("| " + car1.color);
        car.horn();
        car.run();
    }
}
