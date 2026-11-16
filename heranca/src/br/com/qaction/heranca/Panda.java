package br.com.qaction.heranca;

public class Panda extends Animal {
    // Atributos encapsulados:
    private String cor;
    private String corSecundaria;

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
