import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in =  new Scanner(System.in);

        System.out.println("Informe um número");
        int n1 = in.nextInt();

        System.out.println("Informe outro número");
        int n2 = in.nextInt();

        System.out.println("Informe outro número");
        int n3 = in.nextInt();

        int[] numeros = {n1, n2, n3};
        Arrays.sort(numeros);

        System.out.print("Os números em ordem decrescente são: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}