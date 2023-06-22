import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora de trabalho: ");
        double valorHora = teclado.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = teclado.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        double sindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;
        double totalDescontos = 0.0;

        double impostoRenda;
        if (salarioBruto <= 900.0) {
            impostoRenda = 0.0;
        } else if (salarioBruto <= 1500.0) {
            impostoRenda = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500.0) {
            impostoRenda = salarioBruto * 0.10;
        } else {
            impostoRenda = salarioBruto * 0.20;
        }

        double inss = salarioBruto * 0.10;
        totalDescontos = impostoRenda + inss + sindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("(-) Imposto de Renda (" + calcularPercentual(impostoRenda, salarioBruto) + "%): R$" + impostoRenda);
        System.out.println("(-) INSS (10%): R$" + inss);
        System.out.println("FGTS (11%): R$" + fgts);
        System.out.println("Total de descontos: R$" + totalDescontos);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }

    private static String calcularPercentual(double valor, double total) {
        double percentual = (valor / total) * 100;
        return String.format("%.2f", percentual);
    }
}