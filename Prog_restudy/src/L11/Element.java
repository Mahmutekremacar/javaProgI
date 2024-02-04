package L11;
import java.util.Arrays;
public class Element {
    String name;
    String kuerzel;
    int ordnungszahl;
    String gruppe;
    double masse;

    public Element(String name,String kuerzel, int ordnungszahl, String gruppe ){
        this.name = name;
        this.kuerzel = kuerzel;
        this.ordnungszahl = ordnungszahl;
        this.gruppe = gruppe;
    }
    public static final float VAT_GERMANY = 19.0f;

    public static void main(String[] args)
    {

        Element[][] ps = new Element[7][]; //Deklariert ein Array von 7 (Referenzen auf) Arrays
        ps[0] = new Element[2]; //das erste Array hat 2 Elemente
        ps[1] = new Element[8]; //das zweite Array hat 8 Elemente
        ps[2] = new Element[8];
        ps[3] = new Element[18];
        ps[4] = new Element[18];

        ps[0][0] = new Element("Wasserstoff", "H", 1, "1");
        ps[0][1] = new Element("Helium", "He", 2, "8");
        ps[1][0] = new Element("Lithium", "Li", 3, "1");
        ps[1][1] = new Element("Beryllium", "Be", 4, "2");
        ps[1][2] = new Element("Bor", "B", 5, "3");

        System.out.println(Arrays.deepToString(ps));
    }
}
