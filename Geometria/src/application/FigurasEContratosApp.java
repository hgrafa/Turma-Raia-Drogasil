package application;

import model.Circulo;
import model.FiguraPlanaAbstrata;
import model.Retangulo;
import model.enums.Cor;
import view.Menu;

public class FigurasEContratosApp {

    static void dizerOi() {
        System.out.println("oi");
    }

    public static void main(String[] args) {
        FigurasEContratosApp.dizerOi();

        FiguraPlanaAbstrata f = new Retangulo(Cor.AZUL, 3.0);
        Menu.apresentarMenu();
        var x = Math.floor(2.3); // pq o floor -3.4 é -4

        Circulo circulo = new Circulo(Cor.AMARELO, 3.0);
        System.out.println(circulo);

    }
}
