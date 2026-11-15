package sistemabancario;

public class Cliente {
    // Atributo da classe:
    public static int quantidadeClientes;

    private String cpf;
    private String nome;

    // Construtor Padrão:
    Cliente() {
        incrementarClientes();
    }

    // Construtor Canônico:
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        incrementarClientes();
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

    // Metodo static que conta clientes:
    public static void incrementarClientes() {
        // Chamando o atributo de classe e incrementando +1:
        Cliente.quantidadeClientes++;
    }
}
