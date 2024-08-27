package Practica_2;
import java.util.*;
import static Practica_2.Students.studentList;
public class Students {
    public static ArrayList<Students> studentList = new ArrayList<>();
    String name; int age; float averageCalifications;
    Students(String name, int age, float averageCalifications) {
        this.name = name;
        this.age = age;
        this.averageCalifications = averageCalifications;
    }
    protected String getName() { return name; }
    protected int getAge() { return age; }
    protected float getAverageCalifications() { return averageCalifications; }

    @Override
    public String toString(){
        return "\n=================================\n| NOMBRE DEL ESTUDIANTE: " + name + " |\n| EDAD DEL ESTUDIANTE: " + age + " |\n| PROMEDIO DE CALIFICACIÓN: " + averageCalifications + " |";
    }

}

class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ssc = new Scanner(System.in);
        String name; int age, opMainMenu; float averageCalifications;
        do {
            resources.clearScreen();
            resources.mainMenu(); opMainMenu = sc.nextInt();
            switch (opMainMenu){
                case 1:
                    do {
                        int x = 0;
                        resources.newStudent();
                        System.out.println("| Ingrese el nombre del estudiante |"); System.out.print("-> "); name = ssc.nextLine();
                        System.out.println("| Ingrese la edad del estudiante |"); System.out.print("-> "); age = sc.nextInt();
                        System.out.println("| Ingrese el promedio del estudiante |"); System.out.print("-> "); averageCalifications = sc.nextFloat();
                        Students student = new Students(name, age, averageCalifications);
                        studentList.add(student);
                        resources.clearScreen();
                        resources.succesAdd();
                        for (Students students : studentList) {
                            System.out.println(students);
                        }
                    } while (resources.newStudentMenu() != 2);
                    break;
                case 2:
                    int opShowStudents;
                    do {
                        if (studentList.isEmpty()){
                            resources.isEmpty();
                            break;
                        }
                        System.out.println(bestCalification(studentList));
                        resources.separators();
                        System.out.println("--------------");
                        System.out.println("| 1 | VOVLER |");
                        System.out.println("--------------");
                        System.out.print("-> "); opShowStudents = sc.nextInt();
                    } while (opShowStudents != 1);
                    break;
                case 3:
                    resources.outSystem();
                    break;
            }
        } while (opMainMenu != 3);
    }
    protected static Students bestCalification(ArrayList<Students> studentList){
        resources.showStudent();
        Students bestAverageCalification = studentList.get(0);
        for (Students students: studentList){
            if (students.getAverageCalifications() > bestAverageCalification.getAverageCalifications()){
                bestAverageCalification = students;
            }
        }
        return bestAverageCalification;
    }
}

class resources{

    protected static void separators(){
        System.out.println("=====================================");
    }
    protected static void clearScreen(){
        for (int i = 0 ; i < 20 ; i++){
            System.out.println(" ");
        }
    }

    protected static void mainMenu(){
        System.out.println("-----------------");
        System.out.println("|    ALUMNOS    |");
        System.out.println("-----------------");
        System.out.println("| 1 | AGREGAR   |");
        System.out.println("-----------------");
        System.out.println("| 2 | MOSTRAR   |");
        System.out.println("-----------------");
        System.out.println("| 3 | SALIR     |");
        System.out.println("----------------");
        System.out.print("-> ");
    }

    protected static void newStudent(){
        clearScreen();
        System.out.println("----------------");
        System.out.println("| NUEVO ALUMNO |");
        System.out.println("----------------");
    }
    protected static void showStudent(){
        clearScreen();
        System.out.println("         ----------------");
        System.out.println("         | MEJOR ALUMNO |");
        System.out.println("         ----------------");
    }
    protected static void outSystem(){
        clearScreen();
        System.out.println("           SALIENDO... ");
    }
    protected static void isEmpty(){
        System.out.println("--------------------");
        System.out.println("| ¡NO HAY ALUMNOS! |");
        System.out.println("--------------------");
    }

    protected static void succesAdd(){
        System.out.println("-------------------------------------");
        System.out.println("| ¡NUEVO ALUMNO AGREGADO CON ÉXITO! |");
        System.out.println("-------------------------------------");
    }

    protected static int newStudentMenu(){
        Scanner sc = new Scanner(System.in);
        int opNewStudentMenu;
        System.out.println("--------------------------------");
        System.out.println("|    ¿AGREGAR NUEVO ALUMNO?    |");
        System.out.println("--------------------------------");
        System.out.println("| 1 | SI                       |");
        System.out.println("--------------------------------");
        System.out.println("| 2 | NO                       |");
        System.out.println("--------------------------------");
        System.out.print("-> "); opNewStudentMenu = sc.nextInt();
        return opNewStudentMenu;
    }
}
