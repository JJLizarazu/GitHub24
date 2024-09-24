package Ejercicio_Propuesto_3;

public class Persona {
    String nombre, direccion;
    public Persona(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

class Estudiante extends Persona{
    String carrera; int semestre;

    public Estudiante(String nombre, String direccion, String carrera, int semestre) {
        super(nombre, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}

class Profesor extends Persona{
    String departamento, categoria;

    public Profesor(String nombre, String direccion, String departamento, String categoria) {
        super(nombre, direccion);
        this.departamento = departamento;
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

class Prueba{
    public static void main(String[] args) {
        Estudiante est_1 = new Estudiante("Juan", "Av.Circunvalación", "Electrónica", 1);
        Profesor prof_1 = new Profesor("Miguel", "Ecológica", "Cochabamba", "Exactas");
    }
}