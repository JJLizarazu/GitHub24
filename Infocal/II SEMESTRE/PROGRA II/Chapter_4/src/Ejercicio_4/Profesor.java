package Ejercicio_4;
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
        profesor1.dataPrint();
    }
}

