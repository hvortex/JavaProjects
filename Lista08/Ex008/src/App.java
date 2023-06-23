public class App {
    public static void main(String[] args) {
        Macaco macaco1 = new Macaco("Macaco1");
        Macaco macaco2 = new Macaco("Macaco2");

        macaco1.comer("Banana");
        macaco1.comer("Uva");
        macaco1.comer("Pera");

        macaco2.comer("Mamão");
        macaco2.comer("Caju");
        macaco2.comer("Goiaba");

        macaco1.verBucho();
        macaco2.verBucho();

        macaco1.digerir();
        macaco2.digerir();

        macaco1.verBucho();
        macaco2.verBucho();

        macaco1.comer(macaco2);

        macaco1.verBucho();
        macaco2.verBucho();

        macaco1.digerir();

        macaco1.verBucho();
        macaco2.verBucho();
    }
}