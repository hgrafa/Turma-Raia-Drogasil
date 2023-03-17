package model;

public class Conta {

    // DRY : Dont Repeat Yourself
    // KISS: Keep It Simple Stupid
    // YAGNI: You ain't Gonna need it

    // atributos
    private String codigo;
    private Cliente cliente;
    private String senha;
    protected double saldo;
    private boolean ativa;

    // construtor
    public Conta(String codigo, String senha) {
        this.codigo = codigo;
        this.senha = senha;
    }

    // getters and setters
    public String getCodigo() {
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean depositar(double quantia) {
        if(!ativa)
            return false; // TODO melhorar depois com excessões

        this.saldo += quantia;
        return true;
    }

    public boolean sacar(double quantia) {
        if(!ativa)
            return false; // TODO melhorar depois com excessões

        if(this.saldo < quantia)
            return false; // TODO melhorar depois com excessões

        this.saldo -= quantia;
        return true;
    }

    public boolean transferir(double quantia, Conta destino) {
        if(!ativa)
            return false; // TODO melhorar depois com excessões

        if(this.saldo < quantia)
            return false; // TODO melhorar depois com excessões

        this.saldo -= quantia;
        destino.saldo += quantia;
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "codigo='" + codigo + '\'' +
                ", titular=" + cliente +
                ", senha='" + senha + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

//  arqueiro é uma personagem
//  arqueiro tem um arco (composição)
//  arco tem várias flechas
//  arco é uma arma (composição)

