package Koejka;

import java.util.ArrayDeque;
import java.util.Stack;

public class Main<tab> {

    public static void main(String[] args) {


    int[] tab = {1, 5, 22, 17, 3, 18, 11, 4, 15, 5, 7, 2, 9, 11, 12, 5, 1, 18};

    Stack stos = new Stack();


        for(int i=0; i < 9; i++)
        {
           stos.push(tab[i]);
        }


        for(int i=0; i < 9; i++)
        {
            System.out.println(stos.pop());
        }


        System.out.println("pierwsza połowa");

        for(int i=9; i < 18; i++)
        {
            stos.push(tab[i]);
        }


        for(int i=0; i < 9; i++)
        {
            System.out.println(stos.pop());
        }



}
}
