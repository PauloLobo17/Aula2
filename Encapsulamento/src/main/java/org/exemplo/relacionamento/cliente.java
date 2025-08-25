package org.exemplo.relacionamento;

public class cliente {
    String nome;
    String idade;
    pet pet;

    public cliente(String nome, String cpf, pet pet) {
        this.nome = nome;
        this.idade = cpf;
        this.pet = pet;
    }

    public cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return idade;
    }

    public void setCpf(String cpf) {
        this.idade = cpf;
    }

    public pet getPet() {
        return pet;
    }

    public void setPet(pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + idade + '\'' +
                ", pet=" + pet +
                '}';
    }
}
