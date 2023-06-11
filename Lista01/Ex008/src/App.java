import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner in = new Scanner(System.in);

    System.out.println("Informe em reais quanto você ganha por hora trabalhada");
      double salariohora = in.nextDouble();
    System.out.println("Informe quantas horas você trabalha no mês");
      double horasmes = in.nextDouble();
    
      double salariomes = salariohora*horasmes;
    
    System.out.print("O seu salário no mes é de R$"+salariomes);
    }
}
