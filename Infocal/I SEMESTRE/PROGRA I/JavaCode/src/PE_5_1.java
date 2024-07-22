//  Escribe un programa que imprima la tabla de multiplicar de un número dado por el usuario usando un bucle for.
import java.util.*;
class PE_5_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== TABLA DE MULTIPLICAR 2.0 ====");
        System.out.println("Ingrese un número para determinar su tabla de multiplicar: ");
        System.out.print("-> "); int num = sc.nextInt();
        multiplyTable(num);
    }

    static void multiplyTable(int num){
        separators();
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println("    | " + num + " x " + i + " = " + (num * i) + " | ");
        }
        separators();
    }


    static void separators(){
        System.out.println("========================");
    }
}