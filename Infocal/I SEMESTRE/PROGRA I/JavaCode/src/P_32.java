//  Lea un número del 1al 7 y devuelva el día de la semana, considere que 1es Domingo. 
import java.util.*;
class P_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week;
        System.out.println("= IDENTIFICADOR DE SEMANA =");
        System.out.println("Ingrese un número para ser comparado con una semana (1 - 7) ");
        week = sc.nextInt();
        switch (week){
            case 1 :
                System.out.println("DOMINGO");
                break;
            case 2 :
                System.out.println("LUNES");
                break;
            case 3 :
                System.out.println("MARTES");
                break;
            case 4 :
                System.out.println("MIÉRCOLES");
                break;
            case 5 :
                System.out.println("JUEVES");
                break;
            case 6 :
                System.out.println("VIERNES");
                break;
            case 7 :
                System.out.println("SÁBADO");
                break;
            default:
                System.out.println("ESE DÍA DE LA SEMANA NO EXISTE");
        }
    }
}