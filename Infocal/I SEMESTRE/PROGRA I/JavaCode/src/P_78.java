//  Ejercicio de cálculo de área: Escribe una función que tome las medidas de la base y la altura de un triángulo
//  como parámetros y devuelva su área. La fórmula para calcular el área de un triángulo es: Área = (base * altura) / 2.
import java.util.Scanner;
class P_78{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== ÁREA DEL TRIÁNGULO ====");
        System.out.println("Ingrese la base del triángulo: ");
        System.out.print("-> "); int base = sc.nextInt();
        separators();
        System.out.println("Ingrese la altura del triángulo: ");
        System.out.print("-> "); int high = sc.nextInt();
        separators();
        System.out.println("El área del triángulo es: " + triangleArea(base, high));
        separators();
    }

    static int triangleArea(int base, int high){
        int totalArea;
        totalArea = (base * high) / 2;
        return totalArea;
    }

    public static void separators(){
        System.out.println("==============================");
    }

}
