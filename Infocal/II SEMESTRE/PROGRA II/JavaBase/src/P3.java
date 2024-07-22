import java.util.*;
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        dog dog1 = new dog();
        separators();
        System.out.println("INGRESE EL NOMBRE DEL PERRO:");
        System.out.print("-> "); dog1.nameDog = scc.nextLine();
        System.out.println("INGRESE LA RAZA DEL PERRO:");
        System.out.print("-> "); dog1.raceDog = scc.nextLine();
        System.out.println("INGRESE EL COLOR DEL PERRO:");
        System.out.print("-> "); dog1.colorDog = scc.nextLine();
        System.out.println("INGRESE EL TAMAÑO DEL PERRO:");
        System.out.print("-> "); dog1.sizeDog = scc.nextLine();
        System.out.println("INGRESE LA EDAD DEL PERRO:");
        System.out.print("-> "); dog1.ageDog = sc.nextInt();
        System.out.println(dog1.nameDog + dog1.raceDog + dog1.colorDog + dog1.sizeDog + dog1.ageDog);
    }
    public static class dog{
        String nameDog, raceDog, colorDog, sizeDog;
        int ageDog;
        public static void bark(){
            separators();
            System.out.println("---- ¡WOOF! ----");
            separators();
        }
    }
    public static void separators(){
        System.out.println("==========================");
    }
}
