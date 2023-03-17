package model;

public class ContaPoupanca extends Conta {

    // circulo é forma geométrica
    // posso ser um circulo e não ser forma geométrica? (false)
    // posso ser uma forma e não ser um círculo? (true)
    private String codigoDeOperacao;
    private double saldoGuardado;

    public ContaPoupanca(String codigo, String senha, String codigoDeOperacao) {
        super(codigo, senha);
        this.codigoDeOperacao = codigoDeOperacao;
    }

    public void guardar(double quantia) {
        if(saldo < quantia) { // protected
            return;
        }

        saldoGuardado += quantia;
    }

}
