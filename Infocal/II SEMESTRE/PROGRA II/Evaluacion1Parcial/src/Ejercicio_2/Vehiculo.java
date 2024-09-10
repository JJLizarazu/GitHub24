package Ejercicio_2;

public class Vehiculo {
    String marca, modelo; double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }

    public void dataPrint(){
        System.out.println("          ======================");
        System.out.println("          | MARCA | " + marca);
        System.out.println("          ======================");
        System.out.println("          | MODELO | " + modelo);
        System.out.println("          ======================");
        System.out.println("          | PRECIO | " + precio + "$");
        System.out.println("          ======================");
    }

}
