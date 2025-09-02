package org.exemplo.atvi3;

public class Divisao implements operacaomat {
    @Override
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
