package sk.uniza.fri.wof3.prostredie;

import sk.uniza.fri.wof2.prostredie.Hodinky;
import sk.uniza.fri.wof2.prostredie.Miestnost;
import sk.uniza.fri.wof2.prostredie.Navleky;
import sk.uniza.fri.wof2.prostredie.ObycajnyPredmet;
import sk.uniza.fri.wof2.prostredie.predmety.Hodinky;
import sk.uniza.fri.wof2.prostredie.predmety.Navleky;
import sk.uniza.fri.wof2.prostredie.predmety.ObycajnyPredmet;
import sk.uniza.fri.wof2.prostredie.vychody.VstupDoLabaku;

public class HernySvet {
    private final sk.uniza.fri.wof2.prostredie.Miestnost startovaciaMiestnost;

    public HernySvet() {
        sk.uniza.fri.wof2.prostredie.Miestnost terasa = new sk.uniza.fri.wof2.prostredie.Miestnost("terasa - hlavny vstup na fakultu");
        sk.uniza.fri.wof2.prostredie.Miestnost aula = new sk.uniza.fri.wof2.prostredie.Miestnost("aula");
        sk.uniza.fri.wof2.prostredie.Miestnost bufet = new sk.uniza.fri.wof2.prostredie.Miestnost("bufet");
        sk.uniza.fri.wof2.prostredie.Miestnost labak = new sk.uniza.fri.wof2.prostredie.Miestnost("pocitacove laboratorium");
        sk.uniza.fri.wof2.prostredie.Miestnost kancelaria = new sk.uniza.fri.wof2.prostredie.Miestnost("kancelaria spravcu pocitacoveho laboratoria");

        // inicializacia miestnosti = nastavenie vychodov
        terasa.nastavVychod("vychod", aula);
        terasa.nastavVychod("juh", new VstupDoLabaku(labak));
        terasa.nastavVychod("zapad", bufet);
        aula.nastavVychod("zapad", terasa);
        labak.nastavVychod("sever", terasa);
        labak.nastavVychod("vychod", kancelaria);
        kancelaria.nastavVychod("zapad", labak);
        bufet.nastavVychod("vychod", terasa);

        terasa.polozPredmet(new ObycajnyPredmet("kamen"));
        terasa.polozPredmet(new Hodinky());
        terasa.polozPredmet(new Navleky());
        labak.polozPredmet(new ObycajnyPredmet("mys"));
        bufet.polozPredmet(new ObycajnyPredmet("bageta"));

        this.startovaciaMiestnost = terasa;  // startovacia miestnost hry
    }

    public Miestnost getStartovaciaMiestnost() {
        return this.startovaciaMiestnost;
    }
}
