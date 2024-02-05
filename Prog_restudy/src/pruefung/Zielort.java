package pruefung;

public class Zielort {
    private String name;
    private int distanz;
    private Zielort next;

//    a) Erstellen Sie eine Klasse  Zielort, welche den Namen und die Distanz zum Zielort in km
//    speichert. Die Klasse solle einen passenden Konstruktor und die entsprechenden getter‐
//    und setter‐Methoden besitzen. Jeder Zielort soll seinen Nachfolger (d.h. den nächsten
//    Zielort auf der Route) kennen.  ++
    public void setName(String name)
    {
        this.name = name;
    }
    public void setDistanz(int distanz)
    {
        this.distanz = distanz;
    }
    public void setNext(Zielort next)
        {
            this.next = next;
        }
    public String getName(){
        return this.name;
    }
    public int getDistanz(){
        return this.distanz = distanz;
    }
    public Zielort getNext(){
        return this.next;
    }
//    Überschreiben Sie die toString‐Methode so, dass die Daten der Zielorte aussagekräftig
//    in folgendem Format zurückgegeben werden (Beispiel für Ort Kitzingen mit der Distanz
//            19 km): ++

    public String stringify(){
        return (" Ortsname: "+ name + "  Distanz: "+ distanz + " km");
    }
    public static void main(String[] args)
    {

    }

class Fahrstrecke{
    private Zielort start;

    public Fahrstrecke() {
        this.start = null;
    }
//    c) Schreiben Sie eine Klasse Fahrstrecke, welche Objekte der Klasse Zielort in Form einer
//    einfach verketteten Liste verwaltet. Die Klasse soll einen Konstruktor besitzen der eine
//    leere Liste erzeugt +++

    public Zielort einfuegen(){
        Zielort neuinstanz = new Zielort();
        if( start == null)
        {

            start = neuinstanz;
            return  start;
        }else
            next =neuinstanz ;
        return next;
    }
}
}
