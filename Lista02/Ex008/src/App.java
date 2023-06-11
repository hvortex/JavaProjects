import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in =  new Scanner(System.in);

        System.out.println("Informe o primeiro preço");
        float preco1 = in.nextFloat();

        System.out.println("Informe o segundo preço");
        float preco2 = in.nextFloat();

        System.out.println("Informe o primeiro preço");
        float preco3 = in.nextFloat();

    
        float menor = Math.min(Math.min(preco1, preco2), preco3);

        System.out.println("Você deverá comprar o produto que custa: R$" + menor);

    }
}