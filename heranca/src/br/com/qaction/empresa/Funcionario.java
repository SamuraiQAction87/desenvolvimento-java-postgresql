package br.com.qaction.empresa;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    // Metodo que calcula a bonificação:
    public double calcularBonificacao() {
        return (salario / 10) + 50;
    }

    // Imprime o salário já com a bonificação:
    public void imprimirRemuneracao() {
        double remuneracao = salario + this.calcularBonificacao();
    }

    // Getters e Setters:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
