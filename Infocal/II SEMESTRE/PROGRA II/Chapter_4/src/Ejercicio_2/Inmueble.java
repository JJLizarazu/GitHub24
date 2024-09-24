package Ejercicio_2;
public class Inmueble {
    protected int identificadorInmobiliario;
    protected int area;
    protected double precioVenta;
    Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }
    protected String direccion;
    double calcularPrecioVenta(double valorArea) {
        precioVenta = area * valorArea;
        return precioVenta;
    }
    void dataPrint() {
        System.out.println("Identificador inmobiliario = " +
                identificadorInmobiliario);
        System.out.println("Area = " + area);
        System.out.println("direccion = " + direccion);
        System.out.println("Precio de venta = $" + precioVenta);
    }
}
class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroSanitarios;
    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroSanitarios) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroSanitarios = numeroSanitarios;
    }
    void dataPrint() {
        super.dataPrint();
        System.out.println("numero de habitaciones = " + numeroHabitaciones);
        System.out.println("numero de baños = " + numeroSanitarios);
    }
}

class Casa extends InmuebleVivienda {
    protected int numeroPisos;
    public Casa(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroSanitarios, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroSanitarios);
        this.numeroPisos = numeroPisos;
    }
    void dataPrint() {
        super.dataPrint();
        System.out.println("numero de pisos = " + numeroPisos);
    }
}

class Apartamento extends InmuebleVivienda {
    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroSanitarios) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroSanitarios);
    }
    void dataPrint() {
        super.dataPrint();
    }
}

class CasaRural extends Casa {
    protected double valorArea = 1500000;
    protected int distanciaCabera;
    protected int altitud;
    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroSanitarios, int numeroPisos, int distanciaCabera, int altitud) {
        super(identificadorInmobiliario, area, direccion,
                numeroHabitaciones, numeroSanitarios, numeroPisos);
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }
    void dataPrint() {
        super.dataPrint();
        System.out.println("Distancia la cabecera municipal = " +
                numeroHabitaciones + " km.");
        System.out.println("Altitud sobre el nivel del mar = " + altitud + " metros.");
        System.out.println();
    }
}

class CasaUrbana extends Casa {
    public CasaUrbana(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroSanitarios, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroSanitarios, numeroPisos);
    }
    void dataPrint() {
        super.dataPrint();
    }
}

class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    protected int valorAdministracion;
    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroSanitarios, int valorAdministracion) {
        super(identificadorInmobiliario, area, direccion,
                numeroHabitaciones, numeroSanitarios);
        this.valorAdministracion = valorAdministracion;
    }
    void dataPrint() {
        super.dataPrint();
        System.out.println("Valor de la administración = $" + valorAdministracion);
        System.out.println();
    }
}

class Apartaestudio extends Apartamento {
    protected static double valorArea = 1500000;
    public Apartaestudio(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroSanitarios) {
        super(identificadorInmobiliario, area, direccion, 1, 1);
    }
    void dataPrint() {
        super.dataPrint();
        System.out.println();
    }
}

class CasaConjuntoCerrado extends CasaUrbana {
    protected static double valorArea = 2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;
    public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroSanitarios, int numeroPisos, int valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroSanitarios, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    void dataPrint() {
        super.dataPrint();
        System.out.println("Valor de la administración = " + valorAdministracion);
        System.out.println("Tiene piscina? = " + tienePiscina);
        System.out.println("Tiene campos deportivos? = " + tieneCamposDeportivos);
        System.out.println();
    }
}

class CasaIndependiente extends CasaUrbana {
    protected static double valorArea = 3000000;
    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroSanitarios, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroSanitarios, numeroPisos);
    }
    void dataPrint() {
        super.dataPrint();
        System.out.println();
    }
}

class Local extends Inmueble {
    enum tipo {INTERNO,CALLE}
    protected tipo tipoLocal;
    public Local(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal) {
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }
    void dataPrint() {
        super.dataPrint();
        System.out.println("Tipo de local = " + tipoLocal);
    }
}

class LocalComercial extends Local {
    protected static double valorArea = 3000000;
    protected String centroComercial;
    public LocalComercial(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, String centroComercial) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }
    void dataPrint() {
        super.dataPrint();
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }
}

class Oficina extends Local {
    protected static double valorArea = 3500000;
    protected boolean esGobierno;
    public Oficina(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, boolean esGobierno) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }
    void dataPrint() {
        super.dataPrint();
        System.out.println("Es oficina gubernamental = " + esGobierno);
        System.out.println();
    }
}
class Prueba {
    public static void main(String args[]) {
        ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067,120, "Avenida Santander 45-45",3,2,200000);
        System.out.println("Datos apartamento");
        apto1.calcularPrecioVenta(apto1.valorArea);
        apto1.dataPrint();
        System.out.println("Datos apartamento");
        Apartaestudio aptestudio1 = new Apartaestudio(12354,50,"Avenida Caracas 30-15",1,1);
        aptestudio1.calcularPrecioVenta(aptestudio1.valorArea);
        aptestudio1.dataPrint();
    }
}
