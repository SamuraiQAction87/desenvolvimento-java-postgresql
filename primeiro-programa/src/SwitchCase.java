import java.util.Scanner;
/**
 * ========================
 * Programa menu interativo:
 * =========================
 *  1º Possibilita o usuário escolher uma opção de pedido.
 *  Mediante o Do-While, o menu aparecerá para ele,
 *  até que escolha uma opção diferente de 0, depois pode finalizar com opção 0.
 *  -------------------------------------------------------
 *  2º Após isso, mediante um switch-case,
 *  aparecerá na tela a opção que ele escolheu.
 * */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variável será inicializada, armazenando o valor que o user entrar:
        int opcao;
        // Armazena total da conta:
        double valorTotal = 0;

        // Permite o user visualizar e escolher a opção:
        do {
            System.out.println("============================");
            System.out.println("Digite uma opção do menu: ");
            System.out.println("1. Sanduíche.");
            System.out.println("2. Pizza.");
            System.out.println("3. Sorvete.");
            System.out.println("0. Finalizar.");
            System.out.println("============================");

            // Momento do armazenamento do valor digitado:
            opcao = sc.nextInt();
            // Verifica qual o valor digitado, para apresentar um case que seja condizente:
            switch (opcao) {
                case 1:
                    System.out.println("Sanduíche (R$: 10.00).");
                    valorTotal += 10;
                    break;
                case 2:
                    System.out.println("Pizza (R$: 30.00).");
                    valorTotal += 30;
                    break;
                case 3:
                    System.out.println("Sorvete (R$: 9.00).");
                    valorTotal += 9;
                    break;
                case 0:
                    System.out.println("Saindo do sistema!");
                    break;
                default:// Se a opção digitada for inválida, por padrão,
                    // o usuário receberá esta mensagem:1
                    System.out.println("Escolha uma opção válida!");

            }
        // Enquanto o valor digitado for DIFERENTE DE 0, volta para o 'do':
        } while (opcao != 0);
        // Imprime o total, após o user digitar o 0:
        System.out.println("Total do pedido R$: " + valorTotal);
        sc.close();
    }
}
