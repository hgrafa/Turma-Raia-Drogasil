import model.Cliente;
import model.Conta;
import model.Endereco;

public class ByteBankApp {
    public static void main(String[] args) {
        Cliente pedroCliente = new Cliente("Pedro Santos", "1");
        Cliente beatrizCliente = new Cliente("Beatriz Souza", "Bia", "2");

        Endereco e1 = new Endereco();
        Endereco e2 = new Endereco();

        e1.setCep("111.222-33");
        e1.setEstado("MG");
        e1.setNumero("123B");

        e2.setCep("111.222-34");
        e2.setEstado("CE");
        e2.setNumero("122B");

        pedroCliente.setEndereco(e1);
        beatrizCliente.setEndereco(e2);

        Conta c1 = new Conta("2B", pedroCliente, "123pass");
        Conta c2 = new Conta("2C", beatrizCliente, "senha1234");

        Conta[] banco = new Conta[10];
        banco[0] = new Conta(
                "4D",
                new Cliente("Yudi Tamashiro", "10"),
                "4002-8922");


        String ruaDaBeatriz = c2
                .getTitular()
                .getEndereco()
                .getCep();

        System.out.println(ruaDaBeatriz);
        System.out.println(c2);

    }
}