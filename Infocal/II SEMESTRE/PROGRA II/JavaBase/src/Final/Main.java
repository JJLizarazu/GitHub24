package Final;

public class Main {
    private final String name;
    private int edad;

    public Main(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }


    public void dataDisplay(){
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + edad);
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main(String[] args) {
        Main main = new Main("Pedro", 15);
        main.dataDisplay();
    }
}
