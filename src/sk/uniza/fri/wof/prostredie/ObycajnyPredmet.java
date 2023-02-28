package sk.uniza.fri.wof.prostredie;

public class ObycajnyPredmet implements Predmet {
    private final String nazov;

    public ObycajnyPredmet(String nazov) {
        this.nazov = nazov;
    }

    public String getNazov() {
        return this.nazov;
    }

    @Override
    public void pouzi() {
        System.out.format("%s sa neda pouzit%n", this.nazov);
    }

    @Override
    public boolean polozPredmet() {
        return true;
    }
}
