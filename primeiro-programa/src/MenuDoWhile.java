import java.util.Scanner;
/**
 * Menu interativo:
 * 1º Informa as opções do menu para que o usuário escolha.
 * 2º Se ele escolher uma opção de lanche, será retornado para ele,
 * para que se certifique da escolha.
 * 3º Se ele escolher 0, sairá do sistema.
 * */
public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("============================");
            System.out.println("Digite uma opção do menu: ");
            System.out.println("1. Sanduiche.");
            System.out.println("2. Pizza.");
            System.out.println("3. Sorvete.");
            System.out.println("0. Sair.");
            System.out.println("============================");

            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo do sistema...");
            } else if (opcao == 1) {
                System.out.println("Você escolheu [1]sanduíche.");
            } else if (opcao == 2) {
                System.out.println("Você escolheu [2]pizza.");
            } else {
                System.out.println("Você escolheu [3]sorvete.");
            }

        } while (opcao != 0);
        sc.close();
    }
}













