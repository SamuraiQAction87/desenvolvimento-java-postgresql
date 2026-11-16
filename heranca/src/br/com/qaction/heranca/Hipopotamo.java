package br.com.qaction.heranca;

public class Hipopotamo extends Animal {
    // Atributos encapsulados:
    private int forcaMordida;

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
