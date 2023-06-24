public class Carro {

    private double consumoComb;
    private double nivelComb; 

    public Carro(double consumoComb) {
        this.consumoComb = consumoComb;
        this.nivelComb = 0;
    }

    public void andar(double distancia) {
        double combustivelNecessario = distancia / consumoComb;
        if (combustivelNecessario <= nivelComb) {
            nivelComb -= combustivelNecessario;
            System.out.println("O carro andou " + distancia + " km.");
        } else {
            System.out.println("Combustível insuficiente para andar essa distância.");
        }
    }

    public double obterCombustivel() {
        return nivelComb;
    }

    public void adicionarCombustivel(double quantidade) {
        nivelComb += quantidade;
        System.out.println("Feito o abastecimento de " + quantidade + " litros.");
    }

}