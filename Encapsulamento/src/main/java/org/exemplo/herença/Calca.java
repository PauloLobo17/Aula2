package org.exemplo.herença;

public class Calca extends produto{

    public Calca(String marca, String cor, String tamanho, double preco) {
        super(marca, cor, tamanho, preco);
    }

    @Override
    public String toString() {
        return "Calca{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", preco=" + preco +
                '}';
    }
}
