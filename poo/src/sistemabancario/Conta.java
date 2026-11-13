package sistemabancario;

public class Conta {
    // Atributos da conta:
    private Cliente titular;
    private int numero;
    private double saldo;

    // Construtor canônico:

    public Conta(Cliente titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        // Regra de Negócio - Atributo 'saldo' só será inicializado se for maior que 0:
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("A conta de " + this.titular.nome + " deve ser criando com saldo positivo!");
        }
    }

    // Getters e Setters:
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
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








