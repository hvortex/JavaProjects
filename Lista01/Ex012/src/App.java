import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner in = new Scanner(System.in);

    System.out.println("Informe sua altura");
      double altura = in.nextDouble();

    double pesoIdeal = 72.7*altura - 58;

    System.out.println(String.format("O peso ideal para sua altura é de: %.0fKg", pesoIdeal));

    }
}
