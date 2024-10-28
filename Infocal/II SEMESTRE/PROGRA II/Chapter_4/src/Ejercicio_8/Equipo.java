package Ejercicio_8;
import java.util.*;
public class Equipo {
    private String nombre;
    private static double totalTiempo;
    private String pais;
    Vector listaCiclistas;
    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0;
        listaCiclistas = new Vector();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private String getpais() {
        return pais;
    }
    private void setpais(String pais) {
        this.pais = pais;
    }
    void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }
    void listarEquipo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            System.out.println(c.getNombre());
        }
    }
    void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        String nombreCiclista = sc.next();
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            if (c.getNombre().equals(nombreCiclista)) {
                System.out.println(c.getNombre());
            }
        }
    }
    void calcularTotalTiempo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            totalTiempo = totalTiempo + c.getTiempoAcumulado();
        }
    }
    void dataPrint() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("pais = " + pais);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
}
abstract class Ciclista {
    private int identificador;
    private String nombre;
    private int tiempoAcumulado = 0;
    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }
    abstract String dataPrintTipo();
    protected int getIdentificador() {
        return identificador;
    }
    protected void setIdentificador() {
        this.identificador = identificador;
    }
    protected String getNombre() {
        return nombre;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    protected int getPosiciónGeneral(int posiciónGeneral) {
        return posiciónGeneral;
    }
    protected void setPosiciónGeneral(int posiciónGeneral) {
        posiciónGeneral = posiciónGeneral;
    }
    protected int getTiempoAcumulado() {
        return tiempoAcumulado;
    }
    protected void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }
    protected void dataPrint() {
        System.out.println("Identificador = " + identificador);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Acumulado = " +
                tiempoAcumulado);
    }
}
class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedio;
    public Velocista(int identificador, String nombre, double
            potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre);
        potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }
    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }
    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }
    protected double getvelocidadPromedio() {
        return velocidadPromedio;
    }
    protected void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }
    protected void dataPrint() {
        super.dataPrint();
        System.out.println("Potencia promedio = " + potenciaPromedio);
        System.out.println("Velocidad promedio = " +
                velocidadPromedio);
    }
    protected String dataPrintTipo() {
        return "Es un velocista";
    }
}
class Escalador extends Ciclista {
    private double aceleracionPromedio;
    private double gradoRampa;
    public Escalador(int identificador, String nombre, double
            aceleracionPromedio, double gradoRampa) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }
    protected double getaceleracionPromedio() {
        return aceleracionPromedio;
    }
    protected void setaceleracionPromedio(double aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }
    protected double getGradoRampa() {
        return gradoRampa;
    }
    protected void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }
    protected void dataPrint() {
        super.dataPrint();
        System.out.println("Aceleración promedio = " + aceleracionPromedio);
        System.out.println("Grado de rampa = " + gradoRampa);
    }
    protected String dataPrintTipo() {
        return "Es un escalador";
    }
}
class Contrarrelojista extends Ciclista {
    private double velocidadMaxima;
    
    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }
    protected double getvelocidadMaxima() {
        return velocidadMaxima;
    }
    protected void setvelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    protected void dataPrint() {
        super.dataPrint();
        System.out.println("Aceleración promedio = " +
                velocidadMaxima);
    }
    protected String dataPrintTipo() {
        return "Es un constrarrelojista";
    }
}
class Prueba {
    public static void main(String args[]) {
        Equipo equipo1 = new Equipo("Sky","Estados Unidos");
        Velocista velocista1 = new Velocista(123979, "Geraint Thomas", 320, 25);
        Escalador escalador1 = new Escalador(123980, "Egan Bernal", 25, 10);
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(123981, "Jonathan Castroviejo", 120);
        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarrelojista1);
        velocista1.setTiempoAcumulado(365);
        escalador1.setTiempoAcumulado(385);
        contrarrelojista1.setTiempoAcumulado(370);
        equipo1.calcularTotalTiempo();
        equipo1.dataPrint();
        equipo1.listarEquipo();
    }
}
