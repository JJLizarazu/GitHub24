//  Escribe un programa que calcule la suma de los primeros 100 números naturales usando un bucle for
class P_37 {
    public static void main(String[] args) {
        int i, sum;
        sum = 0;
        for (i = 0 ; i <= 100 ; i++){
            sum = sum + i;
        }
        System.out.println("La suma de los 100 primeros números naturales es " + sum);
    }
}