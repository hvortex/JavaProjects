public class App {

public static void main(String[] args) throws Exception {

    Carro corola = new Carro(19.4);
    corola.adicionarCombustivel(20);
    corola.andar(311);

    System.out.printf("Restam %.2f litros de combustível%n", corola.obterCombustivel());
}

}