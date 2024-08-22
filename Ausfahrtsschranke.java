public class Ausfahrtsschranke extends Schranke {
    public void registriereAusfahrt(Ticket ticket) {
        System.out.println("Ticket " + ticket.getId() + " bestätigt. Schranke öffnet.");
        this.oeffnen();
    }
}