package com.TreeSetComp;
import com.company.Adres;
import com.company.Osoba;
import com.company.StudenInformatyki;

import java.util.ArrayList;
import java.util.TreeSet;

import com.company.poziom;

import static com.company.poziom.dobry;
import static com.company.poziom.slaby;
import static com.company.poziom.sredni;

public class MainTree {

    public static ArrayList<Osoba> listaOsob = new ArrayList<Osoba>();

    public static void main(String[] args) {

        Osoba osoba1 = new Osoba("Jan", "Kowalski", "1980-11-02",new Adres("Leszno","Szymanowskiego","64-100"));
        Osoba osoba2 = new Osoba("Anna", "Zamojska", "1988-03-02",new Adres("Poznań","Rolna","49"));
        Osoba osoba3 = new Osoba("Janina", "Kot", "1988-04-02",new Adres("Luboń","Poznańska","27"));
        Osoba osoba4 = new Osoba("Antoni", "Robak", "1995-12-02",new Adres("Kościan","Leszczyńska","2"));
        Osoba osoba5 = new Osoba("Antoni", "Nowy", "1995-12-02",new Adres("Kościan","Leszczyńska","2"));


        listaOsob.add(osoba1);
        listaOsob.add(osoba2);
        listaOsob.add(osoba3);
        listaOsob.add(osoba4);
        listaOsob.add(osoba5);

        TreeSet<Osoba> osoby = new TreeSet<Osoba>(new NazwiskoComparator());

        for(Osoba os : listaOsob)
        {
            osoby.add(os);
        }

        for(Osoba o :osoby){
            System.out.println(o);
        }

        System.out.println();
        System.out.println("Posortowane po Imieniu");

        TreeSet<Osoba> osoby1 = new TreeSet<Osoba>(new ImieComparator());

        for(Osoba os : listaOsob)
        {
            osoby1.add(os);
        }

        for(Osoba o :osoby1){
            System.out.println(o);
        }

        System.out.println();
        System.out.println("Posortowane po Adresie");

        TreeSet<Osoba> osoby2 = new TreeSet<Osoba>(new AdresComparator());

        for(Osoba os : listaOsob)
        {
            osoby2.add(os);
        }

        for(Osoba o :osoby2){
            System.out.println(o);
        }


        System.out.println("porównywanie studentów ########################333");

        StudenInformatyki stud1 = new StudenInformatyki("Stefan","Kozanecki", dobry);
        StudenInformatyki stud2 = new StudenInformatyki("Marek","Ktos", sredni);
        StudenInformatyki stud3 = new StudenInformatyki("Jarek","Taki",slaby );




    }

}
