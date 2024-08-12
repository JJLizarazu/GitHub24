import java.util.*;

public class CarreraCaballos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        Random random = new Random();

        final int goal = 20;
        int[] positions = {0, 0, 0, 0};
        String[] horsesName = {"GUARÚ CA2" +
                "BRIOLO", "SARITA", "CHIQUITO", "CORNET"};

        while (true) {
            System.out.println("   |-------------------------------|");
            System.out.println("   |              MENÚ             |");
            System.out.println("   |-------------------------------|");
            System.out.println("   | 1 | APUESTA INDIVIDUAL        |");
            System.out.println("   | 2 | APUESTA ENTRE 2 PERSONAS  |");
            System.out.println("   | 3 | APUESTA ENTRE 3 PERSONAS  |");
            System.out.println("   | 4 | APUESTA ENTRE 4 PERSONAS  |");
            System.out.println("   | 5 | SALIR                     |");
            System.out.println("   |-------------------------------|");
            System.out.print("   | SELECCIONA UNA OPCIÓN: ");
            int option = sc.nextInt();
            System.out.println("   |-------------------------------|");
            System.out.println(" ");

            if (option == 5) {
                System.out.println("   |-------------------------------|");
                System.out.println("   |      SALIENDO DEL JUEGO...    |");
                System.out.println("   |-------------------------------|");
                break;
            }

            if (option < 1 || option > 5) {
                System.out.println("OPCIÓN NO VALIDA, INGRESE UN NÚMERO ENTRE 1 - 5");
                System.out.println(" ");
                continue;
            }

            String[] playersName = new String[option];
            int[] bets = new int[option];
            boolean[] chosenHorses = new boolean[4];
            for (int i = 0; i < option; i++) {
                System.out.println("   |------------------------------------|");
                System.out.print("   | Jugador " + (i + 1) + ", ¿cuál es tu nombre?: ");
                playersName[i] = scc.nextLine();

                while (true) {
                    System.out.println("   |-----------------------------------------------------|");
                    System.out.println("   | " + playersName[i] + ", ¿A cuál de estos cuatro caballos quieres apostar?");
                    System.out.println("   |--------------------|");
                    System.out.println("   | 1 |    " + horsesName[0]);
                    System.out.println("   | 2 |    " + horsesName[1]);
                    System.out.println("   | 3 |    " + horsesName[2]);
                    System.out.println("   | 4 |    " + horsesName[3]);
                    System.out.println("   |--------------------|");
                    System.out.print("   | -> "); int bet = sc.nextInt();
                    System.out.println(" ");
                    if (bet < 1 || bet > 4) {
                        System.out.println("Selección no válida. Debes elegir entre 1 y 4.");
                    } else if (chosenHorses[bet - 1]) {
                        System.out.println("Ese caballo ya ha sido elegido. Elige otro.");
                    } else {
                        bets[i] = bet;
                        chosenHorses[bet - 1] = true;
                        break;
                    }
                }
            }
            // https://chat.whatsapp.com/LJ6caSl7lBy8nCtLj5w3Wz
            positions = new int[]{0, 0, 0, 0};
            boolean endRace = false;
            while (!endRace) {
                for (int i = 0; i < 4; i++) {
                    System.out.print(" | " + (i + 1) + " | ");
                    for (int j = 0; j < positions[i]; j++) {
                        System.out.print("-");
                    }
                    System.out.print("🏇");
                    for (int j = positions[i]; j < goal; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("|| " + horsesName[i]);
                }
                System.out.println("\n");

                for (int i = 0; i < 4; i++) {
                    positions[i] += random.nextInt(3);
                    if (positions[i] >= goal) {
                        endRace = true;
                    }
                }

                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            int positionWinner = 1000;
            for (int i = 0; i < 4; i++) {
                if (positions[i] >= goal) {
                    positionWinner = i;
                    break;
                }
            }

            for (int i = 0; i < 4; i++) {
                System.out.print((i + 1) + ". ");
                for (int j = 0; j < positions[i]; j++) {
                    System.out.print("-");
                }
                System.out.print("🏇");
                for (int j = positions[i]; j < goal; j++) {
                    System.out.print(" ");
                }
                System.out.println("||");
            }
            System.out.println(" ");

            System.out.println("GANÓ EL CABALLO " + horsesName[positionWinner]);

            for (int i = 0; i < option; i++) {
                if (bets[i] == positionWinner + 1) {
                    System.out.println("¡" + playersName[i] + " ganó la apuesta con el Caballo " + horsesName[i + 1] + "!");
                }
            }

        }
    }
}
