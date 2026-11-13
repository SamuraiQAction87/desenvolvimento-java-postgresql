package sistemabancario;

public class Banco {
    // Metodo depositar:
    void depositar(Conta conta, double deposito) {
        // Pega o saldo atual, soma o depósito e atualiza o novo saldo:
        conta.setSaldo(conta.getSaldo() + deposito);
    }
    // Metodo sacar:
    boolean sacar(Conta conta, double saque) {
        // Regra de Negócio: verifica usando o getter:
        if (saque >= conta.getSaldo()) {
            System.out.println("Saldo insuficiente!");
            return false;
        } else {
            // Subtrai o saque do saldo atual a partir do getter e atualiza usando o setter:
            conta.setSaldo(conta.getSaldo() - saque);
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



























