import java.util.Locale;
import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Garante o uso do ponto (.) como separador decimal

        // Capturando as 3 notas do aluno:
        System.out.println("Digite a 1ª nota: ");
        double nota1 = sc.nextInt();

        System.out.println("Digite a 2ª nota: ");
        double nota2 = sc.nextInt();

        System.out.println("Digite a 3ª nota: ");
        double nota3 = sc.nextInt();
        // Fechando o Scanner para liberar o recurso:
        sc.close();

        // Calculando a média aritmética:
        double media = (nota1 + nota2 + nota3) / 3;
        // Exibindo a média formatada com 2 casas decimais:
        System.out.printf("média Aritmética: %.2f\n", media);

        // Verificando a situação do aluno com base nas regras:
        if (media >= 7.0) {
            System.out.println("Status: Aluno APROVADO! Parabéns!");
        } else if (media >= 6) {
            System.out.println("Status: Aluno em RECUPERAÇÃO.");
        } else {
            System.out.println("Status: Aluno REPROVADO.");
        }
    }
}






















