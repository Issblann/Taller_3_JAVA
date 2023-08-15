import Animales.Animales;
import Animales.Gato;
import BancosYCuentas.CuentaAhorros;
import BancosYCuentas.CuentaCorriente;
import BancosYCuentas.SisBanco;
import Cartas.Baraja;
import Cartas.Carta;
import Figuras_Geometricas.Circulo;
import Figuras_Geometricas.Cuadrado;
import Figuras_Geometricas.Figura;
import Figuras_Geometricas.Triangulo;
import Sis_Notificaciones.CorreoElectronico;
import Sis_Notificaciones.MensajeTexto;
import Sis_Notificaciones.NotificacionesPush;
import Sis_Notificaciones.TiposNotificaciones;
import TiendaOnline.*;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Descomente el programa que desea ejecutar
        //figurasGeometricas();
        //sistemaNotificaciones();
        //sistemaBancos();
        //cartasPoker();
        //tiendaOnline();
        animalesEjercicio();
    };
    private static String formatDecimal(double value) {
        return String.format("%.2f", value);
    }
    public static void figurasGeometricas(){

        // Aqui se implementa el array con el polimorfismo (punto 7)
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(5.0));
        figuras.add(new Circulo(3.0));
        figuras.add(new Cuadrado(2));
        figuras.add(new Cuadrado(6));
        figuras.add(new Triangulo(5.4, 3));
        figuras.add(new Triangulo(4, 6));

        for (Figura figura: figuras) {
            double area = figura.calcularArea();
            double perimetro = figura.calcularPerimetro();
            System.out.println("Area de la figura: " + formatDecimal(area));
            System.out.println("Perimetro de la figura: " + formatDecimal(perimetro));
        }

    }

    public static void sistemaNotificaciones(){
        TiposNotificaciones correo = new CorreoElectronico("anapp@outlook.com", "Correo de facebook");
        TiposNotificaciones mensaje = new MensajeTexto("315573343", "SMS Claro");
        TiposNotificaciones push = new NotificacionesPush("Android", "Bienvenido");

        correo.enviar();
        mensaje.enviar();
        push.enviar();

    }

    public static void sistemaBancos(){

        CuentaAhorros cuentaAhorro1 = new CuentaAhorros("Ana Rodriguez", 2000);
        cuentaAhorro1.depositarDinero(500);
        System.out.println("Titular: " + cuentaAhorro1.getTitular());
        System.out.println("Numero de cuenta: " + cuentaAhorro1.getNumeroCuenta());
        System.out.println("Saldo: " + cuentaAhorro1.obtenerSaldo());

        System.out.println("--------------------");

        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("Diego Ramirez", 3000);
        cuentaCorriente1.retirarDinero(700);
        System.out.println("Titular: " + cuentaCorriente1.getTitular());
        System.out.println("Numero de cuenta: " + cuentaCorriente1.getNumeroCuenta());
        System.out.println("Saldo: " + cuentaCorriente1.obtenerSaldo());
    }

    public static void cartasPoker(){
        Baraja baraja = new Baraja();
        baraja.barajar();

        for (int i = 0; i < 7; i++){
            Carta carta = baraja.repartirCarta();
            if (carta != null){
                carta.mostrarCarta();
                int valor = carta.valorNumerico();
                System.out.println("Valor numerico: " + valor);
            } else{
                System.out.println("No quedan más cartas en la baraja.");
            }
        }
    }

    public static void tiendaOnline(){

        Labial labial1 = new Labial("vogue", 30000, "rojo");
        Labial labial2 = new Labial("bissu", 15000, "rosa palido");
        Rubor rubor1 = new Rubor("bissu", 20000, "anaranjado");
        Delineador delineador1 = new Delineador("Sammy", 19000, "negro");

        Monitor monitor1 = new Monitor("ASUS", 300, 27);
        Jean jean1 = new Jean("Bershka", 50, "Azul", 12);

        CategoriaBelleza categoriaBelleza = new CategoriaBelleza();
        categoriaBelleza.agregarProducto(labial1);
        categoriaBelleza.agregarProducto(rubor1);
        categoriaBelleza.agregarProducto(delineador1);

        CategoriaRopa categoriaRopa = new CategoriaRopa();
        categoriaRopa.agregarProducto(jean1);



            System.out.println("Productos en la categoría " + Categoria.nombre + ":");
            for (Producto producto : Categoria.productos) {
                System.out.println(producto.mostrarDetalles());
            }
            System.out.println();
    }

    public static void animalesEjercicio(){

        Animales[] animalesArray = {new Gato(), new Animales.Pajaro()};

        for (Animales animal :  animalesArray) {
           animal.hacerSonido();
        }

    }
}