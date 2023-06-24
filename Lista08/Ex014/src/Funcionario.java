public class Funcionario {
    
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void aumentarSalario(double percentualDeAumento) {
        double aumento = salario * (percentualDeAumento / 100);
        salario += aumento;
    }
}
