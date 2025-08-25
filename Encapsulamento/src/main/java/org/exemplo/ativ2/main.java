package org.exemplo.ativ2;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        Funcionario f1= new Funcionario("João", "1", 3000, SETOR.FINANCEIRO, SEXO.MASCULINO, 30);
        Funcionario f2= new Funcionario("Maria", "2", 3500, SETOR.RECURSOS_HUMANOS, SEXO.FEMININO, 28);
        Funcionario f3= new Funcionario("Pedro", "3", 4000, SETOR.VENDAS, SEXO.MASCULINO, 35);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());

    }
}
