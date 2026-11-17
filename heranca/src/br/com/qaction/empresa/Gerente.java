package br.com.qaction.empresa;

public class Gerente extends Funcionario {

    @Override
    public double calcularBonificacao() {
        return super.calcularBonificacao() + 500;
    }
}
