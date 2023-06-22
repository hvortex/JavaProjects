import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = teclado.nextDouble();

        double media = (nota1 + nota2) / 2;

        String conceito;
        String status;

            if (media >= 9.0) {
                conceito = "A";
                status = "APROVADO";
            } else if (media >= 7.5) {
                conceito = "B";
                status = "APROVADO";
            } else if (media >= 6.0) {
                conceito = "C";
                status = "APROVADO";
            } else if (media >= 4.0) {
                conceito = "D";
                status = "REPROVADO";
            } else {
                conceito = "E";
                status = "REPROVADO";
            }

        System.out.println(String.format("Notas: %.2f, %.2f", nota1, nota2));
        System.out.println(String.format("Média: %.2f", media));
        System.out.println("Conceito: " + conceito);
        System.out.println("Status: " + status);
    }
}