package Ejercicio_6;
public class Profesor {
    protected void dataPrint() {
        System.out.println("Es un profesor");
    }
}
class ProfesorTitular extends Profesor {
    int años = 0;
    protected void dataPrint() {
        System.out.println("Es un profesor titular.");
    }
    protected void dataPrintAños() {
        System.out.println("Años = " + años);
    }
}
class Prueba3 {
    /*public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        profesor1.dataPrintAños();
    }*/
}
