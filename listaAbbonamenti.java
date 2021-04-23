package org.corso.giornalaio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class listaAbbonamenti {

    private Map<Cliente, Set<Rivista>> abbonamenti = new HashMap<>();

    public listaAbbonamenti() {
    }

    public Map<Cliente, Set<Rivista>> getAbbonamenti() {
        return abbonamenti;
    }
    /*
     * public void setAbbonamenti(Map<Cliente, Set<Rivista>> abbonamenti) {
     * this.abbonamenti = abbonamenti; }
     */

    public void assegnaAbbonamenti(Cliente cliente, Rivista rivista) {
        Set<Rivista> riviste = abbonamenti.get(cliente);
        if (riviste == null) {
            riviste = new HashSet<>();
        }
        riviste.add(rivista);
        abbonamenti.put(cliente, riviste);
    }

    public void disdiciAbbonamenti(Cliente cliente, Rivista rivista) {
        abbonamenti.get(cliente).remove(rivista);

        /*
         * Iterator<Rivista> rivisteIterator = abbonamenti.get(cliente).iterator();
         * while(rivisteIterator.hasNext()){ rivisteIterator.next();
         * rivisteIterator.remove(); }
         */
    }

}
