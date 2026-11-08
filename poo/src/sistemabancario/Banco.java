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
    void sacar(Conta conta, double saque) {
        // Salva o saldo na variável 'saldoAtual':
        double saldoAtual = conta.saldo;
        // Deduz o saque do saldo:
        double saldoAtualizado = saldoAtual - saque;
        // Regra de Negócio:
        // Saque deve ser inferior ao saldo:
        if (saldoAtualizado < 0) {
            System.out.println("Saldo insuficiente!");
        } else {
            conta.saldo = saldoAtualizado;
        }
    }
    // Metodo transferir:
    void transferir(Conta origem, Conta destino, double valorTransferido) {

    }

}



























