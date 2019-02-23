package pizzria;

public class Pizza {

    private String nazwa;
    private Rozmiar roz;

   public Pizza(String nazwa, Rozmiar roz)
   {
       this.nazwa = nazwa;
               this.roz = roz;
   }

   public String showPizza()
   {
       return "To jest pizza " + nazwa + "o rozmiarze " + roz.getCm();
   }


}
