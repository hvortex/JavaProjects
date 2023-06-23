public class ContaCorrente {

    private int numeroDaConta;
    private String nomeCorrentista;
    private double saldo;
    
    public ContaCorrente(int numeroConta, String nomeCorrentista) {
        this.numeroDaConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
    }

    public ContaCorrente(int numeroDaConta, String nomeCorrentista, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public void alterarNome(String novoNome) {
        nomeCorrentista = novoNome;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

        public boolean saque(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                return true;
            } else {
                System.out.println("Saldo insuficiente.");
                return false;
            }
        }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }
}