import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
    Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
            float n1 = scan.nextFloat();
        System.out.println("Digite outro número");
            float n2 = scan.nextFloat();

        float soma = n1+n2;
    
    System.out.println("A soma dos números digitados é: "+soma);

    }
}
