package Cartas;

 class CartaPoker extends CartaBase{

    public CartaPoker(String palo, String valor) {
        super(palo, valor);
    }

    @Override
    public int valorNumerico() {
        if (valor.equals("A")){
            return 11;
        } else if(valor.equals("K") || valor.equals("Q") || valor.equals("J")){
            return 10;
        } else{
            return Integer.parseInt(valor);
        }
    }
}
