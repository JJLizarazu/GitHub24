import java.util.*;
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        int age; String name;
        System.out.println("Ingrese su nombre");
        System.out.print("-> "); name = scc.nextLine();
        System.out.println("Ingrese su edad");
        System.out.print("-> "); age = sc.nextInt();
        Person person1 = new Person(name, age);
        System.out.println("Nombre: " + person1.name);
        System.out.println("Edad: " + person1.age);
        // person1.ageVerify();
        Person.ageVerify(age);
    }
}
