package FigurasLienzo;

public class Lienzo {

    private Dibujable[] dibujables;

    public Lienzo(Dibujable[] dibujables) {
        this.dibujables = dibujables;
    }

    public void dibujarTodo(){
        for (Dibujable dibujable: dibujables) {
            dibujable.dibujar();
        }
    }
}
