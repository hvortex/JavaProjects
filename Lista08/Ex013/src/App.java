public class App {
    public static void main(String[] args) throws Exception {

    Funcionario gerente = new Funcionario("Jorge", 5000);
    System.out.printf("Nome: %s\nSalário: R$%.2f\n", gerente.getNome(), gerente.getSalario());
    }
}
