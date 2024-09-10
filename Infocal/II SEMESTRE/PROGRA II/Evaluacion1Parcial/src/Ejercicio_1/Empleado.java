package Ejercicio_1;

public class Empleado {
    String nombre; int edad; double salario;

    Empleado(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public double aplicarAumento(Double salarioEmpleado){
        double porcentaje;
        if (salarioEmpleado < 3000){
            System.out.println("-> SI APLICA AL AUMENTO <-");
            porcentaje = salarioEmpleado * 0.10;
            salario = porcentaje + salario;
        } else {
            System.out.println("-> NO APLICA AL AUMENTO <-");
        }
        return salario;
    }

}
