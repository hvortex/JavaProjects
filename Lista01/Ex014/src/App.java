import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner in = new Scanner(System.in);

    System.out.println("Informe o peso do peixe em kg");
      double peso = in.nextDouble();

      double excesso = peso - 50;
      double multa = excesso*4;


      if (excesso <= 0){
      System.out.println("O peixe pesa: "+peso+"Kg");
      System.out.println("Pelo regulamento de pesca do estado de São Paulo, você não precisa pagar multa");
      }  
      else{
        System.out.println("O peixe pesa em quilos:"+peso+"Kg");
        System.out.println(String.format("O peixe excede o peso permitido em %.1fKg, e o valor da multa será de: R$%.2f", excesso, multa));
      }
    }
}
