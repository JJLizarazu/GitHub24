//  Dado el número de un mes, devolver el mes en letras invertidas ( Utiliza la condicional If)
import java.util.*;
class P_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.println("== MES INVERTIDO ==");
        System.out.println("Ingrese un número para compararlo con un mes: (1 - 12)");
        month = sc.nextInt();
        switch (month){
            case 1:
                System.out.println("ORENE");
                break;
            case 2:
                System.out.println("ORERBEF");
                break;
            case 3:
                System.out.println("OZRAM");
                break;
            case 4:
                System.out.println("LIBRA");
                break;
            case 5:
                System.out.println("OYAM");
                break;
            case 6:
                System.out.println("OINUJ");
                break;
            case 7:
                System.out.println("OILUJ");
                break;
            case 8:
                System.out.println("OTSOGA");
                break;
            case 9:
                System.out.println("ERBEMITPES");
                break;
            case 10:
                System.out.println("ERBUTCO");
                break;
            case 11:
                System.out.println("REBMEIVON");
                break;
            case 12:
                System.out.println("ERBMEICID");
                break;
        }
    }
}