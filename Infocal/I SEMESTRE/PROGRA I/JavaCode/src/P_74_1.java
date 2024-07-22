//  Ejercicio de promedio de números: Escribe una función que tome un arreglo de números como parámetro y devuelva su promedio.
import java.util.*;
class P_74_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== PROMEDIO EN ARREGLO ======");
        int a[] = {1, 2, 3};
        System.out.println(promedio(a));
    }

    static float promedio(int a[]){
        float p = 0;
        for (int i = 0 ; i < a.length ; i++){
            p += a[i];
        }
        return (p/a.length);
    }

}