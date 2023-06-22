import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = teclado.nextInt();

            if (Bissexto(ano)) {
                System.out.println(ano + " é um ano bissexto.");
            } else {
                System.out.println(ano + " não é um ano bissexto.");
            }
        }

    private static boolean Bissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
