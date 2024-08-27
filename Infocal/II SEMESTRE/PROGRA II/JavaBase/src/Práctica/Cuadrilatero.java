package Práctica;

public class Cuadrilatero {
    private float lado1 = 0, lado2 = 0;
    Cuadrilatero(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    Cuadrilatero(float lado1){
        this.lado1 = lado1;
    }

    private float getPerimetro(){
        if (lado2 == 0){
            return 4 * lado1;
        } else {
            return (2 * lado1) + (2 * lado2);
        }
    }

    private float getArea(){
        if (lado2 == 0){
            return lado1 * lado1;
        } else {
            return lado1 * lado2;
        }
    }

    public static void main(String[] args) {
        Cuadrilatero cuadrilatero1 = new Cuadrilatero(1.20F);
        System.out.println("El área es: " + cuadrilatero1.getArea() + " cm2");
        System.out.println("El perímetro es: " + cuadrilatero1.getPerimetro() + " cm");
    }
}
