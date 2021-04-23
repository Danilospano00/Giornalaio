package org.corso.giornalaio;

import java.lang.ref.Cleaner;

public class Main {
    public static void main(String[] args) {
        Giornalaio giornalaio = new Giornalaio();

        Cliente danilo = new Cliente("Danilo");
        Cliente matteo = new Cliente("Matteo");
        Cliente andrea = new Cliente("Andrea");
        Cliente federico = new Cliente("Federico");

        Rivista moda = new Rivista("Moda", 1);
        Rivista sport = new Rivista("Sport", 1);
        Rivista tech = new Rivista("Tech", 3);
        Rivista vino = new Rivista("Vino", 5);
        Rivista arte = new Rivista("Arte", 7);
        Rivista caccia = new Rivista("Caccia", 7);

        giornalaio.getListaAbbonamenti().assegnaAbbonamenti(danilo, moda);
        giornalaio.getListaAbbonamenti().assegnaAbbonamenti(matteo, sport);
        giornalaio.getListaAbbonamenti().disdiciAbbonamenti(danilo, moda);
        giornalaio.stampaAbbonamenti();
    }
}
