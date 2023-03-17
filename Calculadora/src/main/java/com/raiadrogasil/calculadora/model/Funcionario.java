package com.raiadrogasil.calculadora.model;

import com.raiadrogasil.calculadora.util.Calculadora;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private String nome;
    private double salarioBruto;
    private double imposto;
    private List<Double> vendas;

    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getSalarioLiquido() {
        return salarioBruto - imposto;
    }

    public double getTotalDasVendas() {
        // arrow function, funcao anonima, expressao lambda
        // List<Integer> lista1 = new ArrayList<>();
        // List<Integer> lista2 = new ArrayList<>(lista1);
        // List<Integer> lista3 = lista1;

        // stream : {operações intermediárias, operações terminais}
        // filter, map, reduce
//        List<Funcionario> funcionarios = new ArrayList<>();
//
//        var soma = funcionarios
//                .stream()
//                .filter(f -> f.getNome().equals("Pedro")) // tal que
//                .map(f -> f.getSalarioLiquido())
//                .reduce(0.0, (x, y) -> x+y);

        int quantidadeDeVendas = vendas.size();
        double[] valores = new double[quantidadeDeVendas];

        for(int i = 0; i < vendas.size(); i++) {
            valores[i] = vendas.get(i);
        }

        return Calculadora.somar(valores);
    }

}
