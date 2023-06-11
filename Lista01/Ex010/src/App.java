import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner in = new Scanner(System.in);
    
    System.out.println("Informe a temperatura em celsius");
      double celsius = in.nextDouble();
       
      double Fahrenheit = (1.8*celsius*(9/5) +32);
    
    System.out.print("A temperatura em Fahrenheit é: "+Fahrenheit);

    }
}
