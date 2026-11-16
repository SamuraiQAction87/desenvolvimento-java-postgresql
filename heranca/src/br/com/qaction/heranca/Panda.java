package br.com.qaction.heranca;

public class Panda extends Animal {
    // Atributos encapsulados:
    private String cor;
    private String corSecundaria;

    // Construtor:
    public Panda(String nome, int idade, String especie, String cor, String corSecundaria) {
        // Chamando o construtor da super classe:
        super(nome, idade, especie);
        // Atributos da instância:
        this.cor = cor;
        this.corSecundaria = corSecundaria;
    }

    //Metodos específicos:
    public void subirArvore() {
        System.out.println("Subindo...");
    }

    // Getters && Setters:
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCorSecundaria() {
        return corSecundaria;
    }

    public void setCorSecundaria(String corSecundaria) {
        this.corSecundaria = corSecundaria;
    }
}
