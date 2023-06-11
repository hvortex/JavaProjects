import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner in = new Scanner(System.in);
    
    System.out.println("Informe o valor do lado do quadrado");
      double l = in.nextDouble();
      double area = l*l;
      double a2 = area*2;
    
    System.out.print("O dobro do valor da área é: "+a2);
    }
}
