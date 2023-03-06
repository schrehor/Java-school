package sk.uniza.fri.wof3.prikazy;

import sk.uniza.fri.wof2.prikazy.Prikaz;
import sk.uniza.fri.wof2.prikazy.VykonavacPrikazov;

import java.util.Scanner;

/**
 * Trieda sk.uniza.fri.wof.prikazy.Parser cita vstup zadany hracom do terminaloveho okna a pokusi sa
 * interpretovat ho ako prikaz hry. Kazda sprava dajPrikaz sposobi, ze parser
 * precita jeden riadok z terminaloveho okna a vyberie z neho prve dve slova.
 * Tie dve slova pouzije ako parametre v sprave new triede sk.uniza.fri.wof.prikazy.Prikaz.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 * @author  lokalizacia: Lubomir Sadlon, Jan Janech
 * @version 2012.02.21
 */
public class Parser {
    private final sk.uniza.fri.wof2.prikazy.VykonavacPrikazov vykonavacPrikazov;
    private final Scanner citac;         // zdroj vstupov od hraca

    /**
     * Vytvori citac na citanie vstupov z terminaloveho okna.
     */
    public Parser(VykonavacPrikazov vykonavacPrikazov) {
        this.vykonavacPrikazov = vykonavacPrikazov;
        this.citac = new Scanner(System.in);
    }

    /**
     * @return prikaz zadany hracom
     */
    public sk.uniza.fri.wof2.prikazy.Prikaz nacitajPrikaz() {
        System.out.print("> ");     // vyzva pre hraca na zadanie prikazu

        String vstupnyRiadok = this.citac.nextLine();

        String prikaz = null;
        String parameter = null;

        // najde prve dve slova v riadku 
        Scanner tokenizer = new Scanner(vstupnyRiadok);
        if (tokenizer.hasNext()) {
            prikaz = tokenizer.next();      // prve slovo
            if (tokenizer.hasNext()) {
                parameter = tokenizer.next();      // druhe slovo
                // vsimnite si, ze zbytok textu sa ignoruje
            }
        }

        // kontrola platnosti prikazu
        if (this.vykonavacPrikazov.jePrikaz(prikaz)) {
            // vytvori platny prikaz
            return new sk.uniza.fri.wof2.prikazy.Prikaz(prikaz, parameter);
        } else {
            // vytvori neplatny - "neznamy" prikaz
            return new Prikaz(null, parameter);
        }
    }
}