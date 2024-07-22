//  ingrese 6 nombres en una matriz de 3X3, luego realice una búsqueda de algún nombre para saber si hay ese nombre en la matriz o no.
import java.util.*;
class P_64{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        String searchName;
        System.out.println("== NOMBRES EN MATRIZ ==");
        String[] array;
        array = new String[9];
        System.out.println("INGRESE 6 NOMBRES EN LA MATRIZ");
        for (int i = 0 ; i < 9 ; i++){
            System.out.println("Ingrese el " + (i + 1) + "° nombre");
            array[i] = sc.nextLine();
        }
        System.out.println(" ");
        System.out.println("==============================================");
        System.out.println("Ingrese un número para buscarlo en la matriz: ");
        System.out.print("--> "); searchName = sc.nextLine();

        for (int i = 0 ; i < 9 ; i++){
            if (searchName.equals(array[i])){
                answer++;
            }
        }

        if (answer >= 1){
            System.out.println("EL NOMBRE " + searchName + " SI EXISTE EN LA MATRIZ");
        } else {
            System.out.println("ESE NOMBRE NO EXISTE EN LA MATRIZ");
        }
    }
}