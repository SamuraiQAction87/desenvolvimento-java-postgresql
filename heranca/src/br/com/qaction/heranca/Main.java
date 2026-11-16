package br.com.qaction.heranca;

public class Main {
    public static void main(String[] args) {
        // Instanciando 1º objeto filho da classe Animal:
        System.out.println("====================================================");
        System.out.println("Instanciando 1º objeto filho da classe Animal:");
        Panda panda = new Panda("Ana", 35, "Panda", "Branco", "Preto");

        // Instanciando 2º objeto filho da classe Animal:
        System.out.println("====================================================");
        System.out.println("Instanciando 1º objeto filho da classe Animal:");
        Hipopotamo hipopotamo = new Hipopotamo("Pedro", 38, "Hipopótamo",800);
    }
}
