import java.util.Scanner;
/**
 * Validador de entrada numérica:
 *
 * 1º Orienta o usuário que digite um valor entre 1 e 10;
 * 2º Se ele digitar algo fora do range, será reorientado;
 * 3º Se o número for válido, será impresso.
 *
 * */
public class LoopComDoWhile {
    public static void main(String[] args) {
        // Instanciando recurso de captura do digitado no teclado:
        Scanner sc = new Scanner(System.in);
        // Variável declarada sem inicialização:
        int numero;
        // Orienta que o usuário digite um valor entre 1 e 10:
        do {
            System.out.println("Digite um número entre 1 e 10: ");
            // Armazenando o valor digitado na variável sem inicialização:
            numero = sc.nextInt();
        // Condição que devolve o prompt para o usuário,
        // caso ele digite algo fora o range delimitado, ex.: 0 ou 11:
        } while (numero < 1 || numero > 10);
        // Finalização do recurso de captura da entrada do sistema:
        sc.close();
        // Se o número for válido, será impresso:
        System.out.printf("o número %d é válido!", numero);
    }
}

























