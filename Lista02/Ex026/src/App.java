import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de litros vendidos: ");
        int litros = teclado.nextInt();

        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        String tipoCombustivel = teclado.next().toUpperCase();

        double precoLitro;
        double desconto;

        if (tipoCombustivel.equals("A")) {
            precoLitro = 1.90;

            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipoCombustivel.equals("G")) {
            precoLitro = 2.50;

            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível inválido!");
            return;
        }

        double valorTotal = litros * precoLitro;
        double valorDesconto = valorTotal * desconto;
        double valorFinal = valorTotal - valorDesconto;

        System.out.println("Valor a ser pago: R$" + valorFinal);
    }
}
