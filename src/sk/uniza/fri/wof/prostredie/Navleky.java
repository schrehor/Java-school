package sk.uniza.fri.wof.prostredie;

public class Navleky implements Predmet{
    private boolean pouzite = false;

    @Override
    public String getNazov() {
        return "navleky";
    }

    @Override
    public void pouzi() {
        if (!this.pouzite) {
            System.out.println("Navlecene");
        } else {
            System.out.println("Vyvlecene");
        }
        this.pouzite = !this.pouzite;
    }

    @Override
    public boolean polozPredmet() {
        return !this.pouzite;
    }
}
