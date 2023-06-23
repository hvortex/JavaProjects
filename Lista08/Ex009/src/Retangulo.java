class Retangulo {

    private double largura;
    private double altura;
    private Ponto pontoInicial;

    public Retangulo(double largura, double altura, Ponto pontoInicial) {
        this.largura = largura;
        this.altura = altura;
        this.pontoInicial = pontoInicial;
    }

    public void alterarValores(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public Ponto encontrarCentro() {
        double centroX = pontoInicial.getX() + largura / 2;
        double centroY = pontoInicial.getY() + altura / 2;
        return new Ponto(centroX, centroY);
    }

    public void mostrarCentro() {
        Ponto centro = encontrarCentro();
        System.out.println("Centro do retângulo: (" + centro.getX() + ", " + centro.getY() + ")");
    }
}