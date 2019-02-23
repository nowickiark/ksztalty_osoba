package com.TreeSetComp;

import com.company.Adres;
import com.company.Osoba;
import java.util.Comparator;

public class AdresComparator implements Comparator<Osoba> {

    public AdresComparator(){}

    @Override
    public int compare(Osoba o1, Osoba o2){
            if(o1.getAdres().getMiasto() == o2.getAdres().getMiasto())
            {
                return o1.getNazwisko().compareTo(o2.getNazwisko());
            }
                return o1.getAdres().getMiasto().compareTo(o2.getAdres().getMiasto());
    }

}
