package br.com.qaction.heranca;

public class Animal {
    // Atributos encapsulados:
    private String nome;
    private int idade;

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

    public void imprimirDados() {
        System.out.println("O nome do Panda é: " + this.getNome());
        System.out.println("A idade do Panda é: " + this.getIdade());
    }
}
