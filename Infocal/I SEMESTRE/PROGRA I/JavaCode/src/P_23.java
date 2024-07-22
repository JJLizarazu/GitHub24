// Realice lo siguiente Un alumno desea saber cuál será su calificación final en la materia de Algoritmos.
// Dicha calificación se compone de los siguientes porcentajes: 55% del promedio de sus tres calificaciones parciales.
// 30% de la calificación del examen final. 15% de la calificación de un trabajo final .
import java.util.*;
class P_23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float exam1, exam2, exam3;
        double average3P, finalExam, finalWork, finalNote;
        System.out.println("==== CALIFICACIÓN FINAL ====");
        System.out.println("==== P A R C I A L E S ====");
        System.out.println("¿Cúal fúe la nota en el primer parcial?");
        exam1 = sc.nextFloat();
        System.out.println("¿Cúal fúe la nota en el segundo parcial?");
        exam2 = sc.nextFloat();
        System.out.println("¿Cúal fúe la nota en el tercer parcial?");
        exam3 = sc.nextFloat();
        System.out.println("======  E X A M E N   F I N A L ======");
        System.out.println("¿Cúal fue la nota en el examen final?");
        finalExam = sc.nextDouble();
        System.out.println("=== T R A B A J O   F I N A L ===");
        System.out.println("¿Cúal fue la nota en su trabajo final?");
        finalWork = sc.nextDouble();
        average3P = (((exam1 + exam2 + exam3) / 3) * 0.55);
        finalExam = finalExam * 0.30;
        finalWork = finalWork * 0.15;
        finalNote = finalWork + finalExam + average3P;
        System.out.println("====================================================");
        System.out.println("La nota final del estudiante es: " + finalNote);
    }
}
