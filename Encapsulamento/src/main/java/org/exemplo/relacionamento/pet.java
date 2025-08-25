package org.exemplo.relacionamento;

public class pet {
    String nome;
    String raca;
    int idade;

    public pet(String nome, String tipo, int idade) {
        this.nome = nome;
        this.raca = tipo;
        this.idade = idade;
    }

    public pet() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return raca;
    }

    public void setTipo(String tipo) {
        this.raca = tipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", tipo='" + raca + '\'' +
                ", idade=" + idade +
                '}';
    }
}
