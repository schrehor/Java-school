package sk.uniza.fri.wof3.prostredie.vychody;

import sk.uniza.fri.wof3.prostredie.Miestnost;
import sk.uniza.fri.wof3.zaklad.Hrac;

public class VstupDoLabaku implements Vychod {
    private final Miestnost miestnost;

    public VstupDoLabaku(Miestnost miestnost) {
        this.miestnost = miestnost;
    }

    @Override
    public Miestnost dajMiestnost() {
        return this.miestnost;
    }

    @Override
    public boolean mozemVstupit(Hrac hrac) {
        var navleky = hrac.najdiPredmet("navleky");
        return navleky.isPresent() && navleky.get().jeNasadeny();
    }
}
