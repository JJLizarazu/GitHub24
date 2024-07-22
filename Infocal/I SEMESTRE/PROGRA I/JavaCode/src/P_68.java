//  Dado la edad de una persona, determine en que etapa de su vida se encuentra,
//  cree un procedimiento o funcion  para realizar dicha tarea.
//  Etapa (E:Edad:Entero, S:Etapa:Cadena)
//  Entre 0 y 2     Bebé
//  Entre 3 y 5     Niño
//  Entre 6 y 12    Pubertad
//  Entre 13 y 18	Adolescente
//  Entre 19 y 25	Joven
//  Entre 26 y 60	adulto
//  Mayor a 60      Anciano

import java.util.Scanner;
class P_68{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== ETAPAS DE LA VIDA ===");
        System.out.println("¿Qué edad tiene?");
        int age = sc.nextInt();
        if (age <= 2){
            baby(age);
        } else if (age <= 5){
            child(age);
        } else if (age <= 12){
            puberty(age);
        } else if (age <= 18){
            teenager(age);
        } else if (age <= 25){
            young(age);
        } else if (age < 60){
            adult(age);
        } else if (age > 60){
            elderly(age);
        }
    }

    static void baby(int age){
        separators();
        System.out.println("Usted está en la etapa de: BEBÉ");
        separators();
    }

    static void child(int age){
        separators();
        System.out.println("Usted está en la etapa de: NIÑO");
        separators();
    }

    static void puberty(int age){
        separators();
        System.out.println("Usted está en la etapa de: PUBERTAD");
        separators();
    }

    static void teenager(int age){
        separators();
        System.out.println("Usted está en la etapa de: ADOLESCENTE");
        separators();
    }

    static void young(int age){
        separators();
        System.out.println("Usted está en la etapa de: JOVEN");
        separators();
    }

    static void adult(int age){
        separators();
        System.out.println("Usted está en la etapa de: adultO");
        separators();
    }

    static void elderly(int age){
        separators();
        System.out.println("Usted está en la etapa de: ANCIANO");
        separators();
    }

    public static void separators() {  // MI MARCA EN MIS CÓDIGOS
        System.out.println("=====================================");
    }

}