package br.com.qaction.heranca;

public class Hipopotamo extends Animal {
    // Atributos encapsulados:
    private int forcaMordida;

    // Construtor:


    public Hipopotamo(String nome, int idade, String especie, int forcaMordida) {
        // Chamando o construtor da super classe:
        super(nome, idade, especie);
        // Atributo da instância:
        this.forcaMordida = forcaMordida;
    }

    //Metodos específicos:
    public void ficarNaAgua() {
        System.out.println("Entrando na água...");
    }

    // Getters && Setters:
    public int getForcaMordida() {
        return forcaMordida;
    }

    public void setForcaMordida(int forcaMordida) {
        this.forcaMordida = forcaMordida;
    }
}
