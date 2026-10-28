import java.util.Scanner;
/**
 * ================================================
 * Programa verificador de idade com o if ternário:
 * ================================================
 * 1º - O usuário digita a idade e o programa verifica
 *      se é maior ou menor que 18 anos:
 * */
public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        // If Ternário:
        String mensagem =
        (idade >= 18) ? "Sim! Você é maior de idade." : "Não! Você é menor de idade.";
        // Imprime a mensagem conforme a idade do usuário:
        System.out.println(mensagem);
    }
}
