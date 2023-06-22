import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = teclado.nextDouble();

        if (Math.round(numero) == numero) {
            System.out.println("O número " + numero + " é inteiro.");
        } else {
            System.out.println("O número " + numero + " é decimal.");
        }
    }
}