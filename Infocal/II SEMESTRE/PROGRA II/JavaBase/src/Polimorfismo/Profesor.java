package Polimorfismo;

import java.util.*;

public class Profesor {
    protected void dataPrint(){
        System.out.println("Es un profesor.");
    }

}

class ProfesorTitular extends Profesor{
    int años = 0;
    protected void dataPrint(){
        System.out.println("Es un profesor = TITULAR =");
    }
    protected void imprimirAños(){
        System.out.println("Años = " + años);
    }
}

class Prueba {
    Vector profesores;
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        prueba.profesores = new Vector();
        Profesor profesor_1 = new Profesor();
        ProfesorTitular profesor_2 = new ProfesorTitular();
        prueba.profesores.add(profesor_1);
        prueba.profesores.add(profesor_2);
        for (int i = 0 ; i < prueba.profesores.size() ; i++){
            Profesor p = (Profesor) prueba.profesores.get(i);
            p.dataPrint();
        }
    }

}