package Figuras_Geometricas;

public class Triangulo implements Figura {

    private double base;
    private double altura;

    private double ladoA;
    private double ladoB;
    private double ladoC;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura ;
    }

    @Override
    public double calcularPerimetro() {
        return ladoA +  ladoB + ladoC;
    }
}
