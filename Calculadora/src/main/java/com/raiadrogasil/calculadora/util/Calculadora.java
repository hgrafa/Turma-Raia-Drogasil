package com.raiadrogasil.calculadora.util;

import java.io.IOException;

public class Calculadora {
    public static double dividir (double a, double b)
            throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("deu erro na divisão da calculadora");
        }

        return a / b;
    }

    public static double somar(double... valores) { //varargs
        double aux = 0;
        // enhanced for each: for encantado/melhorada
        for (var valor : valores) {
            aux += valor;
        }
        return aux;
    }

}
