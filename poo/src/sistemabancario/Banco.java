package sistemabancario;

public class Banco {
    // Metodo depositar:
    void depositar(Conta conta, double deposito) {
        conta.saldo += deposito;
    }
    // Metodo sacar:
    void sacar(Conta conta, double saque) {
        // Regra de Negócio: a quantia a ser sacada não pode exceder o saldo disponível:
        if (saque < conta.saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            conta.saldo -= saque;
        }
    }
    // Metodo transferir:
    void transferir(Conta origem, Conta destino, double valorTransferido) {
        double saldoAtualOrigem = origem.saldo;
        double saldoAtualizadoOrigem = saldoAtualOrigem - valorTransferido;
        // Regra de Negócio:
        // Valor transferido deve ser menor que saldo da origem:
        if (saldoAtualizadoOrigem < 0) {
            System.out.println("Saldo insuficiente!");
        } else {
            origem.saldo = saldoAtualizadoOrigem;
            double saldoAtualizadoDestino = destino.saldo + valorTransferido;
            destino.saldo = saldoAtualizadoDestino;
        }
    }

}



























