import java.text.DecimalFormat;

public class App {

public static void main(String[] args) throws Exception {

    ContaInvestimento poupanca = new ContaInvestimento(3000.0, 10.0);

        for (int i = 0; i < 5; i++) {
            poupanca.adicioneJuros();
        }

DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String saldoFormatado = decimalFormat.format(poupanca.getSaldo());
        System.out.println("Saldo final: R$" + saldoFormatado);
    }
}