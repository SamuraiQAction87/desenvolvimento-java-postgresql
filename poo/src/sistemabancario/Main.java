package sistemabancario;

public class Main {
    public static void main(String[] args) {
        // Instanciando o objeto com base na classe Cliente:
        Cliente fulano = new Cliente();

        // Chamando os metodos da classe por meio do objeto
        // para cadastrar o cliente:
        fulano.nome = "Fulano";
        fulano.cpf = "01234567890";

        // Instanciando uma conta:
        Conta contaFulano = new Conta();
        contaFulano.titular = fulano;
        contaFulano.numero = 1001;
        contaFulano.saldo = 201;

        // Imprime o saldo antes de receber o depósito:
        System.out.println("==========================================");
        System.out.println("Saldo antes do depósito: " + contaFulano.saldo);

        /*
         * Instância da classe Banco para acessar aos métodos*/
        Banco sistemaBancario = new Banco();
        // Metodo depositar:
        sistemaBancario.depositar(contaFulano, 100d);
        // Imprime o saldo após receber o depósito:
        System.out.println("==========================================");
        System.out.println("Saldo após o depósito: " + contaFulano.saldo);

        // Testando metodo sacar:
        System.out.println("==========================================");
        System.out.println("Testando metodo sacar: $50.");
        sistemaBancario.sacar(contaFulano, 50);
        contaFulano.imprimirSaldo();

        // Testa a Regra de Negócio: saque < saldo:
        System.out.println("==========================================");
        System.out.println("Testando Regra de Negócio: Sacando $400.");
        sistemaBancario.sacar(contaFulano, 400);
        contaFulano.imprimirSaldo();
    }
}











