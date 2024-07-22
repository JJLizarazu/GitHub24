import java.util.*;
class P_51_2{
    public static void main(String[] args) {
        int Attempts = 3, i;
        String User, Password, PasswordTester;
        Scanner sc = new Scanner(System.in);
        System.out.println("==== INICIO DE SESIÓN ====");
        System.out.println("USUARIO ==================");
        System.out.print(": "); User = sc.nextLine();
        System.out.println("CONTRASEÑA ===============");
        System.out.print(": "); Password = sc.nextLine();
        do {
            System.out.println("=====================================================");
            System.out.println(User + ", Ingrese la contraseña recientemente creada: ");
            System.out.print(": "); PasswordTester = sc.nextLine();
            if (!PasswordTester.equals(Password)){
                System.out.println("La contraseña es incorrecta, vuelve a intentarlo.");
                System.out.println("=====  INTENTOS RESTANTES: " + Attempts + " =====");
                Attempts--;
            } else if (PasswordTester.equals(Password)) {
                Attempts = -1;
            }
        } while (Attempts >= 0);
        if (PasswordTester.equals(Password)){
            System.out.println("=======================================");
            System.out.println("       ¡CONTRASEÑA CORRECTA!           ");
            System.out.println("       ¡BIENVENIDO " + User + "!      ");
            System.out.println("=======================================");
        } else if (Attempts < 0){
            System.out.println("Se acabaron los intentos, vuelva a intentarlo más tarde.");
        }
    }
}