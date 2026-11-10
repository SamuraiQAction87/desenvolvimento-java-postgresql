package sistemabancario;

public class Main {
    public static void main(String[] args) {

        // Instanciando o objeto 1º Cliente:
        Cliente fulano = new Cliente();
        // Inicializando os atributos:
        fulano.nome = "Fulano";
        fulano.cpf = "01234567890";

        // Instanciando e cadastrando uma conta para o 1º cliente:
        Conta contaFulano = new Conta();
        contaFulano.titular = fulano;
        contaFulano.numero = 1001;
        contaFulano.saldo = 201;

        // Instanciando o 2º cliente:
        Cliente cicrano = new Cliente();
        // Inicializando atributos:
        cicrano.nome = "Cicrano";
        cicrano.cpf = "09876543210";

        // Instanciando e cadastrando uma conta para o 2º cliente:
        Conta contaCicrano = new Conta();
        contaCicrano.titular = cicrano;
        contaCicrano.numero = 1002;
        contaCicrano.saldo = 0;

        // Imprime o saldo antes de receber o depósito:
        System.out.println("==========================================");
        System.out.println("Saldo antes do depósito: " + contaFulano.saldo);

        // Instância da classe Banco para acessar os métodos:
        Banco sistemaBancario = new Banco();
        // Testando o metodo depositar no 1º cliente:
        sistemaBancario.depositar(contaFulano, 100d);
        // Imprime o saldo após 1º cliente receber o depósito:
        System.out.println("==========================================");
        System.out.println("Saldo após o depósito: " + contaFulano.saldo);

        // Testando metodo sacar no 1º cliente:
        System.out.println("==========================================");
        System.out.println("Testando metodo sacar: $50.");
        sistemaBancario.sacar(contaFulano, 50);
        contaFulano.imprimirSaldo();

        // Testa a Regra de Negócio no 1º cliente: SE saldoAtualizado > 0:
        System.out.println("==========================================");
        System.out.println("Testando Regra de Negócio: Sacando $400.");
        sistemaBancario.sacar(contaFulano, 400);
        contaFulano.imprimirSaldo();

        // Testando o metodo "transferir":
        System.out.println("==========================================");
        System.out.println("Imprimindo saldo antes da transferência:");
        contaFulano.imprimirSaldo();
        contaCicrano.imprimirSaldo();
        System.out.println("Testando o método 'transferir': transferindo $120.");
        sistemaBancario.transferir(contaFulano, contaCicrano, 120);
        System.out.println("==========================================");
        System.out.println("Imprimindo saldo após à transferência:");
        contaFulano.imprimirSaldo();
        contaCicrano.imprimirSaldo();

    }
}











