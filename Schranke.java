public abstract class Schranke {
    private boolean istOffen;

    public Schranke() {
        this.istOffen = false;
    }

    public void oeffnen() {
        this.istOffen = true;
        System.out.println("Schranke ist geöffnet.");
    }

    public void schliessen() {
        this.istOffen = false;
        System.out.println("Schranke ist geschlossen.");
    }

    public boolean istOffen() {
        return istOffen;
    }
}
