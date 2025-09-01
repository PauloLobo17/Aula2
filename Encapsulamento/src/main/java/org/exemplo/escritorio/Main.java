package org.exemplo.escritorio;

public class Main {
    public static void main(String[] args) {
        fisica pessoaFisica = new fisica("João Silva", "1234-5678", "123.456.789-00", "MG-12.345.678", "01/01/1990");
        juridica pessoaJuridica = new juridica("Empresa XYZ", "9876-5432", "12.345.678/0001-99", "123.456.789.000");

        System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);
    }
}
