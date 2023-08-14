package TiendaOnline;

public class Delineador implements Producto{
    String marca;
    double precio;
    String color;


    public Delineador(String marca, double precio, String color) {

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
        System.out.println("Delineador marca " + marca + " de color " + color + " tiene un precio de $" + precio);
        return false;
    };
}
