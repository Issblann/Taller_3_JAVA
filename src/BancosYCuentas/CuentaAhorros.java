package BancosYCuentas;

import java.util.Scanner;

public class CuentaAhorros extends  ImpBanco {

    public CuentaAhorros(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void depositarDinero(double cantidad) {
        if (cantidad > 0){
            saldo += cantidad;
            System.out.println("Se depositaron $" + cantidad + " en tu cuenta ahorros");
        }
    }

    @Override
    public boolean retirarDinero(double cantidad) {

        if (cantidad > 0 && saldo >= cantidad){
            saldo -= cantidad;
            System.out.println("Se retiraron $" + cantidad + "de tu cuenta ahorros");
            return true;
        } else{
            System.out.println("Saldo insuficiente.");
            return false;
        }

    }

    @Override
    public double obtenerSaldo() {
       return saldo;
    }
}
