package com.company;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    public static ArrayList<Osoba> listaOsob = new ArrayList<Osoba>();
    public static ArrayList<Towar> towaryWSklepie = new ArrayList<Towar>();
    public static void main(String[] args) throws FileNotFoundException {


        Supersklep zabka = new Supersklep("zabka");
        zabka.wczytajTowary();
        zabka.wyswietlTowary();


	// osoby ...
     Towar t1 = new Towar("spodnie Levis", 234.56);
     Towar t2 = new Towar("telefon Galaxy S99", 1134.56);
     Towar t3 = new Towar("sok jabłko-mięta", 2.5);
     Towar t4 = new Towar("gramofon", 250.9);
     Towar t5 = new Towar("stół", 550.9);
     towaryWSklepie.add(t1);
     towaryWSklepie.add(t2);
     towaryWSklepie.add(t3);
     towaryWSklepie.add(t4);
     towaryWSklepie.add(t5);
     Osoba osoba1 = new Osoba("Jan", "Kowalski", "1980-11-02", new Adres("Poznań", "ul. Szklista 12", "60-111"));
     Osoba osoba2 = new Osoba("Anna", "Zamojska", "1988-03-02");
     Osoba osoba3 = new Osoba("Janina", "Kot", "1988-04-02");
     Osoba osoba4 = new Osoba("Antoni", "Robak", "1995-12-02");
     Student studen1 = new Student("Arek", "Nowicki", "1990-12-08", 2, "informatyka");

     Pracownik prac1 = new Pracownik("Marek","Nowiak", "1960-12-04",3456.12);
     Pracownik prac2 = new Pracownik("Darek","Kowalski", "1940-01-05",2000.12);
     Pracownik prac3 = new Pracownik("Anna","Janicka", "1979-01-30",2800.12);



        System.out.println();
        System.out.println("Pracownicze #############################################");

        List<Pracownik> lista = Arrays.asList(prac1,prac2,prac3);


        for(Pracownik prac: lista)
        {
            if (prac.getPensja()<12000 && prac.getWiek() > 30){
                System.out.println();
                System.out.printf("Pracownik %s %s ma lat %d i zarabia %.2f zł",prac.getImię(),prac.getNazwisko(),prac.getWiek(),prac.getPensja());
            }
        }
        System.out.println();
        System.out.println("Pracownicze #############################################");
        System.out.println();

     osoba1.setPieniądze(1200);
     osoba2.setPieniądze(1900);
     osoba3.setPieniądze(3500);
     osoba4.setPieniądze(10);

     osoba1.setZachowanie(new Trzpiot());
     osoba2.setZachowanie(new Snob());
     osoba3.setZachowanie(new Rozrzutny());
     listaOsob.add(osoba1);
     listaOsob.add(osoba2);
     listaOsob.add(osoba3);
     listaOsob.add(osoba4);
     listaOsob.add(studen1);



       /*Collections.sort(listaOsob);*/
        for(Osoba os:listaOsob){
            System.out.println(os.toString());
            if(os instanceof Student)
                System.out.println("POKAŻ STUDENTA########################################33");
                os.toString();
        }


     System.out.println("Symulacja zachowania w sklepie:");
     for(Osoba osoba : listaOsob) {
         double wydano = osoba.kupuj(osoba.getPieniądze(), towaryWSklepie);
         osoba.zapłać(wydano);
     }
     System.out.println(osoba1.getImię());
      boolean czyUdałoSię = osoba1.setNazwisko("Mickiewcz!");
      if (!czyUdałoSię)
          System.out.println("Nie udało się zmienić nazwiska");
     for(Osoba osX : listaOsob)
        System.out.println(osX.toString());
     for(int i = 0; i < listaOsob.size(); i++)
         System.out.println(listaOsob.get(i).toString());


/*        System.out.println();
        System.out.println("Pokaż TREE ######################################################3");

        TreeSet<Osoba> osoby = new TreeSet<Osoba>(new NazwiskoComparator());*/


        System.out.println("##################### Osoby na J");

        List <Osoba> qwe =
                listaOsob
                .stream()
                .filter(p -> p.getImię().startsWith("J"))
                .collect(Collectors.toList());

        System.out.println(qwe);

        ArrayList<Pracownik> pracownicy = new ArrayList<>();
        pracownicy.add(new Pracownik("Aradkiusz", "Nowicki", "1991-03-12",1990));
        pracownicy.add(new Pracownik("Katarzyna", "Laciak", "1990-02-23",990));
        pracownicy.add(new Pracownik("Btefan", "Burczymucha", "1991-05-12",4990));

        List<Pracownik> posortprac = pracownicy
                .stream()
                .sorted((p1,p2) -> (int)(p1.getPensja()-p2.getPensja()))
                .collect(Collectors.toList());


        posortprac.forEach((p) -> System.out.println(p.getImię() + " " + p.getNazwisko() + " zarabia " + p.getPensja() + "zł"));


    /*    System.out.printf("Miesiać pierwszej osoby to %d ",posortprac.get(0).getMiesiac());*/

        List<Pracownik> pracmies = pracownicy
                .stream()
                .filter(p-> p.getMiesiac() == 1 || p.getMiesiac() == 2 || p.getMiesiac() == 3 || p.getMiesiac() == 4 || p.getMiesiac() == 5 || p.getMiesiac() == 6)
                .sorted((p1,p2) -> p1.getImię().compareTo(p2.getImię()))
                .collect(Collectors.toList());

        System.out.println("########################### Pokaż pracownikó z miesićami ");

        pracmies.forEach((p) -> System.out.println(p.getImię() + " " + p.getNazwisko() + " ma lat " + p.getWiek()));


        double suma = pracownicy
                .stream()
  /*              .map(p -> p.getPensja())*/
                .collect(Collectors.summingDouble(p->p.getPensja()));

        System.out.println("Wszystkie pensje łącznie wychdodzą " + suma);


    }
}
