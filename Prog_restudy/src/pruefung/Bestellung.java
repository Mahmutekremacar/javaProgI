package pruefung;

import java.util.Arrays;

public class Bestellung {
    private int Bestellnummer;

    Artikel[] Artikelliste;
    int anzahlArtikel;

    public void setArtikelliste(){
        this.Artikelliste = new Artikel[50];
    }
    public Bestellung(int Bestellnummer){
        setArtikelliste();
        this.Bestellnummer =Bestellnummer;
        this.anzahlArtikel = 0;
    }

    public static void main(String [] args)
    {
        Artikel a = new Artikel(1234,"Deterjan");
        Artikel b = new Artikel(1235,"Dis");
        Artikel c = new Artikel(1236,"Et");
        System.out.println(a);
        Bestellung bestella = new Bestellung(0001);
        System.out.println(Arrays.toString(bestella.Artikelliste));
        bestella.einfuegen(a);
        bestella.einfuegen(b);
        bestella.einfuegen(c);
        System.out.println(Arrays.toString(bestella.Artikelliste));
        bestella.loeschen(a);
        System.out.println(Arrays.toString(bestella.Artikelliste));
    }
    public void loeschen(Artikel artikel)
    {
        for (int i = 0 ; i < anzahlArtikel; i++)
        {
            if(Artikelliste[i] == artikel){
                Artikelliste[i] = null;
            }
        }

    }
    public void einfuegen(Artikel artikel){
        if (anzahlArtikel < 50) {
            Artikelliste[anzahlArtikel++] = artikel;
        } else {
            System.out.println("Die maximale Anzahl von Artikeln in der Bestellung wurde erreicht.");
        }
    }

 static class Artikel{
    private int Artikelnummer;
    private String Artikelname;
    public Artikel(int Artikelnummer, String Artikelname)
    {
        setArtikelname(Artikelname);
        setArtikelnummer(Artikelnummer);
    }
    public void setArtikelnummer( int Artikelnummer){
        this.Artikelnummer = Artikelnummer;
    }
    public int getArtikelnummer()
    {
        return this.Artikelnummer;
    }
    public void setArtikelname( String Artikelname){
        this.Artikelname = Artikelname;
    }
    public String getArtikelname(){
        return this.Artikelname;
    }
}
}
