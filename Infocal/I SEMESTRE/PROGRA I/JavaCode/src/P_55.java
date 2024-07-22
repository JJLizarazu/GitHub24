//  Se tienen los nombres de los N alumnos de una escuela, además de su promedio general. Realice un algoritmo para capturar esta información,
//  la cual se debe almacenar en arreglos, un vector para el nombre y otro para el promedio, después de capturar la información se debe ordenar con base en su promedio,
//  de mayor a menor, los nombres deben corresponder con los promedios. Realice el algoritmo
import java.util.*;
class P_55{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        int numberOfStudents;
        String names;
        double average;
        System.out.println("=== REGISTRO ESTUDIANTIL ===");
        System.out.println("Ingrese la cantidad de alumnos que hay en la escuela: ");
        numberOfStudents = sc.nextInt();
        String[] nameArray;
        nameArray = new String[numberOfStudents];
        double[] averageArray;
        averageArray = new double[numberOfStudents];
        for (int i = 0 ; i < numberOfStudents ; i++){
            System.out.println("=================================================");
            System.out.println("Ingrese el nombre del alumno/a " + (i + 1) + ": ");
            nameArray[i] = scc.nextLine();
            System.out.println("Ingrese el promedio del alumno/a " + nameArray[i] + ": ");
            averageArray[i] = sc.nextDouble();
        }
        for (int i = 0 ; i < numberOfStudents - 1 ; i++){
            for (int j = 0 ; j < numberOfStudents - 1 - i ; j++){
                if (averageArray[j] < averageArray[j + 1]){
                    average = averageArray[j];
                    averageArray[j] = averageArray[j + 1];
                    averageArray[j + 1] = average;

                    names = nameArray[j];
                    nameArray[j] = nameArray[j + 1];
                    nameArray[j + 1] = names;
                }
            }
        }
        System.out.println("NOMBRE Y PROMEDIO DE LOS ESTUDIANTES: ");
        for (int i = 0 ; i < numberOfStudents ; i++){
            System.out.println((i + 1) + ".- Nombre: " + nameArray[i] + ". Promedio: " + averageArray[i]);
        }
    }
}