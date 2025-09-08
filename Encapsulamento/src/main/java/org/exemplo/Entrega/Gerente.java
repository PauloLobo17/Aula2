package org.exemplo.Entrega;

public class Gerente extends CargaDeConfianca implements Contratacao {


    public Gerente(String nome, String cpf, String dataDeNascimento, double salarioBase, Bonificacao bonificacao) {

        super(nome, cpf, dataDeNascimento, salarioBase, bonificacao);
    }


    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + this.obterSalarioFinal() +
                '}';
    }

    @Override
    public double obterSalarioFinal() {
        return super.salarioBase * super.getBonificacao().getValor();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir:" + funcionario);

    }

    @Override
    public void demitir(Funcionario funcionario) {

    }
}
