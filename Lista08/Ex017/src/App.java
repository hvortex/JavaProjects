import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Tamagoshi> sitio = new ArrayList<>();
        sitio.add(new Tamagoshi("Cachorro", 40, 80, "Au Au"));
        sitio.add(new Tamagoshi("Gato", 10, 90, "Miau"));
        sitio.add(new Tamagoshi("Calopsita", 15, 60, "Piu"));


        Scanner teclado = new Scanner(System.in);

        int escolha = 0;
        while (escolha != 5) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Alimentar todos os tamagoshis");
            System.out.println("2 - Brincar com todos os tamagoshis");
            System.out.println("3 - Ouvir todos os tamagoshis");
            System.out.println("4 - Sair");

            escolha = teclado.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Quantidade de comida:");
                    int quantidadeComida = teclado.nextInt();
                    alimentarTamagoshis(sitio, quantidadeComida);
                    break;
                case 2:
                    System.out.println("Tempo de brincadeira:");
                    int tempoBrincadeira = teclado.nextInt();
                    brincarTamagoshis(sitio, tempoBrincadeira);
                    break;
                case 5:
                    status(sitio);
                    break;
            }
        }
    }

    public static void alimentarTamagoshis(List<Tamagoshi> tamagoshis, int quantidadeComida) {
        for (Tamagoshi tamagoshi : tamagoshis) {
            tamagoshi.alimentar(quantidadeComida);
        }
    }

    public static void brincarTamagoshis(List<Tamagoshi> tamagoshis, int tempoBrincadeira) {
        for (Tamagoshi tamagoshi : tamagoshis) {
            tamagoshi.brincar(tempoBrincadeira);
        }
    }

    public static void ouvirTamagoshis(List<Tamagoshi> tamagoshis) {
        for (Tamagoshi tamagoshi : tamagoshis) {
            System.out.println(tamagoshi.barulho());
        }
    }

        public static void status(List<Tamagoshi> tamagoshis) {
        for (Tamagoshi tamagoshi : tamagoshis) {
            System.out.println(tamagoshi.toString());
        }
    }
}