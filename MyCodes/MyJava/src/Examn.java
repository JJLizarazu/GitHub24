import java.util.*;
class Examn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, z, t;
        int op;
        do {
            System.out.println("1.- Materia");
            System.out.println("2.- Salir");
            System.out.print("-> "); op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("Primer parcial");
                    System.out.print("-> "); x = sc.nextInt();
                    System.out.println("Segundo parcial");
                    System.out.print("-> "); y = sc.nextInt();
                    System.out.println("Tercer parcial");
                    System.out.print("-> "); z = sc.nextInt();
                    t = (x*0.30)+(y*0.30)+(z*0.40);
                    System.out.println("NOTA FINAL -> " + t);
                    break;
            }
        } while (op != 2);
    }
}