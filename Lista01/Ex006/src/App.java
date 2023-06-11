import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      double PI = 3.1416;
    Scanner in = new Scanner(System.in);
    System.out.println("Informe o valor do raio");
      double r = in.nextFloat();
      double area = PI* (r*r);

    System.out.print("O valor da área é: "+area);
  }
}
