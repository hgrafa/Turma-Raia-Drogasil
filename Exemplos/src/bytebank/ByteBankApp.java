package bytebank;

public class ByteBankApp {

    public static void main(String[] args) {

        Conta acc1 = new Conta("123-abc", "Pedro", "000-111-000-01");
        Conta acc2 = new Conta(
                "123-abc",
                "Joao Pedro",
                "JP",
                "000-111-000-02"
        );

        acc2.deposito(46.78);

        System.out.println(acc2.getSaldo());

    }
}
