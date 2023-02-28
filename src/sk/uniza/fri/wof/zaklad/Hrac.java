package sk.uniza.fri.wof.zaklad;

import sk.uniza.fri.wof.prostredie.Miestnost;
import sk.uniza.fri.wof.prostredie.Predmet;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Hrac {
    private Miestnost aktualnaMiestnost;
    private final HashMap<String, Predmet> inventar;

    public Hrac(Miestnost aktualnaMiestnost) {
        this.aktualnaMiestnost = aktualnaMiestnost;
        this.inventar = new HashMap<>();
    }

    public void posunVSmere(String smer) {
        Miestnost novaMiestnost = this.aktualnaMiestnost.getMiestnostVSmere(smer);
        if (novaMiestnost == null) {
            System.out.println("Tam nie je vychod!");
        } else {
            this.aktualnaMiestnost = novaMiestnost;
            this.aktualnaMiestnost.vypisInfoOMiestnosti();
        }
    }

    public void zoberPredmet(String predmet) {
        Predmet zdvihnutyPredmet = this.aktualnaMiestnost.zoberPredmet(predmet);
        this.inventar.put(zdvihnutyPredmet.getNazov(), zdvihnutyPredmet);
    }

    public void pouziPredmet(String predmet){
        if (this.inventar.containsKey(predmet)){
            switch (predmet) {
                case "hodinky" -> {
                    String timeStamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
                    System.out.printf("Aktualny cas je %s%n", timeStamp);
                }
                case "navleky" -> {
                    if (!this.inventar.get(predmet).getPouzite()) {
                        System.out.println("Navlecene");
                        this.inventar.get(predmet).setPouzite(true);
                    } else {
                        System.out.println("Vyvlecene");
                        this.inventar.get(predmet).setPouzite(false);
                    }
                }
                default -> {
                    System.out.format("%s sa neda pouzit%n", predmet);
                }
            }
        }
        else {
            System.out.println("Predmet neni v inventari");
        }
    }

    public void polozPredmet(String predmet) {
        Predmet pokladanyPredmet = this.inventar.remove(predmet);
        this.aktualnaMiestnost.polozPredmet(pokladanyPredmet);
    }

    /**
     * vypise inventar do terminalu
     *
     */
    public void vypisInventar() {
        if (this.inventar.isEmpty()) {
            System.out.println("Zbytocne pozeras, ved tu nic nie je");
        } else {
            System.out.println("Tvoj inventar obsahuje:");
            for (var predmet : this.inventar.keySet()) {
                System.out.printf("- %s%n", predmet);
            }
        }
    }

    public Miestnost getAktualnaMiestnost() {
        return this.aktualnaMiestnost;
    }
}
