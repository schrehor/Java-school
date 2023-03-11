package sk.uniza.fri.wof3.prostredie.predmety;

import sk.uniza.fri.wof3.zaklad.Hrac;

public class Navleky implements Predmet {
    private boolean suObute;

    public Navleky() {
        this.suObute = false;
    }

    @Override
    public String getNazov() {
        return "navleky";
    }

    public void pouzi(Hrac hrac) {
        if (this.suObute) {
            this.suObute = false;
            System.out.println("Prave si si vyzul návleky");
        } else {
            this.suObute = true;
            System.out.println("Práve si si obul návleky");
        }
    }

    @Override
    public boolean mozemPolozit() {
        return !this.suObute;
    }

    @Override
    public boolean jeNasadeny() {
        return this.suObute;
    }
}
