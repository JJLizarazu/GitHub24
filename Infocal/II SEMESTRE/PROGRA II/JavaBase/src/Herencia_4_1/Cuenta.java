package Herencia_4_1;

import java.util.*;

public class Cuenta {
    protected float saldo, tasaAnual, comisionMensual = 0;
    protected int numeroConsignaciones = 0, numeroRetiros = 0;
    public Cuenta(float saldo, float tasaAnual){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad){
        saldo = saldo + cantidad;
        numeroConsignaciones = numeroConsignaciones + 1;
    }

    public void retirar(float cantidad){
        float nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo >= 0){
            saldo -= cantidad;
            numeroRetiros = numeroRetiros + 1;
        } else {
            System.out.println("La cantidad a retirar excede el saldo actual");
        }
    }

    public void calcularInteres(){
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
    }

    public void extractoMensual(){
        saldo -= comisionMensual;
        calcularInteres();
    }
}
class CuentaAhorros extends Cuenta {
    private boolean activa;
    public CuentaAhorros (float saldo, float tasa){
        super(saldo, tasa);
        if (saldo < 10000)
            activa = false;
        else activa = true;
    }

    public void retirar(float cantidad){
        if (activa)
            super.retirar(cantidad);
    }

    public void consignar(float cantidad){
        if (activa)
            super.consignar(cantidad);
    }

    public void extractoMensual(){
        if (numeroRetiros > 4){
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        if (saldo < 10000)
            activa = false;
    }

    public void dataPrint(){
        System.out.println("Saldo = Bs." + saldo);
        System.out.println("Comisión mensual = Bs." + comisionMensual);
        System.out.println("Número de transacciones = " + (numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
}

class CuentaCorriente extends Cuenta{
    float sobregiro;
    public CuentaCorriente(float saldo, float tasa){
        super(saldo, tasa);
        sobregiro = 0;
    }

    public void retirar(float cantidad){
        float resultado = saldo - cantidad;
        if (resultado < 0){
            sobregiro = sobregiro - resultado;
        } else {
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad) {
        float residuo = sobregiro - cantidad;
        if (sobregiro > 0){
            if (residuo > 0){
                sobregiro = 0;
                saldo = residuo;
            } else {
                sobregiro = -residuo;
                saldo = 0;
            }
        } else {
            super.consignar(cantidad);
        }
    }

    public void dataPrint(){
        System.out.println("Saldo = Bs." + saldo);
        System.out.println("Cargo mensual = Bs." + comisionMensual);
        System.out.println("Número de transacciones = " + (numeroConsignaciones + numeroRetiros));
        System.out.println("Valor de sobregiro = Bs." + (numeroConsignaciones + numeroRetiros));
        System.out.println(" ");
    }
}

class PruebaCuenta{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuenta de Ahorros");
        System.out.println("Ingrese saldo incial: ");
        System.out.print("-> Bs."); float saldoInicialAhorros = sc.nextFloat();
        System.out.println("Ingrese tasa de interés: ");
        System.out.print("-> "); float tasaAhorros = sc.nextFloat();
        //
        CuentaAhorros cuenta_1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);
        //
        System.out.println("Ingresar cantidad a consigar: ");
        System.out.print("-> Bs."); float cantidadRetirar = sc.nextFloat();
        cuenta_1.retirar(cantidadRetirar);
        cuenta_1.extractoMensual();
        cuenta_1.dataPrint();
    }
}
