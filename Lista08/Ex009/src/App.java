import java.util.Scanner;

public class App {

public static void main(String[] args) throws Exception {

Scanner teclado = new Scanner(System.in);

        Ponto pontoInicial = new Ponto(0, 0);


        Retangulo retangulo = new Retangulo(5, 3, pontoInicial);

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("=== Menu ===");
            System.out.println("1 - Alterar valores do retângulo");
            System.out.println("2 - Mostrar centro do retângulo");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a largura do retângulo: ");
                    double largura = teclado.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double altura = teclado.nextDouble();
                    retangulo.alterarValores(largura, altura);
                    break;
                case 2:
                    retangulo.mostrarCentro();
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println();
        }

        teclado.close();
    }
}
