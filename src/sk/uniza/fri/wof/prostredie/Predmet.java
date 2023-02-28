package sk.uniza.fri.wof.prostredie;

import sk.uniza.fri.wof.zaklad.Hrac;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Predmet {
    private final String nazov;
    private boolean pouzite;

    public boolean getPouzite() {
        return this.pouzite;
    }

    public void setPouzite(Boolean pouzite) {
        this.pouzite = pouzite;
    }

    public Predmet(String nazov) {
        this.nazov = nazov;
        this.pouzite = false;
    }

    public String getNazov() {
        return this.nazov;
    }

    public void pouzi() {
        switch (this.nazov) {
            case "hodinky" -> {
                String timeStamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
                System.out.printf("Aktualny cas je %s%n", timeStamp);
            }
            case "navleky" -> {
                if (this.pouzite) {
                    System.out.println("Navlecene");
                } else {
                    System.out.println("Vyvlecene");
                }
                this.pouzite = !this.pouzite;
            }
            default -> {
                System.out.format("%s sa neda pouzit%n", this.nazov);
            }
        }
    }
}
