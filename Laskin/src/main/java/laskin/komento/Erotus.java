
package laskin.komento;

import laskin.IO;
import laskin.Sovelluslogiikka;

public class Erotus implements Komento {
    private final IO laskinIO;
    private final Sovelluslogiikka sovellus;

    public Erotus(
        IO laskinIO,
        Sovelluslogiikka sovellus
    ) {
        this.laskinIO = laskinIO;
        this.sovellus = sovellus;
    }

    @Override
    public void suorita() {
        sovellus.miinus(laskinIO.lueSyotekentta());
        laskinIO.paivitaSyotekentta("");
        laskinIO.paivitaTuloskentta("" + sovellus.tulos());
    }

    @Override
    public void peru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
