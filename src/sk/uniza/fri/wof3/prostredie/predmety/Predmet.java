package sk.uniza.fri.wof3.prostredie.predmety;

import sk.uniza.fri.wof3.zaklad.Hrac;

public interface Predmet {
    String getNazov();

    void pouzi(Hrac hrac);

    boolean mozemPolozit();

    boolean jeNasadeny();
}
