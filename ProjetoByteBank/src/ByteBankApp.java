import model.Cliente;
import model.Conta;
import model.Endereco;
import service.ContaService;

public class ByteBankApp {
    public static void main(String[] args) {
        Cliente pedroCliente = new Cliente("Pedro Santos", "1");
        Cliente beatrizCliente = new Cliente("Beatriz Souza", "Bia", "2");
        Cliente yudi = new Cliente("Yudi Tamashiro", "yudi" , "4002-8922");

        Endereco e1 = new Endereco();
        Endereco e2 = new Endereco();

        Conta c1 = new Conta("2B", "123pass");
        Conta c2 = new Conta("2C", "senha1234");

        ContaService service = new ContaService();
        try {
            var teste1 = service.cadastraCliente(yudi);
            var teste2 = service.cadastraConta(c1, "4002-8922");
            var teste3 = service.cadastraConta(c2, "100000");
            System.out.println(teste1);
            System.out.println(teste2);
            System.out.println(teste3);
        } catch (Exception ignored) {
            // TODO centralizar tratamento das excessões
        }

    }
}