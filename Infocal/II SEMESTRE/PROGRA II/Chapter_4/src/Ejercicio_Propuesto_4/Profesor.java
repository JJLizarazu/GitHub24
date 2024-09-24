package Ejercicio_Propuesto_4;

public class Profesor {
    protected void dataPrint() {
        System.out.println("Es un profesor.");
    }
}

class ProfesorTitular extends Profesor {
    protected void dataPrint() {
        System.out.println("Es un profesor titular.");
    }
}

class Prueba {
    public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        Profesor profesor2 = (Profesor) profesor1;
        profesor2.dataPrint();
        // OUTPUT
        // Es un profesor titular.
    }
}

