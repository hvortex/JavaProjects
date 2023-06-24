public class App {
    public static void main(String[] args) throws Exception {
        Tamagoshi bichinho = new Tamagoshi("Cachorro");

        System.out.println("Nome: " + bichinho.retornarNome());
        System.out.println("Fome: " + bichinho.retornarFome());
        System.out.println("Saúde: " + bichinho.retornarSaude());
    }
}
