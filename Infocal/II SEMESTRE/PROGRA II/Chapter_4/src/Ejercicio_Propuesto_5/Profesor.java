package Ejercicio_Propuesto_5;
public class Profesor {
    protected void dataPrint() {
        System.out.println("Es un profesor");
    }
}
class ProfesorTitular extends Profesor {
    protected void dataPrint() {
        System.out.println("Es un profesor titular.");
    }
}

class Prueba2 {
    /*public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        ProfesorTitular profesor2 = (Profesor) profesor1;
        profesor2.dataPrint();
    }*/
}