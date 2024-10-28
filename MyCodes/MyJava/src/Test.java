import java.util.*;
public class Test{
    protected double cuerda; protected String figura;
    protected double ladoA, ladoB, base, altura;
    protected double areaFinal;
    public ArrayList<Double> areas = new ArrayList<Double>();
    Test(double cuerda, String figura){
        this.cuerda = cuerda;
        this.figura = figura;
    }
    
    public void calcular(){
        int porcentaje = 0; double cuerdaCortada; double sobraCuerda;
        while(porcentaje <= 100){
            for (double i = 0 ; i <= 100 ; i++){
                 if (i < 10){
                     sobraCuerda = cuerda * (i / 10);
                     cuerdaCortada = cuerda - sobraCuerda;
                     ladoA = cuerdaCortada / 2;
                     ladoB = cuerdaCortada / 2;
                     base = sobraCuerda;
                     altura = Math.sqrt(Math.pow(ladoA, 2) - Math.pow(base, 2));
                     areaFinal = ((base * altura) / 2);
                     areas.add(areaFinal);
                 } else if (i < 100){
                     sobraCuerda = cuerda * (i / 100);
                     cuerdaCortada = cuerda - sobraCuerda;
                     ladoA = cuerdaCortada / 2;
                     ladoB = cuerdaCortada / 2;
                     base = sobraCuerda;
                     altura = Math.sqrt(Math.pow(ladoA, 2) - Math.pow(base, 2));
                     areaFinal = ((base * altura) / 2);
                     areas.add(areaFinal);
                 } else {
                     sobraCuerda = cuerda * (i / 1000);
                     cuerdaCortada = cuerda - sobraCuerda;
                     ladoA = cuerdaCortada / 2;
                     ladoB = cuerdaCortada / 2;
                     base = sobraCuerda;
                     altura = Math.sqrt(Math.pow(ladoA, 2) - Math.pow(base, 2));
                     areaFinal = ((base * altura) / 2);
                     areas.add(areaFinal);
                 }
            }
            porcentaje++;
        }
    }

    public void orderAreas(){
        areas.sort(Comparator.reverseOrder());
    }

    public void mostrarArea(){
        System.out.println("El area mas grande posible es: ");
        System.out.println("-> " + areas.get(0));

    }
    
}

class Main {
    public static void main(String[] args) {
        
    }
}
