import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = in.next().charAt(0);

        if (Character.isLetter(letra)) {
            letra = Character.toUpperCase(letra);
            
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                System.out.println("A letra é uma vogal.");
            } else {
                System.out.println("A letra é uma consoante.");
            }
        } else {
            System.out.println("Caractere inválido. Digite apenas uma letra.");
        }
    }
}
