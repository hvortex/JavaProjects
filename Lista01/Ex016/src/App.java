import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Digite o tamanho da área a ser pintada em metros quadrados");
        double areaPintada = teclado.nextDouble();

        double coberturaTinta = 3.0; 
        double quantidadeDeTinta = areaPintada / coberturaTinta;

        int latas18Litros = (int) Math.ceil(quantidadeDeTinta / 18.0);

        double precoLata18Litros = latas18Litros * 80.0;

    System.out.println("Para pintar a área informada, será preciso " + latas18Litros + " latas de tinta.");
    System.out.println("O valor gasto será de: R$ " + precoLata18Litros);

    }
}
