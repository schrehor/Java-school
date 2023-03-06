package sk.uniza.fri.wof3.prostredie.vychody;

import sk.uniza.fri.wof3.prostredie.Miestnost;
import sk.uniza.fri.wof3.zaklad.Hrac;

public interface Vychod {
    Miestnost dajMiestnost();

    boolean mozemVstupit(Hrac hrac);
}
