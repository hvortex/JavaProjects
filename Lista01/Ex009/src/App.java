import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner in = new Scanner(System.in);
    System.out.println("Informe a temperatura em Fahrenheit");
      double Fahrenheit = in.nextDouble();
       
      double celsius = 5 * ((Fahrenheit-32) / 9);
    
    System.out.print("A temperatura em celsius é: "+celsius);
    
    }
}
