package L6;
import java.util.Scanner;
public class Ueb2 {
    private static void fakultaet(int zahl, int ergebnis)
    {
        int zahlit = zahl;
        for(int i =0 ; i < zahlit ; i++)
        {
            ergebnis = ergebnis * zahl;
            zahl--;
        }
        System.out.println(ergebnis);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben si die Fakultaet ein:" );
        int zahl = input.nextInt();
        fakultaet(zahl, 1);
    }
}
