package Práctica;
import java.util.*;
public class Vehiculo {
    public  String marca;
    public  String modelo; public float precio;

    Vehiculo(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    private float getPrecio() {
        return precio;
    }
    public  void dataDisplay(){
        System.out.println("Marca del auto: " + marca);
        System.out.println("Modelo del auto: " + modelo);
        System.out.println("Precio del auto: " + precio);
    }

    public static void main(String[] args) {
        int registerCars = 0;
        String marca, modelo; float precio;
        Scanner sc = new Scanner(System.in); // Int, Float Scanner
        Scanner ssc = new Scanner(System.in); // String Scanner
        Resources.clearScreen();
        Resources.separators();
        System.out.println("¿Cúantos autos desea ingresar?"); registerCars = sc.nextInt();
        Vehiculo[] vehiculos = new Vehiculo[registerCars];
        for (int i = 0 ; i < vehiculos.length ; i++){
            Resources.clearScreen();
            Resources.separators();
            System.out.println("Marca del auto " + (i + 1) + ": "); marca = ssc.nextLine();
            Resources.separators();
            System.out.println("Modelo del auto " + (i + 1) + ": "); modelo = ssc.nextLine();
            Resources.separators();
            System.out.println("Precio del auto " + (i + 1) + ": "); precio = sc.nextFloat();
            Resources.separators();
            vehiculos[i] = new Vehiculo(marca, modelo, precio);
        }

        int indexCar = 0;
        float cheaperCar = 10000000;
        for (int i = 0 ; i < vehiculos.length ; i++){
            if (vehiculos[i].getPrecio() < cheaperCar){
                cheaperCar = vehiculos[i].getPrecio();
                indexCar = i;
            }
        }

        Resources.clearScreen();
        Resources.separators();
        System.out.println("| El más barato es |");
        vehiculos[indexCar].dataDisplay();
        Resources.separators();



    }

}

class Resources{
    public static void separators(){
        System.out.println("===============================");
    }
    public static void clearScreen(){
        for (int i = 0 ; i < 50 ; i++){
            System.out.println(" ");
        }
    }
}
