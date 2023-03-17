package com.raiadrogasil.calculadora.model;

import java.util.List;

public class Empresa {

    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionaFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    // WrapperList : embrulhar, empacotar
    // baeldung: instrumentalização de listas, embrulhamento, ...

}
