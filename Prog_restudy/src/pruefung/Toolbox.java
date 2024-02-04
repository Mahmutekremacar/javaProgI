package pruefung;
//ws21 Aufgabe 2 A)
public class Toolbox {

    public static void main(String [] args)
    {
        System.out.println(prettyPrint("I like watermelon", "I like wattermelon and kiwi"));

    }
    public static String prettyPrint(String erst, String zweit)
    {
        String endString = null;
        if (erst.length() > zweit.length())
        {
            endString =erst + zweit;
        }
        else if(zweit.length() > erst.length())
        {
            endString= zweit+erst;
        }
        return endString;
    }
}
