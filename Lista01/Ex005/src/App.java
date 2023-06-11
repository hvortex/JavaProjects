import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner in = new Scanner(System.in);

    System.out.println("Informe a medida em metros");
      float m = in.nextFloat();
      
      float cm = m*100;

    System.out.print("A medida informada em centimetros é: "+cm);
  }
}
