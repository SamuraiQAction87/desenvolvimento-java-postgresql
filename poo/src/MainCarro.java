public class MainCarro {
    // Entry point para executar a classe:
    public static void main(String[] args) {

        // Instanciando o 1º objeto:
        Carro punto = new Carro();

        // inicializando os atributos do Punto:
        punto.cavalos = 110;
        punto.cor = "Preta";
        punto.montadora = "Fiat";
        punto.transmissao = "Manual";
        punto.capacidadeTanque = 50;
        punto.combustivel = 10;
        punto.kmPorLitros = 10;

        // Instanciando o 2º objeto:
        Carro civic = new Carro();

        // Inicializando os atributos do Civic:
        civic.cavalos = 150;
        civic.cor = "Prata";
        civic.montadora = "Honda";
        civic.transmissao = "Automática";
        civic.capacidadeTanque = 48;
        civic.combustivel = 15;
        civic.kmPorLitros = 8;

        // Verificando a quantidade de combustível antes de abastecer:
        System.out.println("============================================");
        System.out.println("Combustível antes de abastecer:");
        System.out.println("Combustível do Punto: " + punto.combustivel);
        System.out.println("Combustível do Civic: " + civic.combustivel);

        // Abastecendo os objetos:
        punto.abastecer(20);
        civic.abastecer(25);

        // Verificando a quantidade de combustível após abastecer:
        System.out.println("============================================");
        System.out.println("Combustível após abastecer:");
        System.out.println("Combustível do Punto: " + punto.combustivel);
        System.out.println("Combustível do Civic: " + civic.combustivel);

        // Verificando autonomia:
        System.out.println("============================================");
        System.out.println("Autonomia restante do Punto: " + punto.autonomiaCombustivel());
        System.out.println("Autonomia restante do Civic: " + civic.autonomiaCombustivel());
    }
}

























