package org.exemplo.herença;

public class Main {
    public static void main(String[] args) {
        Calca calca = new Calca("Levi's", "Azul", "M", 199.99);
        Camisa camisa = new Camisa("Polo", "Branca", "G", 149.99);
        Sapato sapato = new Sapato("Nike", "Preto", "42", 299.99);

        System.out.println(calca);
        System.out.println(camisa);
        System.out.println(sapato);
    }
}
