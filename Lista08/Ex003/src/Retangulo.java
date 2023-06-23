public class Retangulo {

private double base;

private double altura;

public void trocarValorLado(double novaBase, double novaAltura) {
    base = novaBase;
    altura = novaAltura;
}
public double retornarBase() {
        return base;
    }

public double retornarAltura() {
        return altura;
    }

public double calcularArea() {
        return base * altura;
    }

public double calcularPerimetro() {
        return 2 * (base + altura);
    }

}

