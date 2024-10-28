package Ejercicio_Propuesto_8;
import org.w3c.dom.css.Rect;

import java.util.*;
public abstract class FigurasGeometricas {
    public abstract double CalcularArea();
    public abstract double CalcularPerimetro();
    public abstract void dataPrint();
}

abstract class Circulo extends FigurasGeometricas{

    int radius;
    Circulo(int radius){
        this.radius = radius;
    }
    public double CalcularPerimetro() {
        return 2*Math.PI*radius;
    }

    public double CalcularArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public void dataPrint(){
        System.out.println("--------- CIRCULO -----------");
        System.out.println("El perimetro es: " + CalcularPerimetro());
        System.out.println("El area es: " + CalcularArea());
        System.out.println();
    }
}
abstract class Rectangulo extends FigurasGeometricas{

    int base, high;
    Rectangulo(int base, int high){
        this.base = base;
        this.high = high;
    }
    public double CalcularArea(){
        return base * high;
    }
    public double CalcularPerimetro(){
        return (2* base) + (2 * high);
    }
    public void dataPrint(){
        System.out.println("--------- RECTANGULO -----------");
        System.out.println("El perimetro es: " + CalcularPerimetro());
        System.out.println("El area es: " + CalcularArea());
        System.out.println();
    }
}
abstract class Cuadrado extends FigurasGeometricas{
    int lado;
    Cuadrado(int lado){
        this.lado = lado;
    }
    public double CalcularArea(){
        return lado * lado;
    }

    public double CalcularPerimetro(){
        return lado * 4;
    }
    public void dataPrint(){
        System.out.println("------- CUADRADO ----------");
        System.out.println("El perimetro es: " + CalcularPerimetro());
        System.out.println("El area es: " + CalcularArea());
        System.out.println();
    }
}
abstract class Triangulo extends FigurasGeometricas{
    int base, high, lado1, lado2, lado3;
    Triangulo(int base, int high, int lado1, int lado2, int lado3){
        this.base = base;
        this.high = high;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public double CalcularArea(){
        return (base * high) / 2;
    }

    public double CalcularPerimetro(){
        return lado1 + lado2 + lado3;
    }
    public void dataPrint(){
        System.out.println("--------- TRIANGULO -----------");
        System.out.println("El perimetro es: " + CalcularPerimetro());
        System.out.println("El area es: " + CalcularArea());
        System.out.println();
    }
}

class TrianguloRectangulo extends Triangulo{
    int base, high, lado1, lado2, lado3;
    TrianguloRectangulo(int base, int high, int lado1, int lado2, int lado3){
        super(base, high, lado1, lado2, lado3);
    }

    @Override
    public double CalcularArea() {
        return 0;
    }

    @Override
    public double CalcularPerimetro() {
        return 0;
    }
    public void dataPrint(){
        System.out.println("-------- TRIANGULO RECTANGULO ---------");
        System.out.println("El perimetro es: " + CalcularPerimetro());
        System.out.println("El area es: " + CalcularArea());
        System.out.println();
    }
}
class Prueba{
    public static void main(String[] args) {
        Circulo cir1 = new Circulo(3) {
            @Override
            public double CalcularPerimetro() {
                return super.CalcularPerimetro();
            }

            @Override
            public double CalcularArea() {
                return super.CalcularArea();
            }
        };
        Cuadrado square1 = new Cuadrado(4) {
            @Override
            public double CalcularArea() {
                return super.CalcularArea();
            }

            @Override
            public double CalcularPerimetro() {
                return super.CalcularPerimetro();
            }
        };
        Rectangulo rc1 = new Rectangulo(4, 3) {
            @Override
            public double CalcularArea() {
                return super.CalcularArea();
            }

            @Override
            public double CalcularPerimetro() {
                return super.CalcularPerimetro();
            }
        };
        Triangulo tri1 = new Triangulo(2,5,2,5,7) {
            @Override
            public double CalcularArea() {
                return super.CalcularArea();
            }

            @Override
            public double CalcularPerimetro() {
                return super.CalcularPerimetro();
            }
        };
        TrianguloRectangulo trr1 = new TrianguloRectangulo(4,3,4,3,5);
        cir1.dataPrint();
        square1.dataPrint();
        rc1.dataPrint();
        tri1.dataPrint();
        trr1.dataPrint();
    }
}