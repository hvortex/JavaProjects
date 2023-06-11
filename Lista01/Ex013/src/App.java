import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner in = new Scanner(System.in);

    System.out.println("Informe sua altura");
      double altura = in.nextDouble();

    double pesoIdealHomem = 72.7*altura - 58;
    System.out.println(String.format("O peso ideal para um homem com a altura informada é de: %.2fKg", pesoIdealHomem));

    double pesoIdealMulher = 62.1*altura - 44.7;
    System.out.println(String.format("O peso ideal para uma mulher com a altura informada é de: %.2fKg", pesoIdealMulher));

    }
}