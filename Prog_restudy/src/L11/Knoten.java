package L11;

public class Knoten {
    String nachname;
    String vorname;
    String telefonnummer;
    Knoten next;

    public static void main(String[] args)
    {
        Knoten start = null;
        start = new Knoten("Aarson");
        Knoten k = new Knoten("Zylla");
        start.next = k;
        k = new Knoten("Cool");
        System.out.println(start.next);
        Knoten temp = start;
        while(temp.next != null)
        {
            System.out.println(temp.getNachname());
            temp = temp.next;
        }
        temp.next = k;
    }
    public Knoten(String nachname)
    {
        this.nachname = nachname;
    }

    public String getNachname()
    {
        return this.nachname;
    }
}
