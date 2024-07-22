// Escribe un programa que imprima los números de la serie de Fibonacci menores que 100 usando un bucle WHILE.
//c = a + b; a = b; b = c;
class P_46{
    public static void main(String[] args) {
        System.out.println("= F I B O N A C C I =");
        System.out.println("      ( WHILE )      ");
        System.out.println("     ( 1 - 100 )     ");
        int num1, num2, num3;
        num1 = 0;
        num2 = 1;
        System.out.println("| " + num1 + " |");
        System.out.println("| " + num2 + " |");
        int counter = 1;
        while (counter <= 10){ // counter <= 10 <- Porque hay 10 números sin contar al 0 y 1, para que la suma de números sea menor a 100.
            num3 = num1 + num2;
            System.out.println("| " + num3 + " |");
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }
}