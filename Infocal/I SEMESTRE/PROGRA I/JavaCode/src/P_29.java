import java.util.*;
class P_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // variable de lados
        float lenght1, lenght2, lenght3;
        System.out.println("== IDENTIFICADOR DE TRIÁNGULOS ==");
        System.out.println("Ingrese uno de los lados del tríangulo");
        lenght1 = sc.nextFloat();
        System.out.println("Ingrese uno de los lados del tríangulo");
        lenght2 = sc.nextFloat();
        System.out.println("Ingrese uno de los lados del tríangulo");
        lenght3 = sc.nextFloat();

        if (lenght1 < lenght2 + lenght3 && lenght1 > lenght2 - lenght3 && lenght2 < lenght1 + lenght3 && lenght2 > lenght1 - lenght3 && lenght3 < lenght1 + lenght2 && lenght3 > lenght1 - lenght2) {
            System.out.println("ES UN TRIÁNGULO");
        } else {
            System.out.println("NO ES UN TRIÁNGULO");
        }
    }
}