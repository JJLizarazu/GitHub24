// PROGRAMACIÓN ORIENTADA A OBJETOS
// -> CLASE
// - Persona -
// -> ATRIBUTOS
// - Nombre -
// - Edad -
// -> MÉTODOS
// - Caminar -
// - Saludar -
import java.util.*;
public class testMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        test testPerson_1 = new test();
        System.out.println("====================");
        System.out.println("Ingrese el nombre de la persona:");
        testPerson_1.name = sc.nextLine();
        System.out.println("====================");
        System.out.println("Ingrese la edad de la persona:");
        testPerson_1.age = sc.nextInt();
        System.out.println("====================");
        System.out.println(testPerson_1.name);
        System.out.println(testPerson_1.age);
        System.out.println("====================");
        test.sayHi();
        System.out.println("====================");
    }
}