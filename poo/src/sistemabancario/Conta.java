package sistemabancario;

public class Conta {
    // Atributos da conta:
    Cliente titular;
    int numero;
    double saldo;

    // Construtor canônico:

    public Conta(Cliente titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }


    // Metodo que imprime o saldo:
    /**
     * Como o atributo 'titular' é do tipo de referência 'Cliente', que por sua vez
     * tem o atributo 'name', tive que chamar este último. Pois, do contrário,
     * em vez do nome do cliente, viria o padrão nativo: o nome da classe seguido
     * do endereço de memória em hexadecimal (sistemabancario.Cliente@6e8cf4c6 */
    void imprimirSaldo() {
        System.out.println("Saldo atual de " + this.titular.nome + ": " + this.saldo);
    }

}








