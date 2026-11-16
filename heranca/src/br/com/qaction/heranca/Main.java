package br.com.qaction.heranca;

public class Main {
    public static void main(String[] args) {
        // Instanciando 1º objeto filho da classe Animal:
        System.out.println("====================================================");
        System.out.println("Instanciando 1º objeto filho da classe Animal:");
        Panda panda = new Panda();
        panda.setNome("Ana");
        panda.setIdade(35);
        panda.setEspecie("Panda");
        panda.imprimirDados();

        // Instanciando 2º objeto filho da classe Animal:
        System.out.println("====================================================");
        System.out.println("Instanciando 1º objeto filho da classe Animal:");
        Hipopotamo hipopotamo = new Hipopotamo();
        hipopotamo.setNome("Pedro");
        hipopotamo.setIdade(38);
        hipopotamo.setEspecie("Hipopótamo");
        hipopotamo.imprimirDados();

    }
}
