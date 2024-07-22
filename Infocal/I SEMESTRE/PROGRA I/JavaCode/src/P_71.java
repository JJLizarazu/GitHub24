//  Ejercicio de conteo de vocales:
//  Escribe una función que tome una cadena de texto como parámetro y devuelva el número de vocales que contiene.
import java.util.*;
class P_71{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== CONTEO DE VOCALES ====");
        System.out.println("Ingrese una palabra para determinar el número de vocales en esta: ");
        System.out.print("-> "); String Word = sc.nextLine();
        Separators();
        System.out.println("La palabra " + Word + " tiene: ¡ " + Vowels(Word) + " VOCALES!");
        Separators();
    }

    static int Vowels(String Word){
        int Add = 0;
        int Length = Word.length();
        for (int letter = 0 ; letter < Length ; letter++){
            String Aux = String.valueOf(Word.charAt(letter));
            if (Aux.equals("a") || Aux.equals("A")){
                Add++;
            } else if (Aux.equals("e") || Aux.equals("E")){
                Add++;
            } else if (Aux.equals("i") || Aux.equals("I")) {
                Add++;
            } else if (Aux.equals("o") || Aux.equals("O")){
                Add++;
            } else if (Aux.equals("u") || Aux.equals("U")) {
                Add++;
            }
        }
        return Add;
    }

    public static void Separators() {
        System.out.println("=======================================");
    }

}
