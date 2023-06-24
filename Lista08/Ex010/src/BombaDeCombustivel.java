public class BombaDeCombustivel {

    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaDeCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel){
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

       public void abastecerPorValor(double valorAbastecido) {
        double quantidadeLitros = valorAbastecido / valorLitro;
        if (quantidadeLitros <= quantidadeCombustivel) {
            quantidadeCombustivel -= quantidadeLitros;
            System.out.println("Quantidade de litros abastecidos: " + quantidadeLitros);
        } else {
            System.out.println("Combustível insuficiente na bomba.");
        }
    }

    public void abastecerPorLitro(double quantidadeLitros) {
        double valorPago = quantidadeLitros * valorLitro;
        if (quantidadeLitros <= quantidadeCombustivel) {
            quantidadeCombustivel -= quantidadeLitros;
            System.out.println("Valor a ser pago: R$" + valorPago);
        } else {
            System.out.println("Combustível insuficiente na bomba.");
        }
    }

    public void alterarValor(double novoValor) {
        valorLitro = novoValor;
    }

    public void alterarCombustivel(String novoCombustivel) {
        tipoCombustivel = novoCombustivel;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        quantidadeCombustivel = novaQuantidade;
    }
}