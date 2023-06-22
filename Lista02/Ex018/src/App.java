import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String data = teclado.nextLine();

        if (ehDataValida(data)) {
            System.out.println("A data " + data + " é válida.");
        } else {
            System.out.println("A data " + data + " é inválida.");
        }
    }

    private static boolean ehDataValida(String data) {
        if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return false;
        }

        String[] partes = data.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        if (ano <= 0 || mes < 1 || mes > 12 || dia < 1 || dia > numeroDiasNoMes(mes, ano)) {
            return false;
        }

        return true;
    }

    private static int numeroDiasNoMes(int mes, int ano) {
        int[] diasNoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes == 2 && ehAnoBissexto(ano)) {
            return 29;
        }

        return diasNoMes[mes - 1];
    }

    private static boolean ehAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}

