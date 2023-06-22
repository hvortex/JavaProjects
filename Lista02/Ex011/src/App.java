import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

    System.out.print("Digite o salário atual do empregado: ");

        double salario = teclado.nextDouble();

        double percentualAumento;
        if (salario <= 280.0) {
            percentualAumento = 0.2;
        } else if (salario <= 700.0) {
            percentualAumento = 0.15;
        } else if (salario <= 1500.0) {
            percentualAumento = 0.1;
        } else {
            percentualAumento = 0.05;
        }

        double valorAumento = salario * percentualAumento;
        double novoSalario = salario + valorAumento;

        System.out.println("Salário antes do aumento: R$" + salario);
        System.out.println("Percentual de aumento aplicado: " + (percentualAumento * 100) + "%");
        System.out.println("Valor do aumento: R$" + valorAumento);
        System.out.println("Salário após o aumento: R$" + novoSalario);
    }
}