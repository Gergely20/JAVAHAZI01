package com.example.ElolenyHazi;

interface Ragadozo{
    public void ragadozo();
    public void szur();
    public void harap();
    public void karmol();
}

interface Novenyevo{
    public void novenyevo();
}

interface Mindenevo{
    public void mindenevo();
}

interface Dogevo{
    public void dogevo();
}

public class Heterotrof implements Ragadozo, Novenyevo, Mindenevo, Dogevo{
    public void ragadozo() {
        System.out.println("Más élőlényekkel táplálkozom");
    }
    public void szur() {
        System.out.println("Szúrók");
    }

    public void harap() {
        System.out.println("Harapok");
    }

    public void karmol() {
        System.out.println("Karmolok");
    }

    public void novenyevo() {
        System.out.println("Csak is kizárólag növényekkel táplálkozom!");
    }

    public void mindenevo() {
        System.out.println("Minden élőlényt és növényt megeszek");
    }

    public void dogevo() {
        System.out.println("Az elpusztult más előlények tetemeit fogyasztom el");
    }
}
