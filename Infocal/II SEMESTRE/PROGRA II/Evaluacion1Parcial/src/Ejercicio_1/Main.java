package Ejercicio_1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ssc = new Scanner(System.in);
        int quantity;
        //
        Resources.cleanScreen();
        Resources.menu(); quantity = sc.nextInt();
        //
        Empleado[] empleados = new Empleado[quantity];
        //
        String nombre; int edad; double salario;
        for (int i = 0 ; i < empleados.length ; i++){
            Resources.cleanScreen();
            System.out.println("         ================================");
            System.out.println("         |      E M P L E A D O  - " + (i + 1) + " |");
            System.out.println("         ================================");
            System.out.print("         | Introduzca su nombre: "); nombre = ssc.nextLine();
            System.out.println("         ================================");
            System.out.print("         | Introduzca su edad: "); edad = sc.nextInt();
            System.out.println("         ================================");
            System.out.print("         | Introduzca su salario: "); salario = sc.nextDouble();
            Empleado empleado = new Empleado(nombre, edad, salario);
            empleados[i] = empleado;
        }

        Resources.cleanScreen();
        dataPrint();
        for (int i = 0 ; i < empleados.length ; i++){
            System.out.println(" ");
            System.out.println("===================================");
            System.out.println("Nombre: " + empleados[i].nombre);
            System.out.println("Edad: " + empleados[i].edad);
            System.out.println("Salario: " + empleados[i].getSalario());
            System.out.println("Nuevo Salario: " + empleados[i].aplicarAumento(empleados[i].getSalario()));
        }

    }

    private static void dataPrint(){
        System.out.println("         ===================================================");
        System.out.println("         |                E M P L E A D O S                |");
        System.out.println("         ===================================================");
        System.out.println("         |            CON SALARIOS ACTUALIZADOS            |");
        System.out.println("         ===================================================");
    }

}

class Resources{

    protected static void cleanScreen(){
        for (int i = 0 ; i < 50 ; i++){
            System.out.println(" ");
        }
    }
    protected static void menu(){
        System.out.println("         ===================================================");
        System.out.println("         |                E M P L E A D O S                |");
        System.out.println("         ===================================================");
        System.out.println("         | Introduzca la cantidad de empleados a registrar:|");
        System.out.print("         ->");
    }

}
