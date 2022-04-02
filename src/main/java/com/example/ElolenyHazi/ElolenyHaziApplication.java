package com.example.ElolenyHazi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class ElolenyHaziApplication {

    public static void main(String[] args) {
        Heterotrof oroszlan = new Heterotrof();
        oroszlan.ragadozo();
        oroszlan.karmol();
        System.out.println("Oroszlán");
        System.out.println();
        Heterotrof sundiszno = new Heterotrof();
        oroszlan.ragadozo();
        sundiszno.szur();
        System.out.println("Sündisznó");
        System.out.println();
        Autrotrof csiperkegomba = new Autrotrof();
        csiperkegomba.magaallitjaelo();
        System.out.println("Csiperkegomba");
        System.out.println();
        Autrotrof fenyofa = new Autrotrof();
        fenyofa.magaallitjaelo();
        System.out.println("Fenyőfa");
        System.out.println();
        Autrotrof kaktusz = new Autrotrof();
        kaktusz.magaallitjaelo();
        System.out.println("Kaktusz");
        System.out.println();
        Autrotrof rozsa = new Autrotrof();
        rozsa.magaallitjaelo();
        System.out.println("Rózsa");
        System.out.println();
        Heterotrof diszno = new Heterotrof();
        diszno.mindenevo();
        System.out.println("Disznó");
        System.out.println();
        Heterotrof venuszlegycsapoja = new Heterotrof();
        venuszlegycsapoja.ragadozo();
        System.out.println("Vénusz légycsapója");
        System.out.println();
        Heterotrof kigyo = new Heterotrof();
        kigyo.ragadozo();
        System.out.println("Kígyó");
        System.out.println();
        Heterotrof capa = new Heterotrof();
        oroszlan.ragadozo();
        capa.harap();
        System.out.println("Cápa");
        System.out.println();
        Heterotrof oz = new Heterotrof();
        oz.novenyevo();
        System.out.println("Őz");
        System.out.println();
        Autrotrof fu = new Autrotrof();
        fu.magaallitjaelo();
        System.out.println("Fű");

    }

}
