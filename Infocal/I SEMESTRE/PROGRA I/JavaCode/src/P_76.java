import java.util.*;

//  Ejercicio de conteo de palabras: Escribe una función que tome una cadena de texto como parámetro y
//  devuelva el número de palabras que contiene. Se considera que las palabras están separadas por espacios en blanco.

class P_76{
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.println("==== CONTEO DE PALABRAS ====");
        System.out.println("Ingrese una frase para determinar la cantidad de palabras que tiene: ");
        System.out.print("-> "); String text = scc.nextLine();
        separators();
        System.out.println("El texto ingresado tiene: ¡" + counterWords(text) + " palabras!");
        separators();
    }

    static int counterWords(String text){
        int add = 0;
        int word = text.length();
        for (word = 0 ; word < text.length() ; word++){
            String aux = String.valueOf(text.charAt(word));
            if (aux.equals(" ")){
                add++;
            }
        }
        return add + 1;
    }

    public static void separators(){
        System.out.println("=========================================");
    }

}
