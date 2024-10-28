package Ejercicio_Propuesto_6;
import java.util.*;
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

class Prueba {
    Vector profesores;
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        prueba.profesores = new Vector();
        Profesor profesor1 = new Profesor();
        ProfesorTitular profesor2 = new ProfesorTitular();
        prueba.profesores.add(profesor1);
        prueba.profesores.add(profesor2);
        for(int i = 0; i < prueba.profesores.size(); i++) {
            Profesor p = (Profesor) prueba.profesores.elementAt(i);
            p.dataPrint();
        }
    }
}
