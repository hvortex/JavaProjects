import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);

System.out.print("Em qual turno você estuda? Digite M para matutino, V para vespertino ou N para noturno: ");
        String turno = in.nextLine().toUpperCase();

        String mensagem;

        switch (turno) {
            case "M":
                mensagem = "Bom Dia!";
                break;
            case "V":
                mensagem = "Boa Tarde!";
                break;
            case "N":
                mensagem = "Boa Noite!";
                break;
            default:
                mensagem = "Valor Inválido!";
                break;
        }

        System.out.println(mensagem);
    }
}