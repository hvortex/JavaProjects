public class Tv {
 
    private double tamanhoTela;
    private String marca;
    private String modelo;
    private int canal;
    private int volume;

    public Tv(int canal, int volume) {
            this.canal = 1;
            this.volume = 50;
        }

        public void setCanal(int novoCanal) {
            if (novoCanal >= 1 && novoCanal <= 100) {
                this.canal = novoCanal;
            } else {
                System.out.println("Canal inexistente.");
            }
        }

        public void aumentarVolume() {
            if (volume < 100) {
                this.volume++;
            } else {
                System.out.println("Volume máximo.");
            }
        }

        public void diminuirVolume() {
            if (volume > 0) {
                this.volume--;
            } else {
                System.out.println("Volume mínimo.");
            }
        }

        public int getCanal() {
            return canal;
        }

        public int getVolume() {
            return volume;
        }
}