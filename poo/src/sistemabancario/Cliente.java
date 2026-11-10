package sistemabancario;

public class Cliente {
    String cpf;
    String nome;

    // Construtor Padrão:
    Cliente() {

    }

    // Construtor Canônico:
    Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
