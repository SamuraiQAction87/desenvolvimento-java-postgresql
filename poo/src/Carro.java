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
        int soma = combustivel + litros;
        if (soma > capacidadeTanque) {
            combustivel = capacidadeTanque;
            // Tratando o combustível restante:
            int sobra = soma - capacidadeTanque;
            // Impressão do resultado:
            System.out.println("Sobrou: " + sobra + " litros.");
        } else {
            combustivel = soma;
        }
    }

    // Calcula autonomia:
    int autonomiaCombustivel() {
        int autonomia = kmPorLitros * combustivel;
        return autonomia;
    }

}
