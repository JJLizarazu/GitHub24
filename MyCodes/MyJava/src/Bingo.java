import java.util.*;

public class Bingo {
    private static final String[] CARTAS = {
            "El gallo", "El diablito", "La dama", "El catrín", "El paraguas",
            "La sirena", "La escalera", "La botella", "El barril", "El árbol",
            "El melón", "El valiente", "El gorrito", "La muerte", "La pera",
            "La bandera", "El choro", "El violoncello", "La garza", "El pájaro",
            "La mano", "La bota", "La luna", "El cotorro", "El borracho",
            "El negrito", "El corazón", "La sandía", "El tambor", "El camarón",
            "La psicologa", "El músico", "La araña", "El soldado", "La estrella",
            "El cazo", "El mundo", "El apache", "El nopal", "El alacrán",
            "La rosa", "La calavera", "La campana", "El cantarito", "El venado",
            "El sol", "La corona", "El chulupi", "El pino", "El pescado",
            "La palma", "La maceta", "El arpa", "La rana"
    };

    private static final Random RANDOM = new Random();
    private static final int SIZE = 4;
    private String[][] board;
    private Set<String> calledCards;
    private String playerName;

    public Bingo(String playerName) {
        this.board = new String[SIZE][SIZE];
        this.calledCards = new HashSet<>();
        this.playerName = playerName;
        generateBoard();
    }

    private void generateBoard() {
        List<String> deck = new ArrayList<>(Arrays.asList(CARTAS));
        Collections.shuffle(deck);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = deck.remove(0);
            }
        }
    }

    public void displayBoard() {
        System.out.println(playerName + ":");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(centerString(board[i][j], 20) + "  ");
            }
            System.out.println();
        }
    }

    public void markCard(String card) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j].equals(card)) {
                    board[i][j] = "X";
                }
            }
        }
    }

    public boolean checkWinner(boolean entireBoard) {
        if (entireBoard) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (!board[i][j].equals("X")) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            for (int i = 0; i < SIZE; i++) {
                boolean rowWin = true;
                for (int j = 0; j < SIZE; j++) {
                    if (!board[i][j].equals("X")) {
                        rowWin = false;
                        break;
                    }
                }
                if (rowWin) return true;
            }

            for (int j = 0; j < SIZE; j++) {
                boolean colWin = true;
                for (int i = 0; i < SIZE; i++) {
                    if (!board[i][j].equals("X")) {
                        colWin = false;
                        break;
                    }
                }
                if (colWin) return true;
            }

            boolean diagWin1 = true;
            boolean diagWin2 = true;
            for (int i = 0; i < SIZE; i++) {
                if (!board[i][i].equals("X")) {
                    diagWin1 = false;
                }
                if (!board[i][SIZE - 1 - i].equals("X")) {
                    diagWin2 = false;
                }
            }
            return diagWin1 || diagWin2;
        }
    }

    public String callCard() {
        String card;
        do {
            card = CARTAS[RANDOM.nextInt(CARTAS.length)];
        } while (calledCards.contains(card));
        calledCards.add(card);
        return card;
    }

    private static void clearScreen() {
        System.out.println(new String(new char[50]).replace("\0", "\r\n"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del Jugador 1:");
        String player1Name = scanner.nextLine();
        System.out.println("Ingrese el nombre del Jugador 2:");
        String player2Name = scanner.nextLine();

        System.out.println("Elige el modo de juego:\n1. Llenar entera tu cartilla\n2. Solo una línea");
        int gameMode = scanner.nextInt();
        boolean entireBoard = gameMode == 1;

        Bingo player1 = new Bingo(player1Name);
        Bingo player2 = new Bingo(player2Name);

        System.out.println();
        displayBoardsWithSpacing(player1, player2);

        boolean gameOver = false;

        while (!gameOver) {
            try {
                Thread.sleep(1000); // Esperar 5 segundos entre jugadas
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            clearScreen();
            String calledCard = player1.callCard();
            System.out.println("                                                                                             | " + calledCard + " |");

            for (int i = 0; i < 4; i++) {
                System.out.println(); // Salto de línea para espacio vertical
            }

            player1.markCard(calledCard);
            player2.markCard(calledCard);

            displayBoardsWithSpacing(player1, player2);

            if (player1.checkWinner(entireBoard)) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(); // Espacio hacia abajo
                }
                System.out.println("¡" + player1.playerName + " ha ganado!");
                player1.displayBoard();
                gameOver = true;
            } else if (player2.checkWinner(entireBoard)) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(); // Espacio hacia abajo
                }
                System.out.println("¡" + player2.playerName + " ha ganado!");
                player2.displayBoard();
                gameOver = true;
            }
        }

        System.out.println("¿Quieres volver a jugar? (s/n)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("s")) {
            main(args); // Reiniciar el juego
        } else {
            System.out.println("Gracias por jugar!");
        }
    }

    private static void displayBoardsWithSpacing(Bingo player1, Bingo player2) {
        int maxCardLength = 20; // Máximo número de caracteres que una carta puede tener (puede ajustar según las cartas)
        String separator = " ".repeat(30);

        System.out.println(separator + player1.playerName + separator + separator + separator + separator + player2.playerName);

        for (int i = 0; i < 2; i++) {
            System.out.println();
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(centerString(player1.board[i][j], maxCardLength) + "  ");
            }
            for (int j = 0; j < SIZE; j++) {
                if (j % 5 == 0){
                    System.out.print("           |           " + centerString(player2.board[i][j], maxCardLength) + "  ");
                } else {
                    System.out.print(centerString(player2.board[i][j], maxCardLength) + "  ");
                }
            }
            System.out.println();
        }
    }

    private static String centerString(String text, int length) {
        if (text.length() >= length) {
            return text;
        }
        int leftPadding = (length - text.length()) / 2;
        int rightPadding = length - text.length() - leftPadding;
        return " ".repeat(leftPadding) + text + " ".repeat(rightPadding);
    }
}