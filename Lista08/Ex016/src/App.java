import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

    Tamagoshi cachorro = new Tamagoshi("Tobi", 40, 80);

        int escolha = 0;
        while (escolha != 4) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Alimentar");
            System.out.println("2 - Brincar");
            System.out.println("4 - Sair");

            escolha = teclado.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Quantidade de comida:");
                    int quantidadeComida = teclado.nextInt();
                    cachorro.alimentar(quantidadeComida);
                    break;
                case 3:
                    System.out.println("Status geral!");
                    System.out.println(cachorro.toString());
                    break;
            }
        }
    }

}