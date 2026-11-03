public class Carro {
    // Atributos:
    int cavalos;
    String cor;
    String transmissao;
    String montadora;
    int capacidadeTanque;
    int combustivel;

    // Métodos:
    void abastecer(int litros) {
        combustivel = combustivel + litros;
    }
}
