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

    }
}











