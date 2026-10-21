import java.util.Scanner;
/*
* Loop While:
* Programa que pede um número ao usuário,
* para ser impresso incrementalmente do 1 até o número informado.*/
public class LoopComWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor até o qual será incrementado: ");

        int contador = sc.nextInt();
        int valor = 1;
        sc.close();

        while(valor <= contador) {
            System.out.println(valor);
            valor++;
        }
    }
}
