import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe o tamanho do arquivos (em MB)");
        double tamanhoArquivo = teclado.nextDouble();

    System.out.print("Informe a velocidade de download da internet (em Mbps)");
        double velocidadeDownload = teclado.nextDouble();

    double segundosDownload = tamanhoArquivo / velocidadeDownload;

    double minutosDownload = segundosDownload / 60;

    System.out.println(String.format("O download do arquivo demorará %.1f minutos", minutosDownload));

    }
}
