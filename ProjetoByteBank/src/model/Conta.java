package model;

public class Conta {

    // atributos
    private String codigo;
    private Cliente titular;
    private String senha;
    protected double saldo;

    // construtor
    public Conta(String codigo, Cliente titular, String senha) {
        this.codigo = codigo;
        this.titular = titular;
        this.senha = senha;
    }

    // getters and setters
    public String getCodigo() {
        return codigo;
    }

    public String getSenha() {
        return senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "codigo='" + codigo + '\'' +
                ", titular=" + titular +
                ", senha='" + senha + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

//  arqueiro é uma personagem
//  arqueiro tem um arco (composição)
//  arco tem várias flechas
//  arco é uma arma (composição)
