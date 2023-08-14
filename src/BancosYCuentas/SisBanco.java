package BancosYCuentas;

public interface SisBanco {

   void depositarDinero(double cantidad);
   boolean retirarDinero(double cantidad);
   double obtenerSaldo();
}
