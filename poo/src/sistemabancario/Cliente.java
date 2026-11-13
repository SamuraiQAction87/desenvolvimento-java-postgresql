package sistemabancario;

public class Cliente {
    private String cpf;
    private String nome;

    // Construtor Padrão:
    Cliente() {

    }

    // Construtor Canônico:
    Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
