public class Parkhaus {
    private Steuerung steuerung;

    public Parkhaus() {
        // Initialisierung der Steuerung mit den benötigten Komponenten
        Einfahrtsschranke einfahrt = new Einfahrtsschranke();
        Ausfahrtsschranke ausfahrt = new Ausfahrtsschranke();
        Kasse kasse = new Kasse();
        this.steuerung = new Steuerung(einfahrt, ausfahrt, kasse);
    }

    public void start() {
        // Direkter Ablauf, der ein typisches Szenario simuliert
        Ticket ticket = steuerung.einfahren();
        // Angenommene Wartezeit/Parkzeit (kann simuliert werden)
        steuerung.ausfahren(ticket);
    }
}