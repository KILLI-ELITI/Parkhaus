import java.time.Duration;
import java.time.LocalDateTime;

public class Kasse {
    private static final double STUNDENSATZ = 2.50; // Preis pro Stunde

    public double berechneGebuehr(Ticket ticket) {
        if (ticket.getAusfahrtsZeit() == null) {
            ticket.setAusfahrtsZeit(LocalDateTime.now());
        }
        Duration parkdauer = Duration.between(ticket.getEinfahrtsZeit(), ticket.getAusfahrtsZeit());
        double gebuehr = Math.ceil(parkdauer.toHours()) * STUNDENSATZ;
        return gebuehr;
    }
}
