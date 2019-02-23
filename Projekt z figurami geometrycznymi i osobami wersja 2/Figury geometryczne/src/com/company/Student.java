package com.company;

/**
 * Osoba -adres
 * rok studiów,kierunek studiów, adrestupy adres?
 * 2 konstruktory , ezbparametrowy i 6 paramterowy(imir, nazw, dataur, rokstud, kierunek studiow, adres suden,)
 */

public class Student extends Osoba {



    private int rokStudiow;
    private String kierunekStudiow;

    public Student(String imie, String nazwisko)
    {
        super(imie, nazwisko);

    }


    public Student(String imie, String nazwisko,String dataUrodzeniam, int rokStudiow, String kierunekStudiow)
    {
        super(imie, nazwisko,dataUrodzeniam);
        this.rokStudiow = rokStudiow;
        this.kierunekStudiow = kierunekStudiow;
    }

    public Student(String imie, String nazwisko,String dataUrodzeniam,Adres adres,  int rokStudiow, String kierunekStudiow)
    {
        super(imie, nazwisko,dataUrodzeniam, adres);
        this.rokStudiow = rokStudiow;
        this.kierunekStudiow = kierunekStudiow;
    }

    @Override
    public String toString(){
        return this.getImię() + " "+ this.getNazwisko() + " " + this.getDataUrodzenia() + " " + kierunekStudiow;
    }

    public String getKierunekStudiow() {
        return kierunekStudiow;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }


}
