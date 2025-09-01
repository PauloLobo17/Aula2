package org.exemplo.Empresa;

public class Main {
    public static void main(String[] args) {
        Endereco enderecoEngenheiro = new Endereco("Rua A", "123", "Apto 1", "12345-678", "Cidade X");
        engenheiro engenheiro = new engenheiro("João Silva", "loboeduar77@gmail.com", 5000.0f, enderecoEngenheiro,"8545");


        Endereco enderecoMedico = new Endereco("Rua B", "456", "Casa", "98765-432", "Cidade Y");
        medico medico = new medico("Maria Souza","mariasouza22@gmail.com", 7000.0f, enderecoMedico,"1234");

        System.out.println(engenheiro);
        System.out.println(medico);
    }
}
