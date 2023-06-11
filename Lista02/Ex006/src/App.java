import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in =  new Scanner(System.in);

        System.out.println("Informe um número");
        int n1 = in.nextInt();

        System.out.println("Informe outro número");
        int n2 = in.nextInt();

        System.out.println("Informe outro número");
        int n3 = in.nextInt();

        int maior = Math.max(Math.max(n1, n2), n3);

        System.out.println("O maior número é: " + maior);

    }
}