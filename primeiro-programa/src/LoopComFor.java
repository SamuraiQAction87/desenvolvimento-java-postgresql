import java.util.Scanner;
/** Como funciona:
 *  O programa pede um número ao usuário,
 *  até o qual será incrementado a cada par, a partir do 2.
 *  Enquanto o contador (que inicia = 2) for <= ao valor digitado
 *  e o contador for par, ele será impresso até o último número par até o valor digitado. */
public class LoopComFor {
    public static void main(String[] args) {
       // Captura número digitado e já encerra o recurso:
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor = sc.nextInt();
        sc.close();

        for (int contador = 2 ; contador <= valor ; contador++) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
        }



    }
}
























