package org.corso.giornalaio;

public class Rivista {
    private String nomeRivista;
    private int giornoDiUscita;

    public Rivista() {
    }

    public Rivista(String nomeRivista, int giornoDiUscita) {
        this.nomeRivista = nomeRivista;
        this.giornoDiUscita = giornoDiUscita;
    }

    public String getNomeRivista() {
        return nomeRivista;
    }

    public void setNomeRivista(String nomeRivista) {
        this.nomeRivista = nomeRivista;
    }

    public int getGiornoDiUscita() {
        return giornoDiUscita;
    }

    public void setGiornoDiUscita(int giornoDiUscita) {
        this.giornoDiUscita = giornoDiUscita;
    }

}
