package Ejercicio_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ssc = new Scanner(System.in);
        int quantity;
        //
        Resources.cleanScreen();
        Resources.menu(); quantity = sc.nextInt();
        Vehiculo[] vehiculos = new Vehiculo[quantity];

        String marca, modelo; double precio;
        for (int i = 0 ; i < vehiculos.length ; i++){
            Resources.cleanScreen();
            System.out.println("============================");
            System.out.println("|         VEHÍCULO " + (i + 1) + "      |");
            System.out.println("============================");
            System.out.print("| Marca : "); marca = ssc.nextLine();
            System.out.println("============================");
            System.out.print("| Modelo : "); modelo = ssc.nextLine();
            System.out.println("============================");
            System.out.print("| Precio: "); precio = sc.nextDouble();
            System.out.println("============================");
            Vehiculo vehiculo = new Vehiculo(marca, modelo, precio);
            vehiculos[i] = vehiculo;
        }

        Resources.cleanScreen();
        for (int i = 0 ; i < vehiculos.length ; i++){
            vehiculos[i].dataPrint();
        }
        Resources.separators();
        Resources.lessPrice();
        for (int i = 0 ; i < vehiculos.length ; i++){
            if (vehiculos[i].getPrecio() < 4000 && vehiculos[i].getPrecio() > 2500){
                vehiculos[i].dataPrint();
            }
        }

    }
}

class Resources{

    protected static void separators(){
        System.out.println(" ");
        System.out.println("          ===============================================");
        System.out.println("          ===============================================");
        System.out.println(" ");
    }

    protected static void cleanScreen(){
        for (int i = 0 ; i < 50 ; i++){
            System.out.println(" ");
        }
    }
    protected static void menu(){
        System.out.println("          ================================================");
        System.out.println("          |               V E H I C U L O S              |");
        System.out.println("          ================================================");
        System.out.println("          |Ingrese la cantidad de vehículos a registrar: |");
        System.out.println("          ================================================");
        System.out.print("          | -> ");
    }

    protected static void lessPrice(){
        System.out.println("          ================================");
        System.out.println("          | VEHÍCULO ENTRE 2500$ & 4000$ |");
        System.out.println("          ================================");
    }
}
