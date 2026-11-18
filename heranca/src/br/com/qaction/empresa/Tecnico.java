package br.com.qaction.empresa;

public class Tecnico extends Funcionario {
    private String Especialidade;


    // Getters e Setters:
    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String especialidade) {
        Especialidade = especialidade;
    }

    /**
    * Implementação do 'abstract method' 'calcularBonificacaoAnual()' da SuperClasse
    * 'Funcionario':
     * */
    @Override
    public double calcularBonificacaoAnual() {
        return super.getSalario() * 2;
    }
}
