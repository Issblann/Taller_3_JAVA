package TiendaOnline;

public class Rubor implements  Producto {

    String marca;
    double precio;
    String color;


    public Rubor(String marca, double precio, String color) {
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
        System.out.println("Rubor marca " + marca + " de color " + color + " tiene un precio de $" + precio);
        return false;
    };
}
