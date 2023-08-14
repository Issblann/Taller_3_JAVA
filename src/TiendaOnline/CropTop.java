package TiendaOnline;

public class CropTop implements Producto{

    String marca;
    double precio;
    String color;


    String talla;


    public CropTop(String marca, double precio, String color, String talla) {
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
        System.out.println("Croptop marca" + marca + "de color " + color + "talla(en letras) " + talla +  "tiene un precio de $: " + precio);
        return false;
    };
}
