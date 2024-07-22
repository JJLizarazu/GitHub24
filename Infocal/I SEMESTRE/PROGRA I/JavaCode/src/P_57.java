//   Lea 4 números y almacénelo en un vector de llamado A, y otros 4 números en un vector llamado B, y determine cuantos números de A se encuentran en B
import java.util.Scanner;
class P_57{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comparation = 0;
        System.out.println("== COMPARACIÓN DE ´ARRAYS´ ===");
        int[] arrayA;
        int[] arrayB;
        arrayA = new int[4];
        arrayB = new int[4];

        System.out.println("==  ARRAY A  ==");
        for (int i = 0 ; i < 4 ; i++){
            System.out.println("Ingrese el " + (i + 1) + "° número: ");
            arrayA[i] = sc.nextInt();
        }

        System.out.println("==  ARRAY B  ==");
        for (int j = 0 ; j < 4 ; j++){
            System.out.println("Ingrese el " + (j + 1) + "° número: ");
            arrayB[j] = sc.nextInt();
        }

        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < 4; j++){
                if (arrayA[i] == arrayB[j]){
                    comparation++;
                    i++;
                }
            }
        }
        if (comparation > 0){
            System.out.println("Hay " + comparation + " números iguales entre A y B");
        }
    }
}