import java.util.Scanner;

public class App {
public static void main(String[] args) throws Exception {
Scanner in = new Scanner(System.in);

    System.out.println("Informe um número:");
    int n1 = in.nextInt();

    if (n1 > 0) {
            System.out.println("O número informado é positivo.");
        } else if (n1 < 0) {
            System.out.println("O número informado é negativo.");
        } else {
            System.out.println("O número informado é zero.");
        }
    }
}
