package Figuras_Geometricas;

public class Cuadrado implements Figura{

    private double longitud;

    public Cuadrado(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public double calcularArea() {
        return Math.pow(longitud, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 4 * longitud;
    }
}
