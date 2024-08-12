import java.util.*;
class Examn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, z, t, c ,d;
        int op, op2;
        do {
            System.out.println("1.- Materia");
            System.out.println("2.- Salir");
            System.out.print("-> "); op = sc.nextInt();
            System.out.println(" ");
            switch (op){
                case 1:
                    System.out.println("1.- BIOLOGÍA / E.A.");
                    System.out.println("2.- A-A / G-T / Q / F");
                    System.out.print("-> "); op2 = sc.nextInt();
                    System.out.println(" ");
                    switch (op2){
                        case 1:
                            System.out.println("Primer parcial");
                            System.out.print("-> "); x = sc.nextInt();
                            System.out.println("Segundo parcial");
                            System.out.print("-> "); y = sc.nextInt();
                            System.out.println(" ");
                            z = (x * 0.30) + (y * 0.30);
                            t = 551 - z;
                            d = 0;
                            for (int i = 0 ; i < 10 ; i++){
                                if (((i * 10) * 0.40) >= t){
                                    d = i;
                                    break;
                                }
                            }
                            c = (int) (z + (d * 10) * 0.40);
                            System.out.println("SE NECESITAN -> " + d + " <- PREGUNTAS PARA PASAR CON: -> " + c + " <- de nota final");
                            System.out.println(" ");
                            System.out.println(" ");
                            break; // case 1.1
                        case 2:
                            System.out.println("Primer parcial");
                            System.out.print("-> "); x = sc.nextInt();
                            System.out.println("Segundo parcial");
                            System.out.print("-> "); y = sc.nextInt();
                            System.out.println(" ");
                            z = (x * 0.30) + (y * 0.30);
                            t = 51 - z;
                            d = 0;
                            for (int i = 0 ; i < 5 ; i++){
                                if (((i * 20) * 0.40) >= t){
                                    d = i;
                                    break; // for - if
                                }
                            }
                            c = (int) (z + ((d * 20) * 0.40));
                            System.out.println("SE NECESITAN -> " + d + " <- PREGUNTAS PARA PASAR CON: -> " + c + " <- de nota final");
                            System.out.println(" ");
                            System.out.println(" ");
                            break; // case 2.1
                    }
                    break; // case 1
            }
        } while (op != 2);
    }
}