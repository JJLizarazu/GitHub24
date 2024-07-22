//  Pide al usuario que introduzca una contraseña.
//  Utiliza un ciclo do while para permitirle intentarlo varias veces hasta que ingrese la contraseña correcta.
import java.util.*;
class P_51 {
    public static void main(String[] args) {
        System.out.println("=====    INICIO DE SESIÓN    =====");
        String password, passwordTester;
        Scanner scc = new Scanner(System.in);
        System.out.println("--> CREA UNA CONTRASEÑA NUEVA <--");
        System.out.print(": "); password = scc.nextLine();
        do {
            System.out.println("===========================================");
            System.out.println("Ingrese la contraseña recientemente creada: ");
            System.out.print(": "); passwordTester = scc.nextLine();
            System.out.println("===========================================");
            if (!password.equals(passwordTester)){
                System.out.println("Contraseña incorrecta, inténtelo de nuevo");
            }
        } while (!password.equals(passwordTester));
        System.out.println("     ¡CONTRASEÑA CORRECTA, BIENVENIDO!");
        System.out.println("============================================");
    }
}