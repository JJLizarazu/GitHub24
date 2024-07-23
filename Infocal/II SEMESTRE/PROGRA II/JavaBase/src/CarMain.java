import java.util.*;
public class CarMain {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        Car car1 = new Car();
        System.out.println("Ingrese el color del auto: ");
        System.out.print("-> "); car1.color = scc.nextLine();
        System.out.println("Ingrese la marca del auto: ");
        System.out.print("-> "); car1.brand = scc.nextLine();
        System.out.println("Ingrese el modelo del auto: ");
        System.out.print("-> "); car1.model = scc.nextLine();
        System.out.println("| - MARCA -");
        System.out.println("| " + car1.brand);
        System.out.println("| - MODELO -");
        System.out.println("| " + car1.model);
        System.out.println("| - COLOR -");
        System.out.println("| " + car1.color);
        Car.horn();
        Car.run();
    }
}
