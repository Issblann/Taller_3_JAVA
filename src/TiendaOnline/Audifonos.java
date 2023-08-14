package TiendaOnline;

public class Audifonos implements Producto{

    String marca;
    double precio;
    String color;


    public Audifonos(String marca,  double precio, String color) {
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
        System.out.println("Audifonos marca" + marca + "de color " + color + "tiene un precio de $" + precio);
        return false;
    };
}
