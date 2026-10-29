public class InicializarArrays {
    public static void main(String[] args) {
        // Declarando o array já inicializado:
        String[] funcionarios = {"Hashem", "Atom", "Yaakov", "Tiago"};

        // Acessando às posições:
        System.out.println(funcionarios[0]);
        System.out.println(funcionarios[1]);
        System.out.println(funcionarios[2]);
        System.out.println(funcionarios[3]);

        // Criando um array vazio:
        String[] funcoes = new String[4];

        // Populando às posições:
        funcoes[0] = "Arquiteto de Software";
        funcoes[1] = "Devops";
        funcoes[2] = "QA";
        funcoes[3] = "Engenheiro de Software";
    }
}
