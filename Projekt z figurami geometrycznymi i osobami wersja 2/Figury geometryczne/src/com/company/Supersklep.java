package com.company;

import com.company.Towar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Klasa supersklep sluzy do tworzenia obiektu sklepu z danymi utarg i listatwoarow
 * @author Arkadius Nowicki
 * @version 1.0
 * @since 2019-02-02
 *
 */

public class Supersklep {

    private String nazwaSklepu;
    private double utarg;
    private List<Towar> towaryWSklepie;

    /**
     * Konstruktor bezparametrowy
     */

    public Supersklep()
    {
        nazwaSklepu = "Ogólnobranżowy";
        utarg=0;
        towaryWSklepie = new ArrayList<>();
    }

    /**
     * Konstruktor umożliwiający nadawanie nazwy klepowi
     * @param nazwaSklepu
     */

    public Supersklep(String nazwaSklepu)
    {
        this.nazwaSklepu = nazwaSklepu;
        utarg = 0;
        towaryWSklepie = new ArrayList<>();
    }
    public Supersklep(String nazwaSklepu, double utarg)
    {
        this(nazwaSklepu);
        this.utarg= utarg;
    }

    public double dodajutarg(double kwota)
    {
        utarg += kwota;
        return utarg;
    }

    /**
     * Metoda pobiera nazwę sklepu @link Supersklep#utarg
     * @return nazwa sklepu
     */

    public String getNazwaSklepu()
    {
        return nazwaSklepu;
    }

    public void zaladujTwaory(){
        Towar t1 = new Towar("buty zamszowe,42", 156.23);
        Towar t2 = new Towar("buty skórzane,43", 200.13);
        towaryWSklepie.add(t1);
        towaryWSklepie.add(t2);
    }

    public ArrayList<Towar> getListaTowarow()
    {
        ArrayList<Towar> nowa = new ArrayList<>();
        for(Towar towar:towaryWSklepie)
        {
            Towar nowy = new Towar(towar.nazwa,towar.cena);
            nowa.add(nowy);
        }
        return nowa;
    }


    public void wczytajTowary() throws FileNotFoundException {
        towaryWSklepie = new ArrayList<>();  //na wszelki wypaek zakladamy nową tablicę żeby na pewno byla czysta

        String plik = nazwaSklepu + ".txt"; //o ile plik z towarami ma taka samą nazwę jak nazwa sklepu
        File file = new File(plik); //tworzenie odnosnika do file

            try {
                Scanner skan = new Scanner(file);
                while(skan.hasNextLine()){  //o ile skan(plik) ma nową linię
                    String linia = skan.nextLine(); //pobieranie nowej linii
                    String[] wyrazy = linia.split(";");
                    double cena= Double.parseDouble(wyrazy[1]);
                    Towar nowy = new Towar(wyrazy[0],cena);
                    towaryWSklepie.add(nowy);
                }

                skan.close();

            }

            catch (FileNotFoundException ex){
                System.out.println(ex.getMessage());
            }

            catch (Exception exc)
            {
                System.out.println("Bład czytania: " +exc.getMessage());
            }

    }

    public void wyswietlTowary(){
        for(Towar towar: towaryWSklepie)
        {
            System.out.println("W sklpeie: "+ towar.toString());
        }
    }



}
