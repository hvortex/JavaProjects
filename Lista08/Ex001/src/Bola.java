public class Bola {
    private String cor;
    private double circunferencia;
    private String material;

    public void trocarACor(String novaCor) {
        cor = novaCor;
    }

    public void mostrarACor() {
        System.out.println("A cor da bola é: " + cor);
    }
}
