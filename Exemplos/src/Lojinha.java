import java.util.Locale;
import java.util.Scanner;

public class Lojinha {

    static double calculaValorEstoque(int quantidade, double preco) {
        return quantidade * preco;
    }

    static void apresentarBoasVindas(){
        // void: vazio
        System.out.println("mensagem1");
    }

    // string, char: texto
    // double, float = pra virgula
    // short, int, long: inteiros
    // boolean: verdadeiro ou falso

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // configurarLocal

        Scanner teclado = new Scanner(System.in);
        // buffer: fila de espera - FIFO: first in first out

        double preco1, preco2;

        System.out.print("Digite o preço 1: ");
        preco1 = teclado.nextDouble();
        System.out.print("Digite o preço 2: ");
        preco2 = teclado.nextDouble();

        int quantidade1, quantidade2;
        System.out.print("Digite o quantidade 1: ");
        quantidade1 = teclado.nextInt();
        System.out.print("Digite o quantidade 2: ");
        quantidade2 = teclado.nextInt();

        double valorEmEstoque1 = calculaValorEstoque(quantidade1, preco1);
        double valorEmEstoque2 = calculaValorEstoque(quantidade2, preco2);
        double valorTotal = valorEmEstoque1 + valorEmEstoque2;

        double valorMedio = valorTotal / 2;

        // %d : decimal -> para coisas inteiras
        // %c : character -> para caracteres
        // %s : strings -> para textos
        // %f : float -> para numeros com virgula
        // \n : new line
        // `nome: ${nomeDaPessoa}` : template literals

        // System.out.println("Valor Total (segundo) : R$" + valorEmEstoque1);
        // System.out.println("Valor Total (segundo) : R$" + valorEmEstoque2);

        // Concatenação: "Hello " + "World!";

        System.out.printf("Quantidade: %d | Preço: %.2f | Valor Total (primeiro) : R$%.2f\n", quantidade1, preco1, valorEmEstoque1);
        System.out.printf("Quantidade: %d | Preço: %.2f | Valor Total (primeiro) : R$%.2f\n", quantidade2, preco2, valorEmEstoque2);
        System.out.printf("Valor Médio : R$%.2f", valorMedio);
    }

}

// stacktrace: pilha rastro
// pilha: LIFO: last in first out