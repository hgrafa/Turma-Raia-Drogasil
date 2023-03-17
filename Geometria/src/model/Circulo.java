package model;

import model.enums.Cor;
public class Circulo extends FiguraPlanaAbstrata {
    public static final double PI = 3.14159285;
    private double raio;

    public Circulo(Cor cor, double raio) {
        super(cor);
        qntdDeLados = 0;
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI*raio*raio;
    }

    @Override
    public double perimetro() {
        return 2*PI*raio;
    }


    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", Area = " + area() +
                ", Perimetro = " + perimetro() +
                ", Cor=" + cor +
                ", qntdDeLados = " + qntdDeLados +
                '}';
    }
}
