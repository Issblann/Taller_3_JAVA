package TiendaOnline;

public class Camiseta implements Producto{
    String marca;
    double precio;
    String color;
    String talla;


    public Camiseta(String marca, double precio, String color, String talla) {
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
        System.out.println("Camiseta marca" + marca + "de color " + color + "talla(en letras) " + talla +  "tiene un precio de $" + precio);
        return false;
    };
}
