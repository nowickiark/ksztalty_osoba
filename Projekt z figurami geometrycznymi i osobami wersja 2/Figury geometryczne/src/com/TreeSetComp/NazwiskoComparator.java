package com.TreeSetComp;

import com.company.Osoba;

import java.util.Comparator;

public class NazwiskoComparator implements Comparator<Osoba> {

    public NazwiskoComparator(){}

        @Override
            public int compare(Osoba o1, Osoba o2){
            return o1.getNazwisko().compareTo(o2.getNazwisko());
        }

    }



