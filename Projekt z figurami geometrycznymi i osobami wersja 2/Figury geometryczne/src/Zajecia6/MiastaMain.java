package Zajecia6;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MiastaMain {

    public static void main(String[] args) {

        /*Map mapa = new HashMap<String, Integer>();*/
        Hashtable<String, Integer> miasta = new Hashtable<>();

        miasta.put("Poznań",600000);
        miasta.put("Warszawa",1758143);
        miasta.put("Kraków",766738);
        miasta.put("Łódź",693797);
        miasta.put("Wrocław",638364);
        miasta.put("Berlin", 1500);
        miasta.put("Paryż", 1500);

        Hashtable<String, String>miastaKraje = new Hashtable<>();

/*        miastaKraje.put("Polska","Poznań");
        miastaKraje.put("Polska","Warszawa");
        miastaKraje.put("Polska","Kraków");
        miastaKraje.put("Polska","Łódź");
        miastaKraje.put("Niemcy","Wrocław");
        miastaKraje.put("Niemcy","Berlin");
        miastaKraje.put("Francja","Paryż");*/

        miastaKraje.put("Poznań","Polska");
        miastaKraje.put("Warszawa","Polska");
        miastaKraje.put("Krakó","Polska");
        miastaKraje.put("Polska","Łódź");
        miastaKraje.put("Niemcy","Wrocław");
        miastaKraje.put("Niemcy","Berlin");
        miastaKraje.put("Francja","Paryż");


        for(Map.Entry<String,String> wpis : miastaKraje.entrySet()){ //
            String miasto = wpis.getValue();

            for (Map.Entry<String,Integer> wpis2: miasta.entrySet()) {
                if (wpis2.getKey().equals(miasto)) {
                    System.out.printf("Kraj =%s , miasto = %s , liczba ludnośći %d", wpis.getKey(), wpis2.getKey(), wpis2.getValue());
                    System.out.println();
                }

            }
        }


    }

}
