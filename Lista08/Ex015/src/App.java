public class App {
    public static void main(String[] args) throws Exception {
        Tamagoshi animal = new Tamagoshi("Cachorro");

        System.out.println("Nome: " + animal.retornarNome());
        System.out.println("Fome: " + animal.retornarFome());
        System.out.println("Saúde: " + animal.retornarSaude());
    }
}
