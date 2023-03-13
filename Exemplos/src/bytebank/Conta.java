package bytebank;

public class Conta {

    private String numero;
    private String nome;
    private String apelido;
    private String cpf;
    private double saldo;

    // construtor


    public Conta(String numero, String nome, String apelido, String cpf) {
        this.numero = numero;
        this.nome = nome;
        this.apelido = apelido;
        this.cpf = cpf;
    }

    public Conta(String numero, String nome, String cpf) {
        this.numero = numero;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    // depósito
    public void deposito(double valor) {
        saldo += valor;
    }

    // sacar
    // transferencia
}
