import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double coeficienteA = teclado.nextDouble();

            if (coeficienteA == 0) {
                System.out.println("A equação não é do segundo grau. Encerrando o programa.");
            } else {
                System.out.print("Digite o valor de b: ");
                double coeficienteB = teclado.nextDouble();

                System.out.print("Digite o valor de c: ");
                double coeficienteC = teclado.nextDouble();

                double delta = calcularDelta(coeficienteA, coeficienteB, coeficienteC);

                if (delta < 0) {
                    System.out.println("A equação não possui raízes reais.");
                } else if (delta == 0) {
                    double raiz = calcularRaizUnica(coeficienteA, coeficienteB);
                    System.out.println("A equação possui apenas uma raiz real: " + raiz);
                } else {
                    double raiz1 = calcularRaiz1(coeficienteA, coeficienteB, delta);
                    double raiz2 = calcularRaiz2(coeficienteA, coeficienteB, delta);
                    System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
                }
            }
        }

    private static double calcularDelta(double coeficienteA, double coeficienteB, double coeficienteC) {
        return Math.pow(coeficienteB, 2) - 4 * coeficienteA * coeficienteC;
    }

    private static double calcularRaizUnica(double coeficienteA, double coeficienteB) {
        return -coeficienteB / (2 * coeficienteA);
    }

    private static double calcularRaiz1(double coeficienteA, double coeficienteB, double delta) {
        return (-coeficienteB + Math.sqrt(delta)) / (2 * coeficienteA);
    }

    private static double calcularRaiz2(double coeficienteA, double coeficienteB, double delta) {
        return (-coeficienteB - Math.sqrt(delta)) / (2 * coeficienteA);
    }
}
