import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro menor que 1000: ");
        int numero = teclado.nextInt();

        if (numero < 0 || numero >= 1000) {
            System.out.println("Número inválido! Digite um número inteiro menor que 1000.");
            return;
        }

        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;

        String mensagem = "";

        if (centenas > 0) {
            mensagem += formataQuantidade(centenas, "centena");
        }

        if (dezenas > 0) {
            if (centenas > 0) {
                mensagem += ", ";
            }
            mensagem += formataQuantidade(dezenas, "dezena");
        }

        if (unidades > 0) {
            if (centenas > 0 || dezenas > 0) {
                mensagem += " e ";
            }
            mensagem += formataQuantidade(unidades, "unidade");
        }

        System.out.println(mensagem);
    }

    private static String formataQuantidade(int quantidade, String nome) {
        String plural = quantidade > 1 ? "s" : "";
        return quantidade + " " + nome + plural;
    }
}

