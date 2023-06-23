public class Quadrado {

    private double tamanhoLado;
 
    public void mudarValorLado(double novoLado) {
        tamanhoLado = novoLado;
    }

    public double retornarLado() {
        return tamanhoLado;
    }

    public double calcularArea() {
        return tamanhoLado * tamanhoLado;
    }
}