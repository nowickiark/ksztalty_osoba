package com.TreeSetComp;

import com.company.Osoba;

import java.util.Comparator;

public class ImieComparator implements Comparator<Osoba> {


    public ImieComparator(){}

    @Override
    public int compare(Osoba os1, Osoba os2){
        return os1.getImię().compareTo(os2.getImię());
    }


}
