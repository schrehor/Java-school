package sk.uniza.fri.wof3.prostredie.vybavenie;

import sk.uniza.fri.wof3.prostredie.predmety.ObycajnyPredmet;
import sk.uniza.fri.wof3.prostredie.Pouzitelny;
import sk.uniza.fri.wof3.zaklad.Hrac;

public class Automat implements Vybavenie, Pouzitelny {
    @Override
    public String getNazov() {
        return "automat";
    }

    @Override
    public String getPopis() {
        return "Výpredaj bagiet a minerálok";
    }

    @Override
    public void pouzi(Hrac hrac) {
        hrac.vlozPredmetDoInventara(new ObycajnyPredmet("bageta"));
    }
}
