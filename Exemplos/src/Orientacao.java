class Cachorro {
    // tem: atributos
    String nome;
    int idade;
    String raca;
    boolean estaDePe = true;

    // faz: método
    void fazerAniversario() {
        idade++;
    }

    void sentar() {
        estaDePe = false;
    }
}

class Pessoa {

    String nome;
    int idade;
    double altura;
    String telefone;
    Cachorro cachorroDaPessoa = null; // composição

    Pessoa() { // construtor
        System.out.println("estou criando uma pessoa");
    }
}

public class Orientacao {

    static double somar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        somar(2,3);
        Cachorro cachorroQuePertenceAoVinicius = new Cachorro();
        Pessoa vinicius = new Pessoa();
        System.out.println("pessoa criada!");

        vinicius.cachorroDaPessoa = cachorroQuePertenceAoVinicius;

        cachorroQuePertenceAoVinicius.nome = "big thor";
        cachorroQuePertenceAoVinicius.idade = 3;
        cachorroQuePertenceAoVinicius.raca = "Shitsu";

        System.out.println("Idade = " + cachorroQuePertenceAoVinicius.idade);
        cachorroQuePertenceAoVinicius.fazerAniversario();
        System.out.println("Idade = " + cachorroQuePertenceAoVinicius.idade);

    }
}