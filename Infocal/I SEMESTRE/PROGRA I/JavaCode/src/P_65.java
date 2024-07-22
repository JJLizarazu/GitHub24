//  Cree una matriz de de 4x4 que contengan puros 0, luego pida al usuario que ingrese un numero,
//  si el numero es par la matriz se volverá a llenar con puros números pares,
//  si el numero es impar la matriz se llenara de números impares.
import java.util.Scanner;
class P_65{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        array = new int[16];
        System.out.println("== MATRIZ DEPENDIENTE ==");

        // DAR EL VALOR DE "0" A TODA LA MATRIZ.

        for (int i = 0 ; i < 16 ; i++){
            array[i] = 0;
        }

        // MOSTRAR LA MATRIZ ACTUAL --> MATRIZ SOLO 0.

        System.out.println("=== MATRIZ ACTUAL ===");
        for (int i = 0 ; i < 16 ; i++){
            //  CUANDO LLEGUE A LA COLUMNA 4, DAR UN SALTO DE LÍNEA
            if ((i) % 4 == 0 || (i == 4)) {

                System.out.println(" ");
            }

            //  MOSTRAR EL ELEMENTO DE LA MATRIZ

            System.out.print(" | " + array[i] + " | ");

            // CUANDO LLEGUE AL ÚLTIMO ELEMENTO, DAR UN DOBLE SALTO DE LÍNEA

            if ((i + 1) % 16 == 0){
                System.out.println(" ");
                System.out.println(" ");
            }
        }

        //  INGRESAR UN NÚMERO PARA DETERMINAR LOS VALORES DE ESTE.

        System.out.println("Ingrese un número para determinar los valores de la matriz: ");
        System.out.print("-> "); int number = sc.nextInt();

        //  PAR = EL PRIMER ELEMENTO EMPEZARÁ DESDE EL NÚMERO DADO.

        if (number % 2 == 0){
            for (int pair = number ; pair <= (number + 30) ; pair += 2){
                for (int i = 0 ; i < 16 ; i++){
                    array[i] = pair;
                    pair += 2;
                }
            }

            // MOSTRAR LA MATRIZ PAR

            System.out.println("=== MATRIZ ACTUAL ===");
            for (int i = 0 ; i < 16 ; i++){
                if ((i) % 4 == 0 || (i == 4)) {
                    System.out.println(" ");
                }
                System.out.print(" | " + array[i] + " | ");
                if ((i + 1) % 16 == 0){
                    System.out.println(" ");
                }
            }
        }

        // IMPAR = EL PRIMER ELEMENTO EMPEZARÁ DESDE EL NÚMERO DADO.

        if (number % 2 != 0){
            for (int impair = number ; impair <= (number + 30) ; impair += 2){
                for (int i = 0 ; i < 16 ; i++){
                    array[i] = impair;
                    impair += 2;
                }
            }

            // MOSTRAR LA MATRIZ IMPAR

            System.out.println("=== MATRIZ ACTUAL ===");
            for (int i = 0 ; i < 16 ; i++){
                if ((i) % 4 == 0 || (i == 4)) {
                    System.out.println(" ");
                }
                System.out.print(" | " + array[i] + " | ");
                if ((i + 1) % 16 == 0){
                    System.out.println(" ");
                }
            }
        }
    }
}