package sk.uniza.fri.wof3.prostredie.predmety;

import sk.uniza.fri.wof3.zaklad.Hrac;

public class Baterka implements Predmet {

    @Override
    public String getNazov() {
        return "baterka";
    }

    @Override
    public void pouzi(Hrac hrac) {
        var radio = hrac.najdiPredmet("radio");
        if (radio.isPresent()) {
            ((Radio)radio.get()).vlozBaterky();
            hrac.vyberPredmetZInventara(this.getNazov());
        } else {
            System.out.println("Nemas Radio ty tupec");
        }

    }

    @Override
    public boolean mozemPolozit() {
        return true;
    }

    @Override
    public boolean jeNasadeny() {
        return false;
    }
}
