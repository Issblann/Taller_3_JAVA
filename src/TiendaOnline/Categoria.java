package TiendaOnline;

import java.util.ArrayList;
import java.util.List;

public abstract class Categoria {
    public static String nombre;
    public  static List<Producto> productos = new ArrayList<>();

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
}
