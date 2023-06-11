import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe a letra correspondente ao sexo da pessoa (onde a letra F representa o sexo feminino, e M representa o sexo masculino)");
    String sexo = in.nextLine();

    if (sexo.equalsIgnoreCase("F")) {
        System.out.println("Apessoa é do sexo Feminino");
    } else if (sexo.equalsIgnoreCase("M")){
        System.out.println("A pessoa é do sexo Masculino");
    } else {
        System.out.println("Sexo inválido");
    }

    }
}
