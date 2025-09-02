package org.exemplo.atvi3;

public class Main {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        operacaomat soma = new Soma();
        operacaomat subtracao = new Subtracao();
        operacaomat multiplicacao = new Multiplicacao();
        operacaomat divisao = new Divisao();

        System.out.println( soma.calcular(num1, num2));
        System.out.println( subtracao.calcular(num1, num2));
        System.out.println( multiplicacao.calcular(num1, num2));
        System.out.println( divisao.calcular(num1, num2));
    }
}
