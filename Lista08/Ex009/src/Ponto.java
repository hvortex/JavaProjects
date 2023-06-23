class Ponto {

    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void mostrar() {
        System.out.println("Ponto: (" + x + ", " + y + ")");
    }
}