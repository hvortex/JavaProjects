import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = teclado.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = teclado.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Opção: ");
        int opcao = teclado.nextInt();

        double resultado = 0;

        if (opcao == 1) {
            resultado = numero1 + numero2;
        } else if (opcao == 2) {
            resultado = numero1 - numero2;
        } else if (opcao == 3) {
            resultado = numero1 * numero2;
        } else if (opcao == 4) {
            resultado = numero1 / numero2;
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        System.out.println("Resultado: " + resultado);

        if (resultado % 2 == 0) {
            System.out.println("O número resultante é par.");
        } else {
            System.out.println("O número resultante é ímpar.");
        }

        if (resultado > 0) {
            System.out.println("O número resultante é positivo.");
        } else if (resultado < 0) {
            System.out.println("O número resultante é negativo.");
        } else {
            System.out.println("O número resultante é zero.");
        }

        if (resultado == (int) resultado) {
            System.out.println("O número resultante é inteiro.");
        } else {
            System.out.println("O número resultante é decimal.");
        }
    }
}
