// Hallar el Área y el perímetro un de un Cuadrado, cree un procedimiento para realizar de dicha tarea.
//Perimetro = 4*L
//Area= L2
import java.util.*;
class P_67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE UN LADO:");
        int lenght = sc.nextInt();
        perimeter(lenght);
        System.out.println("El área es: " + area(lenght));
    }

    static void perimeter(int lenght) {
        System.out.println("El perimetro es: " + 4 * lenght);
    }

    static int area(int lenght) {
        int area = lenght * lenght;
        return area;
    }

}