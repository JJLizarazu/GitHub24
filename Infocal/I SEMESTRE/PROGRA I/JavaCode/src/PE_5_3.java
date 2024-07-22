//  Pide al usuario que introduzca una contraseña, Validando que contenga una mayúscula, una minúscula y un numero.
//  Utiliza un ciclo do while para permitirle intentarlo varias veces hasta que ingrese el numero correcto.
import java.util.*;
class PE_5_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========== CONTRASEÑA ==========");
        passwordLogin();
    }

    static void passwordLogin(){
        Scanner sc = new Scanner(System.in);
        String password;
        do {
            separators();
            System.out.println("Introduce una contraseña la cual debe contener");
            System.out.println("--> MÍNIMO UNA MAYÚSCULA");
            System.out.println("--> MÍNIMO UNA MINÚSCULA");
            separators();
            System.out.print(":"); password = sc.nextLine();
            if (nPassword(password)){
                separators();
                System.out.println("Contraseña inválida, inténtelo de nuevo.");
                separators();
            }
        } while(nPassword(password));
        String newPassword = password;
        separators();
        System.out.println("Contraseña válida");
        separators();
        passwordTesterFunction(newPassword);
    }


    static boolean nPassword(String password){
        String mayPassword;
        String minPassword;
        String passwordChar;
        int letters = password.length();
        int auxMay = 0, auxMin = 0;
        for (int i = 0 ; i < letters; i++){
            mayPassword = String.valueOf(password.charAt(i));
            minPassword = String.valueOf(password.charAt(i));
            passwordChar = String.valueOf(password.charAt(i));
            if (passwordChar.equals(mayPassword.toUpperCase())){
                auxMay++;
            } else if (passwordChar.equals(minPassword.toLowerCase())) {
                auxMin++;
            }
        }

        boolean value = false;

        if (auxMay >= 1 && auxMin >= 1){
            value = true;
        }
        return !value;
    }

    static void passwordTesterFunction(String newPassword){
        separators();
        System.out.println("=====    INICIO DE SESIÓN    =====");
        Scanner sc = new Scanner(System.in);
        String passwordTester;
        do {
            separators();
            System.out.println("Ingrese la contraseña recientemente creada: ");
            System.out.print(": "); passwordTester = sc.nextLine();
            separators();
            if (!newPassword.equals(passwordTester)){
                System.out.println("Contraseña incorrecta, inténtelo de nuevo");
            }
        } while (!newPassword.equals(passwordTester));
        System.out.println("     ¡CONTRASEÑA CORRECTA, BIENVENIDO!");
        separators();
    }

    public static void separators(){
        System.out.println("===============================================");
    }

}
