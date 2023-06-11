import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner in = new Scanner(System.in);

    System.out.println("Informe um número inteiro");
      int inteiro1 = in.nextInt();
    System.out.println("Informe outro número inteiro");
      int inteiro2 = in.nextInt();
    System.out.println("Informe um número real");
      double real1 = in.nextDouble();


        int produto = (2 * inteiro1) * (inteiro2 / 2);
        double soma = (3 * inteiro1) + real1;
        double cubo = Math.pow(real1, 3);

        System.out.println("Produto do dobro do primeiro com metade do segundo: " + produto);
        System.out.println("Soma do triplo do primeiro com o terceiro: " + soma);
        System.out.println("Terceiro número elevado ao cubo: " + cubo);

    }
}
