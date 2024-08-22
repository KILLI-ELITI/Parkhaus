import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    private String id;
    private LocalDateTime einfahrtsZeit;
    private LocalDateTime ausfahrtsZeit;

    public Ticket() {
        this.id = UUID.randomUUID().toString();
        this.einfahrtsZeit = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getEinfahrtsZeit() {
        return einfahrtsZeit;
    }

    public void setAusfahrtsZeit(LocalDateTime ausfahrtsZeit) {
        this.ausfahrtsZeit = ausfahrtsZeit;
    }

    public LocalDateTime getAusfahrtsZeit() {
        return ausfahrtsZeit;
    }
}
