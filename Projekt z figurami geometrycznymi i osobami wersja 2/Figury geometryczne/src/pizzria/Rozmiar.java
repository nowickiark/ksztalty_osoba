package pizzria;

public enum Rozmiar {
    Mala(10),
    Srednia(20),
    Duza(30);


        private int cm;

        Rozmiar(int cm)
        {
            this.cm = cm;
        }

        public int getCm()
        {
            return cm;
        }

    public void setCm(int cm) {
        this.cm = cm;
    }
}
