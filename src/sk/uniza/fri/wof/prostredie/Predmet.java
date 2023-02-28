package sk.uniza.fri.wof.prostredie;

public class Predmet {
    private final String nazov;

    public Predmet(String nazov) {
        this.nazov = nazov;
    }

    public String getNazov() {
        return this.nazov;
    }

    public void pouziPredmet(){
        System.out.println("Predmet sa neda pouzit");
    }
}
