import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro lado: ");
        double lado1 = teclado.nextDouble();

        System.out.print("Digite o valor do segundo lado: ");
        double lado2 = teclado.nextDouble();

        System.out.print("Digite o valor do terceiro lado: ");
        double lado3 = teclado.nextDouble();

            if (verificarTriangulo(lado1, lado2, lado3)) {
                if (lado1 == lado2 && lado1 == lado3) {
                    System.out.println("Os valores formam um triângulo Equilátero.");
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("Os valores formam um triângulo Isósceles.");
                } else {
                    System.out.println("Os valores formam um triângulo Escaleno.");
                }
            } else {
                System.out.println("Os valores informados não podem formar um triângulo.");
            }
        }

    private static boolean verificarTriangulo(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
}

