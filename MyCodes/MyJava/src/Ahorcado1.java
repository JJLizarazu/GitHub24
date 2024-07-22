import java.util.Scanner;

class Ahorcado {
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
        String word = "Adrian";
        // =========================

        // ===========================================================================================
        int numberOfVowels = word.length(); // ALMACENAR CANTIDAD DE LETRAS EN UNA VARIABLE
        int attempt = 0, auxAttempt = 0, auxVowels = 0; // INTENTOS, AUXILIAR DE INTENTOS, AUXILIAR DE VOCALES
        String vowel, vowelUpperCase, auxCorrectVowel = " _ "; // VOCAL QUE INTRODUCE EL USUARIO
        int correctVowel = 0;
        String[] vowelOfWordFinded = new String[numberOfVowels]; // ALMACENAR LAS VOCALES ENCONTRADAS
        String[] arrayOfWord = new String[numberOfVowels]; // SEPARAR LA PALABRA EN LETRAS EN UNA MATRIZ
        // ===========================================================================================

        // ==============================================================
        // CONVERTIR LA PALABRA EN ARRAY / RELLENAR LA MATRIZ CON ESPACIOS
        // ==============================================================
        for(int i = 0 ; i < numberOfVowels ; i++){
            arrayOfWord[i] = String.valueOf(word.toUpperCase().charAt(i));
        }
        for(int i = 0 ; i < numberOfVowels ; i++){
            vowelOfWordFinded[i] = "_";
        }
        // ==============================================================

        //===============================
        // DO - WHILE
        //===============================
        do {
            // =================================
            // MOSTRAR EL AHORCADO CON UN SWITCH
            // =================================
            switch (attempt){
                case 0:
                    attemp0();
                    break;
                case 1:
                    attemp1();
                    break;
                case 2:
                    attemp2();
                    break;
                case 3:
                    attemp3();
                    break;
                case 4:
                    attemp4();
                    break;
                case 5:
                    attemp5();
                    break;
            }

            // ===========================================
            //             PISTAS DE LA PALABRA
            hintsOfWord(vowelOfWordFinded, numberOfVowels);
            // ===========================================
            spaces();

            // ========================
            //   INTETOS RESTANTES
            remainingAttempts(attempt);
            // ========================
            spaces();

            // ====================================
            //         INGRESE UNA LETRA
            // ====================================
            System.out.print("Ingrese una letra: ");
            vowel = sc.nextLine();
            vowelUpperCase = vowel.toUpperCase();
            // ====================================
            spaces();

            // ============================================================
            // AÑADIR LA VOCAL ENCONTRADA A LA MATRIZ DE VOCALES ENCONTRADAS
            //       AUMENTAR LOS INTENTOS EN CASO DE NO SER ASI
            // ============================================================
            for(int i = 0 ; i < numberOfVowels ; i++) {
                if (vowel.equalsIgnoreCase(arrayOfWord[i])){
                    vowelOfWordFinded[i] = vowelUpperCase;
                }
                if (!vowelUpperCase.equals(arrayOfWord[i].toUpperCase())) {
                    auxAttempt++;
                }
            }
            if (auxAttempt >= numberOfVowels){
                attempt++;
            }
            // ============================================================

            // ============================================================
            //        COMPROBAR SI LA PALABRA HA SIDO ENCONTRADA
            // ============================================================
            for(int i = 0 ; i < numberOfVowels ; i++){
                if(arrayOfWord[i].equals(vowelOfWordFinded[i])) {
                    auxVowels++;
                }
            }
            // ============================================================

            // ==============================
            //  MENSAJE DE GANADO O PERDIDO
            // ==============================
            if(auxVowels == numberOfVowels){
                attempt+=6;
                finalAttempWin(word);
            } else if (attempt >= 6){
                finalAttempFail(word);
            }
            // ==============================
            // ========================
            //  RETORNAR CONTADORES A 0
            // ========================
            auxAttempt = 0;
            auxVowels = 0;
            // ========================
        } while (attempt < 6);
    }

    static void hintsOfWord(String vowelOfWordFinded[], int numberOfVowels){
        for(int i = 0 ; i < numberOfVowels ; i++){
            System.out.print(vowelOfWordFinded[i] + " ");
        }
    }

    static void spaces(){
        System.out.println(" ");
        System.out.println(" ");
    }

    static void remainingAttempts(int attempt){
        System.out.println("INTENTOS RESTANTE -> " + (6 - attempt));
    }

    static void attemp0(){
        System.out.println(" _________");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println("----");
        System.out.println(" ");
    }

    static void attemp1(){
        System.out.println(" _________");
        System.out.println(" |      ¡");
        System.out.println(" |    -----");
        System.out.println(" |   | o o |");
        System.out.println(" |    --~--");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println("----");
        System.out.println(" ");
    }

    static void attemp2(){
        System.out.println(" _________");
        System.out.println(" |      ¡");
        System.out.println(" |    -----");
        System.out.println(" |   | o o |");
        System.out.println(" |    --~--");
        System.out.println(" |      |");
        System.out.println(" |      |");
        System.out.println(" |      |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println("----");
        System.out.println(" ");
    }

    static void attemp3(){
        System.out.println(" _________");
        System.out.println(" |      ¡");
        System.out.println(" |    -----");
        System.out.println(" |   | o o |");
        System.out.println(" |    --~--");
        System.out.println(" |      |");
        System.out.println(" |      |");
        System.out.println(" |      |");
        System.out.println(" |     /");
        System.out.println(" |    /");
        System.out.println(" |   /");
        System.out.println("----");
        System.out.println(" ");
    }

    static void attemp4(){
        System.out.println(" _________");
        System.out.println(" |      ¡");
        System.out.println(" |    -----");
        System.out.println(" |   | o o |");
        System.out.println(" |    --~--");
        System.out.println(" |      |");
        System.out.println(" |      |");
        System.out.println(" |      |");
        System.out.println(" |     / \\");
        System.out.println(" |    /   \\");
        System.out.println(" |   /     \\");
        System.out.println("----");
        System.out.println(" ");
    }

    static void attemp5(){
        System.out.println(" _________");
        System.out.println(" |      ¡");
        System.out.println(" |    -----");
        System.out.println(" |   | o o |");
        System.out.println(" |    --~--");
        System.out.println(" |     /|");
        System.out.println(" |    / |");
        System.out.println(" |   /  |");
        System.out.println(" |     / \\");
        System.out.println(" |    /   \\");
        System.out.println(" |   /     \\");
        System.out.println("----");
        System.out.println(" ");
    }

    static void finalAttempFail(String word){
        System.out.println(" _________");
        System.out.println(" |      ¡");
        System.out.println(" |    -----");
        System.out.println(" |   | o o |");
        System.out.println(" |    --~--");
        System.out.println(" |     /|\\");
        System.out.println(" |    / |  \\");
        System.out.println(" |   /  |   \\");
        System.out.println(" |     / \\");
        System.out.println(" |    /   \\");
        System.out.println(" |   /     \\");
        System.out.println("----");
        System.out.println(" ");
        System.out.println("================");
        System.out.println("   ¡PERDISTE!   ");
        System.out.println(" LA PALABRA ERA ");
        System.out.println("  -> " + word.toUpperCase() + " <-");
        System.out.println("================");
    }
    static void finalAttempWin(String word){
        System.out.println(" ");
        System.out.println("================");
        System.out.println("   ¡GANASTE!   ");
        System.out.println(" LA PALABRA ERA ");
        System.out.println("  -> " + word.toUpperCase() + " <-");
        System.out.println("================");
    }
}