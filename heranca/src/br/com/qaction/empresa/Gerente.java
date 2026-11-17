package br.com.qaction.empresa;

public class Gerente extends Funcionario {
    /** Além da bonificação padrão, o Gerente ganha + 500
     * na sobrescrita e especialização do metodo 'calcularBonificacao'. */
    @Override
    public double calcularBonificacao() {

        return super.calcularBonificacao() + 500;
    }
}
