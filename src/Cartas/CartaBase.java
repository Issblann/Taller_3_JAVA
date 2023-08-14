package Cartas;

public abstract class CartaBase implements Carta{

    protected String palo;
    protected String valor;

    public CartaBase(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    @Override
    public void mostrarCarta() {
        System.out.println(valor + " de " + palo);
    }
}
