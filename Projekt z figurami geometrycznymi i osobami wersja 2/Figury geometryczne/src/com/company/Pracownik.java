package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Pracownik extends Osoba {

    private double pensja;

    public Pracownik(String imie, String nazwisko, String dataUr,double pensja)
    {
        super(imie,nazwisko,dataUr);
        this.pensja = pensja;

    }

    public double getPensja(){
        return pensja;
    }



}
