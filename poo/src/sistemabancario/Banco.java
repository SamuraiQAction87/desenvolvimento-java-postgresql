package sistemabancario;

public class Banco {
    // Metodo depositar:
    void depositar(Conta conta, double deposito) {
        conta.saldo += deposito;
    }
    // Metodo sacar:
    boolean sacar(Conta conta, double saque) {
        // Regra de Negócio: a quantia a ser sacada não pode exceder o saldo disponível:
        if (saque > conta.saldo) {
            System.out.println("Saldo insuficiente!");
            return false;
        } else {
            conta.saldo -= saque;
            return true;
        }
    }
    // Metodo transferir aproveitando os outros métodos (DRY puro):
    void transferir(Conta origem, Conta destino, double valorTransferido) {
        // Tenta sacar da origem. Se der certo, deposita no destino.
        if (sacar(origem, valorTransferido)) {
            depositar(destino, valorTransferido);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Transferência cancelada por saldo insuficiente.");
        }
    }
}



























