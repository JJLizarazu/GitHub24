// Dado el número de un mes, devolver el mes en letras (Usar la estructura de control Múltiple SWITCH)
import java.util.*;
class P_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.println("= IDENTIFICADOR DE MES =");
        System.out.println("Ingrese un número para comparalo con un mes (1 - 12)");
        System.out.println("====================================================");
        month = sc.nextInt();
        switch (month){
            case 1 :
                System.out.println("ENERO");
                break;
            case 2 :
                System.out.println("FEBRERO");
                break;
            case 3 :
                System.out.println("MARZO");
                break;
            case 4 :
                System.out.println("ABRIL");
                break;
            case 5 :
                System.out.println("MAYO");
                break;
            case 6 :
                System.out.println("JUNIO");
                break;
            case 7 :
                System.out.println("JULIO");
                break;
            case 8 :
                System.out.println("AGOSTO");
                break;
            case 9 :
                System.out.println("SEPTIEMBRE");
                break;
            case 10 :
                System.out.println("OCTUBRE");
                break;
            case 11:
                System.out.println("NOVIEMBRE");
                break;
            case 12 :
                System.out.println("DICIEMBRE");
                break;
            default:
                System.out.println("ESE MES NO EXISTE");
        }
    }
}