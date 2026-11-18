package br.com.qaction.empresa;

public class Main {
    public static void main(String[] args) {

        // Instanciando 1º objeto 'tecnico' do tipo 'Tecnico', filho da classe Funcionario:
        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Fulano");
        tecnico.setSalario(1500);
        tecnico.setCpf("01234567890");

        // Output do financeiro do Fulano:
        System.out.println("=======================================");
        System.out.println("Remuneração do Fulano: ");
        tecnico.imprimirRemuneracao();
        System.out.println("Bonus anual do Fulano: " + tecnico.calcularBonificacaoAnual());


        // Instanciando 1º objeto 'gerente' do tipo 'Gerente', filho da classe Funcionario:
        Gerente gerente = new Gerente();
        gerente.setNome("Gerente01");
        gerente.setSalario(3000);
        gerente.setCpf("00123456789");

        // Output do financeiro do Gerente01:
        System.out.println("=======================================");
        System.out.println("Remuneração do Gerente01: ");
        gerente.imprimirRemuneracao();
        System.out.println("Bonus anual do Gerente01: " + gerente.calcularBonificacaoAnual());
    }
}