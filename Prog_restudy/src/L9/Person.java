package L9;
import java.util.*;
public class Person {
    String vorname;
    String nachname;
    String username;
    public Person(String vorname, String nachname, String username){
        this.vorname = vorname;
        this.nachname = nachname;
        this.username = username;
        System.out.println(vorname + nachname + username);
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Person ein geben: prsn vornm nachnm usernm");

        String vornm = sc.next();
        String nachnm = sc.next();
        String usernm = sc.next();

        Person prsn = new Person(vornm,nachnm, usernm);
    }
}
