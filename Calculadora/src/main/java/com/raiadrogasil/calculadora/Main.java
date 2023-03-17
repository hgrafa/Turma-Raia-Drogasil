package com.raiadrogasil.calculadora;

import com.raiadrogasil.calculadora.util.Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void trocar(int x, int y) {
        // x = 5, y = 6
        int aux = x;
        x = y; // x = 6, y = 6
        y = aux;
    }

    public static void main(String[] args) {

        // throw: arremesse (ordem)
        // throws: arremessa (possibilidade)
        Scanner teclado = new Scanner(System.in);
        double a, b, resultado;

        try {
            a = teclado.nextDouble();
            b = teclado.nextDouble();
            resultado = Calculadora.dividir(a, b);
            System.out.println(resultado);
        } catch(InputMismatchException | ArithmeticException e) {
            System.err.println("menssagem: " + e.getMessage());
        }

        var soma = Calculadora.somar(11, 22, 35, 47);
        int c = 3, d = 4;
        trocar(c, d);
        System.out.println("C = " + c + " | D = " + d);
        System.out.println("terminou a calculadora");
    }
}