import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

        System.out.println("Responda às perguntas abaixo sobre o crime:");
        System.out.print("Telefonou para a vítima? (S/N): ");
        String resposta1 = teclado.nextLine();

        System.out.print("Esteve no local do crime? (S/N): ");
        String resposta2 = teclado.nextLine();

        System.out.print("Mora perto da vítima? (S/N): ");
        String resposta3 = teclado.nextLine();

        System.out.print("Devia para a vítima? (S/N): ");
        String resposta4 = teclado.nextLine();

        System.out.print("Já trabalhou com a vítima? (S/N): ");
        String resposta5 = teclado.nextLine();

        int contagemPositiva = 0;

        if (resposta1.equalsIgnoreCase("S")) {
            contagemPositiva++;
        }

        if (resposta2.equalsIgnoreCase("S")) {
            contagemPositiva++;
        }

        if (resposta3.equalsIgnoreCase("S")) {
            contagemPositiva++;
        }

        if (resposta4.equalsIgnoreCase("S")) {
            contagemPositiva++;
        }

        if (resposta5.equalsIgnoreCase("S")) {
            contagemPositiva++;
        }

        String classificacao;

        if (contagemPositiva == 2) {
            classificacao = "Suspeita";
        } else if (contagemPositiva >= 3 && contagemPositiva <= 4) {
            classificacao = "Cúmplice";
        } else if (contagemPositiva == 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }

        System.out.println("Classificação: " + classificacao);
    }
}