import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota1");
            float nota1 = scan.nextFloat();
        System.out.println("Digite a nota2");
            float nota2 = scan.nextFloat();
        System.out.println("Digite a nota3");
            float nota3 = scan.nextFloat();
        System.out.println("Digite a nota4");
            float nota4 = scan.nextFloat();

        float media = ((nota1+nota2+nota3+nota4)/4);
        System.out.format("A média da nota do aluno foi de: %.2f", media);
    }
}

