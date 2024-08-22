public class Einfahrtsschranke extends Schranke {
    public void registriereEintritt(Ticket ticket) {
        System.out.println("Ticket " + ticket.getId() + " registriert. Schranke öffnet.");
        this.oeffnen();
    }
}