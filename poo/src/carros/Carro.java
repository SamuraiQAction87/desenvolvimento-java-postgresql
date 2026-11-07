package carros;

public class Carro {
    // Atributos:
    String modelo;
    int cavalos;
    String cor;
    String transmissao;
    String montadora;
    int capacidadeTanque;
    int combustivel;
    int kmPorLitros;

    // Métodos:
    // Abastece tanque:
    public int abastecer(int litros) {
        int soma = combustivel + litros;
        if (soma > capacidadeTanque) {
            combustivel = capacidadeTanque;
            // Tratando o combustível restante:
            int sobra = soma - capacidadeTanque;

            // Impressão informando o modelo, quanto foi abastecido de fato e a sobra:
            System.out.println("Modelo: " + modelo);
            System.out.println("Abastecido: " + (litros - sobra) + " litros (Tanque cheio!).");
            System.out.println("Sobraram: " + sobra + " litros.");
            // Retorna a sobra:
            return sobra;
        } else {
            combustivel = soma;

            // Impressão informando que foi abastecido totalmente sem sobras:
            System.out.println("Modelo: " + modelo);
            System.out.println("Abastecido: " + litros + " litros.");
            System.out.println("Sobraram: 0 litros.");

            return combustivel;
        }
    }

    // Calcula autonomia:
    public int autonomiaCombustivel() {
        int autonomia = kmPorLitros * combustivel;
        return autonomia;
    }

}
