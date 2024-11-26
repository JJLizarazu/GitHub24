import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Ingrese su número: "); number = sc.nextInt();


        int num1[] = new int[String.valueOf(number).length()];

        for (int i = 0; i < String.valueOf(number).length(); i++){
            num1[i] = Integer.parseInt(String.valueOf(String.valueOf(number).charAt(i)));
        }

        int sum = 0;
        for (int i = 0 ; i < String.valueOf(number).length(); i++){
            sum += num1[i];
        }

        if (String.valueOf(sum).length() >= 2){
            int num2[] = new int[String.valueOf(sum).length()];

            for (int i = 0; i < String.valueOf(sum).length(); i++){
                num2[i] = Integer.parseInt(String.valueOf(String.valueOf(sum).charAt(i)));
            }

            int sum2 = 0;
            for (int i = 0 ; i < String.valueOf(sum).length(); i++){
                sum2 += num2[i];
            }

            if (String.valueOf(sum2).length() >= 2){
                int num3[] = new int[String.valueOf(sum2).length()];

                for (int i = 0; i < String.valueOf(sum2).length(); i++){
                    num3[i] = Integer.parseInt(String.valueOf(String.valueOf(sum2).charAt(i)));
                }

                int sum3 = 0;
                for (int i = 0 ; i < String.valueOf(sum2).length(); i++){
                    sum3 += num3[i];
                }
                System.out.println("El número es: " + sum3);
            } else {
                System.out.println("El número es: " + sum2);
            }
        } else {
            System.out.println("El número es: " + sum);
        }

    }
}
