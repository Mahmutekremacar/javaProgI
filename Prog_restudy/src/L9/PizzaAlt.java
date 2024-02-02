package L9;

public class PizzaAlt {
    String name;
    int[] durchmesser;
    float[] preis;

    public PizzaAlt(String name, int[] durchmesser, float[] preis) {
        this.name = name;
        this.durchmesser = durchmesser;
        this.preis = preis;
    }

    public static void main(String [] args)
    {
        PizzaAlt bacon = new PizzaAlt ("Bacon", new int[] {15, 25, 30}, new float[] {5 , 10 , 15});
        bacon.preisLeistung(bacon.durchmesser[0],bacon.preis[0]);
    }

    public float preisLeistung(int durchmesser, float preis) {
        return durchmesser / preis;
    }
}
