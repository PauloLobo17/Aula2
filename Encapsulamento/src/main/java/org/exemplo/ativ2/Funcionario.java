package org.exemplo.ativ2;

public class Funcionario {
    private String nome;
    private String id;
    private int Salario;
    private SETOR setor;
    private SEXO sexo;
    private int idade;
    
    public Funcionario(String nome, String id, int salario, SETOR setor, SEXO sexo, int idade) {
        this.nome = nome;
        this.id = id;
        Salario = salario;
        this.setor = setor;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }

    public SETOR getSetor() {
        return setor;
    }

    public void setSetor(SETOR setor) {
        this.setor = setor;
    }

    public SEXO getSexo() {
        return sexo;
    }

    public void setSexo(SEXO sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", Salario=" + Salario +
                ", setor=" + setor +
                ", sexo=" + sexo +
                ", idade=" + idade +
                '}';
    }
}
