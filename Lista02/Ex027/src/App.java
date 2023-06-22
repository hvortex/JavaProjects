import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de morangos (em Kg): ");
        double kgMorangos = teclado.nextDouble();

        System.out.print("Digite a quantidade de maçãs (em Kg): ");
        double kgMacas = teclado.nextDouble();

        double precoMorangos = (kgMorangos <= 5) ? 2.50 : 2.20;
        double precoMacas = (kgMacas <= 5) ? 1.80 : 1.50;

        double valorTotal = (kgMorangos * precoMorangos) + (kgMacas * precoMacas);

            if (kgMorangos + kgMacas > 8 || valorTotal > 25.00) {
                valorTotal *= 0.90;
            }

        System.out.println("Valor a ser pago: R$" + valorTotal);
    }
}
