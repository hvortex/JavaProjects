import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        BombaDeCombustivel bomba = new BombaDeCombustivel("Gasolina", 4.5, 1000);

        Scanner teclado = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("1. Abastecer por valor");
            System.out.println("2. Abastecer por litro");
            System.out.println("3. Valor do litro");
            System.out.println("4. Tipo de combustível");
            System.out.println("5. Quantidade de combustível");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor a ser abastecido: ");
                    double valorAbastecido = teclado.nextDouble();
                    bomba.abastecerPorValor(valorAbastecido);
                    break;
                case 2:
                    System.out.print("Quantidade em litros de combustível: ");
                    double quantidadeLitros = teclado.nextDouble();
                    bomba.abastecerPorLitro(quantidadeLitros);
                    break;
                case 3:
                    System.out.print("Informe valor do litro de combustível: ");
                    double novoValor = teclado.nextDouble();
                    bomba.alterarValor(novoValor);
                    break;
                case 4:
                    System.out.print("Escoler tipo de combustível: ");
                    String novoCombustivel = teclado.next();
                    bomba.alterarCombustivel(novoCombustivel);
                    break;
                case 5:
                    System.out.print("Informe a nova quantidade de combustível: ");
                    double novaQuantidade = teclado.nextDouble();
                    bomba.alterarQuantidadeCombustivel(novaQuantidade);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Digite um número válido.");
                    break;
            }

            System.out.println("========================\n");
        } while (opcao != 0);

        teclado.close();
    }
}