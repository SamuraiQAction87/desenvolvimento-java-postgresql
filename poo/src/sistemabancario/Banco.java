package sistemabancario;

public class Banco {
    // Metodos:
    // Metodo depositar:
    void depositar(Conta conta, double deposito) {
        // Salva o saldo na variável 'saldoAtual':
        double saldoAtual = conta.saldo;
        // Soma o saldo atual + valor do depósito,
        // guardando em 'novoSaldo':
        double saldoDeposito = saldoAtual + deposito;
        // Atribuíndo a soma ao 'atributo saldo':
        conta.saldo = saldoDeposito;
    }
    // Metodo sacar:
    void sacar(Conta conta, double valor) {

    }
    // Metodo transferir:
    void transferir(Conta origem, Conta destino, double valor) {

    }

}



























