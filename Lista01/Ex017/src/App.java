import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Digite o tamanho da área a ser pintada em metros quadrados");
        double areaPintada = teclado.nextDouble();

        double coberturaTinta = 6.0; 
        double quantidadeTinta = areaPintada / coberturaTinta;
        quantidadeTinta = quantidadeTinta * 1.1;
        int latas18Litros = (int) Math.ceil(quantidadeTinta / 18.0);
        int galoes36Litros = (int) Math.ceil(quantidadeTinta / 3.6); 

        double precoLata18Litros = latas18Litros * 80.0;
        double precoGalao36Litros = galoes36Litros * 25.0;

        int latasMisturadas = (int) Math.floor(quantidadeTinta / 18.0);
        double restanteTinta = quantidadeTinta - (latasMisturadas * 18.0);
        int galoesMisturados = (int) Math.ceil(restanteTinta / 3.6);
        double precoMistura = (latasMisturadas * 80.0) + (galoesMisturados * 25.0);

    System.out.println("Quantidade de tinta necessária:");
    System.out.println("Latas de 18 litros: " + latas18Litros);
    System.out.println("Galões de 3,6 litros: " + galoes36Litros);

    System.out.println("Comprando apenas latas de 18 litros custará: R$ " + precoLata18Litros);
    System.out.println("Comprando apenas galões de 3,6 litros custará: R$ " + precoGalao36Litros);
    System.out.println("Misturando latas e galões, o custo total será de: R$ " + precoMistura);
    
    }
}
