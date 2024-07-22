import java.util.*;
//  Ejercicio de reverso de cadena: Escribe una función que tome una cadena de texto como parámetro y
//  devuelva la cadena invertida.
class P_72{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== INVERTIDO - ODITREVNI =====");
        System.out.println("Escriba para devolverlo invertido: ");
        System.out.print("--> "); String Word = sc.nextLine();
        Separators();
        System.out.println("--> " + Word + " <--");
        System.out.println("--> " + invertedWord(Word) + " <--");
        Separators();
    }

    static String invertedWord(String Word){
        String Inverted = "";
        int aux;
        for (aux = Word.length() - 1 ; aux >= 0 ; aux--){
            Inverted += Word.charAt(aux);
        }
        return Inverted;
    }

    public static void Separators() {
        System.out.println("=======================================");
    }

}