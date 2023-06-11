import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota1");
            float nota1 = scan.nextFloat();
        System.out.println("Digite a nota2");
            float nota2 = scan.nextFloat();


        float media = ((nota1+nota2)/2);

        if (media >= 7){
            if (media < 10) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Aprovado com Distinção");
            }
        } else {
            System.out.println("Reprovado");
        }
        
    }
}