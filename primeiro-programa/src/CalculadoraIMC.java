import java.util.Scanner;
/**
*  Calculadora de IMC:
*  1º Solicita seu peso atual;
*  2º Solicita sua altura atual;
*  3º Calcula e imprime o IMC.
 * */
public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Capturando dados:
        System.out.println("Informe seu peso atual [ex.: 60,5]: ");
        // Capturando peso:
        double peso = sc.nextFloat();
        // Capturando altura:
        System.out.println("Informe sua altura atual [ex.: 1,76]: ");
        double altura = sc.nextDouble();

        // Encerramento do recurso como boa prática de performance:
        sc.close();

       // Realiza o cálculo do Índice de Massa Corporal (IMC):
        double resultado = peso / (altura * altura);
        System.out.printf("Seu IMC para o peso atual de %.2f é de %.2f.\n", peso, resultado);

    }
}
