package application;

import model.FiguraPlanaAbstrata;
import model.Retangulo;
import model.enums.Cor;

import java.util.ArrayList;
import java.util.List;

public class BancoDeFigurasApp {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(Cor.AZUL,5);

        // UpCasting
        FiguraPlanaAbstrata figura1 = new Retangulo(Cor.AMARELO, 5, 7.5);
        figura1.toString();

        List<Retangulo> retangulos = new ArrayList<>();

        // - começa vazia
        // - não tem quantidade fixa de elementos
        // - tem métodos

        retangulos.add(retangulo);
        retangulos.add(retangulo);
        retangulos.add(new Retangulo(Cor.ROXO, 8.0));
        retangulos.remove(retangulo);

        for(int i =0; i < retangulos.size(); i++){
            System.out.print(retangulos.get(i) + " ");
        }

        // Integer: int, Double: double, Boolean: boolean, Character: char, String
        

        retangulos.forEach((e) -> System.out.print(e + " "));
        retangulos
                .stream()
                .filter(r -> r.getAltura() > 2.0)
                .map(r -> r.getCor())
                .toList();

    }
}
