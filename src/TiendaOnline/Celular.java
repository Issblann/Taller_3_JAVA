package TiendaOnline;

public class Celular implements Producto {
    String marca;
    double precio;
    String color;
    int tamano;


    public Celular(String marca, double precio, String color, int tamano) {
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.tamano = tamano;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public boolean mostrarDetalles() {
        System.out.println("Celular marca" + marca + "de color " + color + "con un tamaño de " + tamano + "tiene un precio de $" + precio);
        return false;
    };
}
