import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado_alternative{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("=== A H O R C A D O ===");
        System.out.println("=======================");
        // TIENES 6 INTENTOS PARA ADIVINAR LA PALABRA
        // =========================
        //    ELEGIR LA PALABRA
        // INTRODUCE AQUI LA PALABRA
        //  (May ó min no importa)
        // =========================
        String word = "Infocal";
        // =========================

        // ===========================================================================================
        int attempt = 0, MAX_ATTEMPTS = 6, points = 0; // INTENTOS, NR. MAXIMO DE INTENTOS, AUXILIAR DE VOCALES ENCONTRADAS
        String userGuess; // VOCAL QUE INTRODUCE EL USUARIO
        String[] hint = new String[word.length()]; // PARA MOSTRAR LETRAS ENCONTRADAS/ FALTANTES
        Arrays.fill(hint, "_");
        // ===========================================================================================

        // ===========================================================================================
        // OBTENER INFO DE LA PALABRA COMO CONJUNTO (STRING) / MATRIZ DE POSICIONES DE CADA LETRA
        // ==============================================================
        String lettersSet = obtainLetterSet(word); // ALMACENA EL CONJUNTO DE LETRAS
        int[][] positions = obtainPositionsOfLetters(word, lettersSet); // ALMACENAR LAS POSICIONES DE LAS VOCALES
        // ===========================================================================================

        //===============================
        // WHILE
        //===============================
        while (attempt < MAX_ATTEMPTS && points < lettersSet.length()) {
            // =================================
            // MOSTRAR EL AHORCADO
            // =================================
            System.out.println(attempts[attempt]);


            // ===========================================
            //             PISTAS DE LA PALABRA
            //hintsOfWord(vowelOfWordFinded, numberOfVowels);
            System.out.println(String.join(" ", hint));
            // ===========================================
            spaces();

            // ========================
            //   INTETOS RESTANTES
            remainingAttempts(attempt);
            spaces();
            // ========================

            // ====================================
            //         INGRESE UNA LETRA
            // ====================================
            System.out.print("Ingrese una letra: ");
            userGuess = sc.nextLine();
            if (userGuess.length() != 1 || userGuess.matches("\\d")) {
                System.out.println("Valor invalido, debes ingresar una sola letra.");
                continue;
            }
            userGuess = userGuess.toLowerCase(); //vowelUpperCase = vowel.toUpperCase();
            // ====================================
            spaces();

            // ============================================================
            // VERIFICAR SI EL USUARIO ADIVINA UNA VOCAL DEL CONJUNTO
            //       AUMENTAR LOS INTENTOS EN CASO DE NO SER ASI
            //       AUMENTAR LOS PUNTOS EN CASO DE SER ASI
            // ============================================================
            int letterIndex = userGuess.isEmpty() ? -1 : lettersSet.toLowerCase().indexOf(userGuess);
            if (letterIndex != -1) {
                for (int pos : positions[letterIndex]) {
                    hint[pos] = userGuess;// String.valueOf(conjunto.charAt(letterIndex)); //
                }
                points++;
            } else {
                System.out.println("Esa letra no pertenece a la palabra.");
                attempt++;
            }
        }
        // ============================================================

        // ==============================
        //  MENSAJE DE GANADO O PERDIDO
        // ==============================
        System.out.printf(attempt < 6 ? ganaste : perdiste, word);
        // ==============================
    }

    public static String obtainLetterSet(String word) {
        // System.out.println("WORD: " + word);
        StringBuilder letterSet = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (letterSet.indexOf(String.valueOf(word.charAt(i))) == -1) {
                letterSet.append(word.charAt(i));
            }
        }
        // System.out.println("letterSEt: " + letterSet);
        return letterSet.toString();
    }

    public static int[][] obtainPositionsOfLetters(String word, String letterSet) {
        String[] letterPositionsStr = new String[letterSet.length()];
        Arrays.fill(letterPositionsStr, "");
        for (int letter = 0; letter < word.length(); letter++) {
            letterPositionsStr[letterSet.indexOf(word.charAt(letter))] += letter + " ";
        }
        // Arrays.asList(letterPositionsStr).forEach(System.out::println);
        int[][] positions = new int[letterSet.length()][];
        for (int letter = 0; letter < letterSet.length(); letter++) {
            String[] posicionesStr = letterPositionsStr[letter].split(" ");
            positions[letter] = new int[posicionesStr.length];
            int i = 0;
            for (String posStr : posicionesStr) {
                positions[letter][i++] = Integer.parseInt(posStr);
            }
        }
        // System.out.println("++++++++++++\n" + Arrays.deepToString(positions) + "\n++++++++++++");
        return positions;
    }

    static void spaces() {
        System.out.println(" ");
        System.out.println(" ");
    }

    static void remainingAttempts(int attempt) {
        System.out.println("INTENTOS RESTANTE -> " + (6 - attempt));
    }

    static String attemp0 = " _________" +
            System.lineSeparator() + " |" +
            System.lineSeparator() + " |" +
            System.lineSeparator() + " |" +
            System.lineSeparator() + " |" +
            System.lineSeparator() + " |" +
            System.lineSeparator() + " |" +
            System.lineSeparator() + " |" +
            System.lineSeparator() + " |" +
            System.lineSeparator() + " |" +
            System.lineSeparator() + " |" +
            System.lineSeparator() + "----" +
            System.lineSeparator() + " " +
            System.lineSeparator();

    static String attemp1 =
            " _________" +
                    System.lineSeparator() + " |      ¡" +
                    System.lineSeparator() + " |    -----" +
                    System.lineSeparator() + " |   | o o |" +
                    System.lineSeparator() + " |    --~--" +
                    System.lineSeparator() + " |" +
                    System.lineSeparator() + " |" +
                    System.lineSeparator() + " |" +
                    System.lineSeparator() + " |" +
                    System.lineSeparator() + " |" +
                    System.lineSeparator() + " |" +
                    System.lineSeparator() + "----" +
                    System.lineSeparator() + " " + System.lineSeparator();

    static String attemp2 =
            " _________" +
                    System.lineSeparator() + " |      ¡" +
                    System.lineSeparator() + " |    -----" +
                    System.lineSeparator() + " |   | o o |" +
                    System.lineSeparator() + " |    --~--" +
                    System.lineSeparator() + " |      |" +
                    System.lineSeparator() + " |      |" +
                    System.lineSeparator() + " |      |" +
                    System.lineSeparator() + " |" +
                    System.lineSeparator() + " |" +
                    System.lineSeparator() + " |" +
                    System.lineSeparator() + "----" +
                    System.lineSeparator() + " " + System.lineSeparator();

    static String attemp3 =
            " _________" +
                    System.lineSeparator() + " |      ¡" +
                    System.lineSeparator() + " |    -----" +
                    System.lineSeparator() + " |   | o o |" +
                    System.lineSeparator() + " |    --~--" +
                    System.lineSeparator() + " |      |" +
                    System.lineSeparator() + " |      |" +
                    System.lineSeparator() + " |      |" +
                    System.lineSeparator() + " |     /" +
                    System.lineSeparator() + " |    /" +
                    System.lineSeparator() + " |   /" +
                    System.lineSeparator() + "----" +
                    System.lineSeparator() + " " + System.lineSeparator();

    static String attemp4 =
            " _________" +
                    System.lineSeparator() + " |      ¡" +
                    System.lineSeparator() + " |    -----" +
                    System.lineSeparator() + " |   | o o |" +
                    System.lineSeparator() + " |    --~--" +
                    System.lineSeparator() + " |      |" +
                    System.lineSeparator() + " |      |" +
                    System.lineSeparator() + " |      |" +
                    System.lineSeparator() + " |     / \\" +
                    System.lineSeparator() + " |    /   \\" +
                    System.lineSeparator() + " |   /     \\" +
                    System.lineSeparator() + "----" +
                    System.lineSeparator() + " " + System.lineSeparator();

    static String attempt5 =
            " _________" +
                    System.lineSeparator() + " |      ¡" +
                    System.lineSeparator() + " |    -----" +
                    System.lineSeparator() + " |   | o o |" +
                    System.lineSeparator() + " |    --~--" +
                    System.lineSeparator() + " |     /|" +
                    System.lineSeparator() + " |    / |" +
                    System.lineSeparator() + " |   /  |" +
                    System.lineSeparator() + " |     / \\" +
                    System.lineSeparator() + " |    /   \\" +
                    System.lineSeparator() + " |   /     \\" +
                    System.lineSeparator() + "----" +
                    System.lineSeparator() + " " + System.lineSeparator();

    static String attempt6 =
            " _________" +
                    System.lineSeparator() + " |      ¡" +
                    System.lineSeparator() + " |    -----" +
                    System.lineSeparator() + " |   | o o |" +
                    System.lineSeparator() + " |    --~--" +
                    System.lineSeparator() + " |     /|\\" +
                    System.lineSeparator() + " |    / |  \\" +
                    System.lineSeparator() + " |   /  |   \\" +
                    System.lineSeparator() + " |     / \\" +
                    System.lineSeparator() + " |    /   \\" +
                    System.lineSeparator() + " |   /     \\" +
                    System.lineSeparator() + "----" +
                    System.lineSeparator() + " " + System.lineSeparator();

    static String perdiste =
            System.lineSeparator() + "================" +
                    System.lineSeparator() + "   ¡PERDISTE!   " +
                    System.lineSeparator() + " LA PALABRA ERA " +
                    System.lineSeparator() + "  -> " + "%s".toUpperCase() + " <-" +
                    System.lineSeparator() + "================";

    static String ganaste =
            System.lineSeparator() + " " +
                    System.lineSeparator() + "================" +
                    System.lineSeparator() + "   ¡GANASTE!   " +
                    System.lineSeparator() + " LA PALABRA ERA " +
                    System.lineSeparator() + "  -> " + "%s".toUpperCase() + " <-" +
                    System.lineSeparator() + "================";

    static String[] attempts = {attemp0, attemp1, attemp2, attemp3, attemp4, attempt5, attempt6};
}