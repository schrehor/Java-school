package sk.uniza.fri.wof3.zaklad;

import sk.uniza.fri.wof2.zaklad.Hra;

/**
 * Hlavna trieda hry WoF s metodou main - spustanie v NB
 *
 * @author Lubomir Sadlon
 * @version 21.2.2012
 */
public class Main {

    /**
     * @param args parametre programu
     */
    public static void main(String[] args) {
        sk.uniza.fri.wof2.zaklad.Hra hra = new Hra();
        hra.hraj();
    }
}
