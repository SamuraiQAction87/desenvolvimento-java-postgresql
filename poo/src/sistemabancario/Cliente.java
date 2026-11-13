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

    //Getters e Setters:

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
