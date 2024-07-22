import java.util.*;
class P_51_1{
    public static void main(String[] args) {
        int attempts = 3;
        String user, password, passwordTester;
        Scanner sc = new Scanner(System.in);
        System.out.println("==== INICIO DE SESIÓN ====");
        System.out.println("USUARIO ==================");
        System.out.print(": "); user = sc.nextLine();
        System.out.println("CONTRASEÑA ===============");
        System.out.print(": "); password = sc.nextLine();
        do {
            System.out.println("=====================================================");
            System.out.println(user + ", Ingrese la contraseña recientemente creada: ");
            System.out.print(": "); passwordTester = sc.nextLine();
            if (!passwordTester.equals(password)){
                System.out.println("La contraseña es incorrecta, vuelve a intentarlo.");
                System.out.println("=====  INTENTOS RESTANTES: " + attempts + " =====");
                attempts--;
            } else if (passwordTester.equals(password)) {
                attempts = -1;
            }
        } while (attempts >= 0);

        if (passwordTester.equals(password)){
            System.out.println("=======================================");
            System.out.println("       ¡CONTRASEÑA CORRECTA!           ");
            System.out.println("       ¡BIENVENIDO " + user + "!      ");
            System.out.println("=======================================");
        } else if (attempts < 0){
            System.out.println("Se acabaron los intentos, vuelva a intentarlo más tarde.");
        }
    }
}