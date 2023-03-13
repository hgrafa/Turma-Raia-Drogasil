package model;

public class Cliente {

    private String nome;
    private String apelido;
    private String cpf;
    private Endereco endereco;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(String nome, String apelido, String cpf) {
        this.nome = nome;
        this.apelido = apelido;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' + "\n" +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
