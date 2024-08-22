import java.util.HashMap;
import java.util.Map;

public class Steuerung {
    private Einfahrtsschranke einfahrtsschranke;
    private Ausfahrtsschranke ausfahrtsschranke;
    private Kasse kasse;
    private Map<String, Ticket> aktiveTickets;

    public Steuerung(Einfahrtsschranke einfahrt, Ausfahrtsschranke ausfahrt, Kasse kasse) {
        this.einfahrtsschranke = einfahrt;
        this.ausfahrtsschranke = ausfahrt;
        this.kasse = kasse;
        this.aktiveTickets = new HashMap<>();
    }

    public Ticket einfahren() {
        // Ein neues Ticket wird erstellt und registriert
        Ticket ticket = new Ticket();
        einfahrtsschranke.registriereEintritt(ticket);
        einfahrtsschranke.schliessen();
        aktiveTickets.put(ticket.getId(), ticket);
        System.out.println("Ihr Ticket: " + ticket.getId());
        return ticket; // Das Ticket wird zurückgegeben
    }

    public void ausfahren(Ticket ticket) {
        // Ticket-Überprüfung und Zahlungsvorgang
        String ticketId = ticket.getId();
        Ticket gespeichertesTicket = aktiveTickets.get(ticketId);

        if (gespeichertesTicket != null) {
            double gebuehr = kasse.berechneGebuehr(gespeichertesTicket);
            System.out.println("Zu zahlender Betrag: " + gebuehr + " EUR.");
            // Automatische Zahlung simulieren
            System.out.println("Bezahlung erfolgt. Sie können ausfahren.");
            ausfahrtsschranke.registriereAusfahrt(gespeichertesTicket);
            ausfahrtsschranke.schliessen();
            aktiveTickets.remove(ticketId); // Ticket wird nach der Ausfahrt entfernt
        } else {
            System.out.println("Ungültige Ticket-ID.");
        }
    }
}
