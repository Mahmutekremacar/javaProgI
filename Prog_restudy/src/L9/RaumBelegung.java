package L9;
import java.util.Scanner;
public class RaumBelegung {
    private String name;
    private int stdAnzahl;
    private boolean belegt;

    public RaumBelegung(String name, int stdAnzahl, boolean belegt){
        setBelegt(belegt);
        setName(name);
        setStdAnzahl(stdAnzahl);
    }

    public static void main(String [] args)
    {
        RaumBelegung  raumEins = new RaumBelegung("I.2.1", 40, false);
        RaumBelegung  raumZwei = new RaumBelegung("I.2.15", 55, true);
        System.out.println(raumEins.getBelegt());
        System.out.println(raumZwei.getBelegt());
        if(!raumEins.getBelegt()){raumEins.setBelegt(true);}
        System.out.println(raumEins.getBelegt());
        System.out.println(raumZwei.getBelegt());

    }

    public void setName(String name){
        this.name = name;
    }
    public void setStdAnzahl(int stdAnzahl){
        this.stdAnzahl = stdAnzahl;
    }
    public void setBelegt(boolean belegt){
        this.belegt = belegt;
    }
    public String getName(){
        return this.name;
    }
    public int getStdAnzahl(){
        return this.stdAnzahl;
    }
    public boolean getBelegt(){
        return this.belegt;
    }
}
