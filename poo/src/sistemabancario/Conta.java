package sistemabancario;

public class Conta {
    // Atributos da conta:
    Cliente titular;
    int numero;
    double saldo;

    // Metodo que imprime o saldo:
    void imprimirSaldo() {
        System.out.println("Saldo atual de " + this.titular.nome + ": " + this.saldo);
    }

}








