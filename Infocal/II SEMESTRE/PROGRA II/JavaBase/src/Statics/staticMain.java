package Statics;

public class staticMain {
    private static String frase = "Primera frase";

    public static int sum(int a, int b){
        return a + b;
    }


    public static void main(String[] args) {
        System.out.println(staticMain.frase);
        System.out.println(sum(5,9));
    }
}
