public class UserInterface {
    public static void main(String[] args) {
        Einfahrtsschranke einfahrt = new Einfahrtsschranke();
        Ausfahrtsschranke ausfahrt = new Ausfahrtsschranke();
        Kasse kasse = new Kasse();
        Steuerung steuerung = new Steuerung(einfahrt, ausfahrt, kasse);
        steuerung.start(); // Startet das Menü
    }
}