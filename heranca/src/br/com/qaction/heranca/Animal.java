package br.com.qaction.heranca;

public class Animal {
    // Atributos encapsulados:
    private String nome;
    private int idade;
    private String especie;

    // Construtor canônico:
    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    // Getters && Setters:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    // Metodos comuns:
    public void andar() {
        System.out.println("Andando...");
    }

    public void comer() {
        System.out.println("Comendo...");
    }

    public void dormir() {
        System.out.println("Dormindo...");
    }

    protected void imprimirDados() {
        System.out.println("O nome do animal " + this.getEspecie() + " é: " + this.getNome());
        System.out.println("A idade de " + this.getNome() + " é: " + this.getIdade());
    }
}
