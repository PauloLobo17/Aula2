package org.exemplo.Entrega;

public abstract class CargaDeConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargaDeConfianca(String nome, String cpf, String dataDeNascimento, double salarioBase, Bonificacao bonificacao) {

        super(nome, cpf, dataDeNascimento, salarioBase);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}
