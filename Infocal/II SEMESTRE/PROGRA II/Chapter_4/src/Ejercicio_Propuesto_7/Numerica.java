package Ejercicio_Propuesto_7;

public abstract class Numerica {
    public abstract String toString();
    public abstract boolean equals(Object obj);
    public abstract Numerica sumar(Numerica num);
    public abstract Numerica restar(Numerica num);
    public abstract Numerica multiplicar(Numerica num);
    public abstract Numerica dividir(Numerica num);
}

abstract class Fraccion extends Numerica{
    int numerado, denominador;

    public Fraccion(int numerado, int denominador) {
        this.numerado = numerado;
        this.denominador = denominador;
    }

    @Override
    public String toString(){
        return;
    }
    @Override
    public boolean equals(Object obj){
        return;
    }
    @Override
    public Numerica sumar(Numerica num){
        return;
    }
    @Override
    public Numerica restar(Numerica num){
        return;
    }
    @Override
    public Numerica multiplicar(Numerica num){
        return;
    }
    @Override
    public Numerica dividir(Numerica num){
        return;
    }
}

class Prueba{
    public static void main(String[] args) {
        Fraccion obj1 = new Fraccion(4,2);
    }
}
