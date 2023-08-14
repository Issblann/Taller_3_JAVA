package TiendaOnline;

public class Monitor implements Producto{

    String marca;
    double precio;
    int tamano;


    public Monitor( String marca, double precio, int tamano) {

        this.marca = marca;
        this.precio = precio;
        this.tamano = tamano;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public boolean mostrarDetalles() {
        System.out.println("Monitor marca" + marca + "con un tamaño de " + tamano + "tiene un precio de $: " + precio);
        return false;
    };
}
