public class Carro {
    // Atributos:
    int cavalos;
    String cor;
    String transmissao;
    String montadora;
    int capacidadeTanque;
    int combustivel;
    int kmPorLitros;

    // Métodos:
    // Abastece:
    void abastecer(int litros) {
        combustivel = combustivel + litros;
    }

    // Calcula autonomia:
    int autonomiaCombustivel() {
        int autonomia = kmPorLitros * combustivel;
        return autonomia;
    }

}
