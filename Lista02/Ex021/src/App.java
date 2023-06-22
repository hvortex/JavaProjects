import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do saque (entre 10 e 600 reais): ");
        int valorSaque = teclado.nextInt();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor de saque inválido! O valor deve ser de no mínimo 10 reais, e no máximo 600 reais.");
            return;
        }

        int[] notas = {100, 50, 10, 5, 1};
        int[] quantidadeNotas = new int[5];

        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = valorSaque / notas[i];
            valorSaque %= notas[i];
        }

        System.out.println("Notas fornecidas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas de " + notas[i] + " reais: " + quantidadeNotas[i]);
        }
    }
}
