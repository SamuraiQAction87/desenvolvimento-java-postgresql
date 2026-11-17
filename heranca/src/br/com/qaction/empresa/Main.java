package br.com.qaction.empresa;

public class Main {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Fulano");
        tecnico.setSalario(1500);
        tecnico.setCpf("01234567890");
        tecnico.imprimirRemuneracao();

        Gerente gerente = new Gerente();
        gerente.setNome("Gerente01");
        gerente.setSalario(3000);
        gerente.setCpf("00123456789");
        gerente.imprimirRemuneracao();

    }
}













