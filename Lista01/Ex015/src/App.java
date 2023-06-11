import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe quanto você ganha por hora");
      double valorHora = in.nextDouble();

    System.out.println("Informe quantas horas você trabalha por mês");
      double horasPorMes = in.nextDouble();

    double resultado = valorHora*horasPorMes;
    double salarioBruto = Math.round(resultado * 100.0) / 100.0;
    System.out.println("Seu salário bruto é de: R$"+salarioBruto);

    double impostoRenda = (salarioBruto*11) / 100;

    
    double descontoInss = (salarioBruto*8) / 100;
    double inss = Math.round(descontoInss * 100.0) / 100.0;
    System.out.println("Você pagou ao INSS: R$"+inss);
    
    double descontoSindicato = (salarioBruto*5) / 100;
    double sindicato = Math.round(descontoSindicato * 100.0) / 100.0;
    System.out.println("Você pagou ao sindicato: R$"+sindicato);

    double somaDescontos = salarioBruto-(impostoRenda+inss+sindicato);
    double salarioLiquido = Math.round(somaDescontos * 100.0) / 100.0;
    System.out.println("O seu salário líquido é de: R$"+salarioLiquido);

    }
}
