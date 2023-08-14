package BancosYCuentas;


import java.util.Random;


public abstract class ImpBanco implements  SisBanco{
    protected String numeroCuenta;
    protected String titular;
    protected double saldo;
    protected static Random random = new Random();


    public ImpBanco( String titular, double saldo) {
        this.numeroCuenta = generarNumeroCuenta();
        this.titular = titular;
        this.saldo = saldo;
    }

    public String generarNumeroCuenta(){
        return  Long.toString(Math.abs(random.nextLong()));
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }


}
