package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Instaciar a classe.

        Cliente c1 = new  Cliente();

        // Atribuindo valores.

        c1.setNome("Marta");
        c1.setIdade(25);

        // Exibindo dados.
        System.out.println("Nome: "+ c1.getNome());
        System.out.println("idade: "+ c1.getIdade());

        Produto p1 = new Produto();

        p1.setNome("Morango do amor ");
        p1.setPreco(50);

        System.out.println("Nome: " + p1.getNome());
        System.out.println("preco: "+ p1.getPreco());

    }
}