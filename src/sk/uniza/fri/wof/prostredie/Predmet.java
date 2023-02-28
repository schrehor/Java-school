package sk.uniza.fri.wof.prostredie;

public class Predmet {
    private final String nazov;
    private boolean pouzite;

    public boolean getPouzite() {
        return this.pouzite;
    }

    public void setPouzite(Boolean pouzite) {
        this.pouzite = pouzite;
    }

    public Predmet(String nazov) {
        this.nazov = nazov;
        this.pouzite = false;
    }

    public String getNazov() {
        return this.nazov;
    }
}
