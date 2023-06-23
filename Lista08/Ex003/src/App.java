import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor da base: ");
        double base = teclado.nextDouble();

        System.out.print("Informe o valor da altura: ");
        double altura = teclado.nextDouble();

        Retangulo retangulo = new Retangulo();
        retangulo.trocarValorLado(base, altura);

        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();

        double areaPiso = 0.25;
        int quantidadePisos = (int) Math.ceil(area / areaPiso);

        double comprimentoRodape = 0.1;
        int quantidadeRodapes = (int) Math.ceil(perimetro / comprimentoRodape);

        System.out.println("A quantidade de pisos necessários é de: " + quantidadePisos + "pisos");
        System.out.println("A quantidade de rodapés necessários é de: " + quantidadeRodapes + "rodapés");
    }
}