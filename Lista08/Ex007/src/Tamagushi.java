public class Tamagushi {

    private String nome;
    private int fome;
    private int saude;
    private int idade;
    private String humor;

    public Tamagushi(String nome) {
        this.nome = nome;
        this.fome = 0;
        this.saude = 100;
        this.idade = 0;
        this.humor = calcularHumor();
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    public void alterarFome(int novaFome) {
        this.fome = novaFome;
        this.humor = calcularHumor();
    }

    public void alterarSaude(int novaSaude) {
        this.saude = novaSaude;
        this.humor = calcularHumor();
    }

    public void alterarIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public String retornarNome() {
        return nome;
    }

    public int retornarFome() {
        return fome;
    }

    public int retornarSaude() {
        return saude;
    }

    public int retornarIdade() {
        return idade;
    }

    public String retornarHumor() {
        return humor;
    }

    private String calcularHumor() {
        if (fome <= 5 && saude >= 5) {
            return "Feliz";
        } else {
            return "Triste";
        }
    }
}