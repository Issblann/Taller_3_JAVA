package TiendaOnline;

public class Labial implements Producto{

    String marca;
    double precio;
    String color;


    public Labial( String marca, double precio, String color) {
        this.marca = marca;
        this.precio = precio;
        this.color = color;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public boolean mostrarDetalles() {
        System.out.println("Labial marca " + marca + " de color " + color + " tiene un precio de $" + precio);
        return false;
    };
}
