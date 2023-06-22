import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

        System.out.println("Tipos de carne disponíveis:");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");

        System.out.print("Digite o número correspondente ao tipo de carne: ");
        int tipoCarne = teclado.nextInt();

        System.out.print("Digite a quantidade de carne (em Kg): ");
        double quantidade = teclado.nextDouble();

        double precoKg;
        String tipoCarneStr;

        switch (tipoCarne) {
            case 1:
                precoKg = (quantidade <= 5) ? 4.90 : 5.80;
                tipoCarneStr = "Filé Duplo";
                break;
            case 2:
                precoKg = (quantidade <= 5) ? 5.90 : 6.80;
                tipoCarneStr = "Alcatra";
                break;
            case 3:
                precoKg = (quantidade <= 5) ? 6.90 : 7.80;
                tipoCarneStr = "Picanha";
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.print("A compra será realizada com o cartão Tabajara? (S/N): ");
        String opcaoCartao = teclado.next();

        boolean cartaoTabajara = opcaoCartao.equalsIgnoreCase("S");

        double precoTotal = quantidade * precoKg;
        double desconto = cartaoTabajara ? precoTotal * 0.05 : 0.0;
        double precoFinal = precoTotal - desconto;

        System.out.println("\nCupom Fiscal:");
        System.out.println("Tipo de carne: " + tipoCarneStr);
        System.out.println("Quantidade: " + quantidade + " Kg");
        System.out.println("Preço total: R$" + precoTotal);
        System.out.println("Tipo de pagamento: " + (cartaoTabajara ? "Cartão Tabajara" : "Outro"));
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Valor a pagar: R$" + precoFinal);
    }
}
