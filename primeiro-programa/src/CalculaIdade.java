import java.util.Scanner;
/** Calculadora de Idade */
public class CalculaIdade {
    public static void main(String[] args) {
        // Iniciando recurso de leitura de entrada:
        Scanner sc = new Scanner(System.in);

        // 1º Captura ano atual:
        System.out.println("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        // 2º Captura ano de nascimento:
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        // 3º Calcula idade atual:
        int idadeAtual = (anoAtual - anoNascimento);
        // Finalizando recurso:
        sc.close();

        // 4º Exibição da idade atual:
        System.out.printf("Sua idade atual é: %d\n", + idadeAtual);

        // Verificando a faixa etário do usuário:
        if (idadeAtual < 18) {
            System.out.println("Você é MENOR DE IDADE!");
        } else if (idadeAtual < 60) {
            System.out.println("Você é MAIOR DE IDADE!");
        } else {
            System.out.println("Você é IDOSO!");
        }
    }
}
