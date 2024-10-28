package Ejercicio_5;
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
    public static void main(String[] args) {
        /*ProfesorTitular obj = new Profesor();
        obj.dataPrint();*/
    }
}
