package Slownik;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SlownikMain {

    public static void main(String[]argh){

        HashMap<String, List<String>> slownik = new HashMap<>();


        ArrayList<String> angielskie = new ArrayList<String>();

        angielskie.add("piece");
        angielskie.add("room");
        slownik.put("pokój",angielskie);
        slownik.put("zamek",(List<String>)Arrays.asList("key","castle"));

        for(Map.Entry<String,List<String>> wpis : slownik.entrySet()){
            System.out.print("Słowo: " + wpis.getKey() + ":");
            for(String ang : wpis.getValue())
                System.out.print(ang + ", ");

                System.out.println();

        }

        wczytajSłownik();

    }

    private static HashMap<String, List<String>> wczytajSłownik() {

        HashMap<String, List<String>> słownik = new HashMap<String, List<String>>();

        String plik = "niempol.txt";

        File file = new File(plik,"windows-1250");

        if (!file.exists())

            System.out.println("Pliku nie ma");

        try {

            Scanner skan1 = new Scanner(file);

            String pierwsza = skan1.nextLine();

            System.out.println(pierwsza);

            while (skan1.hasNextLine()) {

                String linia = skan1.nextLine();

                System.out.println(linia);

                String[] wyrazy = linia.split(";");

                String[] znaczenia = wyrazy[1].split(",");

                List<String> lista = new ArrayList<String>();

                for(String wyraz : znaczenia)

                    lista.add(wyraz);

                słownik.put(wyrazy[0], lista);

            }

            skan1.close();

            return słownik;

        }

        catch(FileNotFoundException ex) {

            System.out.println("Nie ma pliku");

        }

        return słownik;

    }

}
