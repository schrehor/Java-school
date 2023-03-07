package sk.uniza.fri.wof3.prostredie.predmety;

import sk.uniza.fri.wof3.zaklad.Hrac;

public class Radio implements Predmet {

    private boolean maBaterky;

    @Override
    public String getNazov() {
        return "radio";
    }

    @Override
    public void pouzi(Hrac hrac) {
        if (this.maBaterky) {
            System.out.println("Hram jak o dusu");
        } else {
            System.out.println("Bez baterky ti bude vyhravat maximalne tak v gebuli");
        }
    }

    @Override
    public boolean mozemPolozit() {
        return false;
    }

    @Override
    public boolean jeNasadeny() {
        return false;
    }

    public void vlozBaterky() {
        this.maBaterky = true;
    }
}
