import java.util.Scanner;
/**
 * Contador de letras:
 *
 *  1º Usuário digita uma frase.
 *  2º O programa identifica apenas as letras e retorna o total para o usuário.
 * */
public class ContagemLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        // Armazena a frase que o usuário digitar:
        String frase = sc.nextLine();
        // Contador iniciando com 0:
        int quantidadeDeLetras = 0;

        // Itera por cada caractere da frase digitado pelo usuário:
        for (int indice = 0 ; indice < frase.length() ; indice++) {
            // Armazena o caractere do atual loop na variável 'letra':
            char letra = frase.charAt(indice);
            // Se o caractere for uma letra, e não um espaço, será armazenada na 'isLetra':
            boolean isLetra = Character.isLetter(letra);
            // Se 'isLetra' for uma letra, o contador será incrementado:
            if (isLetra) {
                quantidadeDeLetras++;
            }
        }
        // Após a última letra, o total será impresso:
        System.out.println("Número de letras: " + quantidadeDeLetras);
    }
}




































