package TiendaOnline;

public class Jean implements Producto{

    String marca;
    double precio;
    String color;

    int talla;


    public Jean(String marca, double precio, String color, int talla) {
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.talla = talla;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public boolean mostrarDetalles() {
        System.out.println("Jean marca " + marca + " de color " + color + " talla " + talla +  " tiene un precio de $" + precio);
        return false;
    };
}
