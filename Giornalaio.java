package org.corso.giornalaio;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Giornalaio {
    private listaAbbonamenti listaAbbonamenti;

    public Giornalaio() {
        this.listaAbbonamenti = new listaAbbonamenti();
    }

    public void stampaAbbonamenti() {
        Map<Cliente, Set<Rivista>> abbonamentiDaStampare=   new HashMap<>();
        abbonamentiDaStampare = listaAbbonamenti.getAbbonamenti();
        abbonamentiDaStampare.
        for (int giorno = 1; giorno <= 7; giorno++) {
            System.out.println("Giorno: " + giorno);
            System.out.println("Spedire al cliente ");
        }

    }

    public listaAbbonamenti getListaAbbonamenti() {
        return listaAbbonamenti;
    }

}
