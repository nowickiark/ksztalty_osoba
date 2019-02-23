package com.company;

public class Towar {
    public String nazwa;
    public double cena;
    public Towar(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString()
    {
        /*String zwroc = ("%10s, %10d", nazwa,cena);*/
        String zwroc = String.format("%-7s: %-5.2f zł",nazwa,cena);

        /*return nazwa + "," + cena;*/
        return zwroc;
    }
}
