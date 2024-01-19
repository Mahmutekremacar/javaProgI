package L6;
import java.util.Scanner;

public class Ueb5 {
    private static void potetnz(double num, int hoch, double ergebnis)
    {
        for(int i =0; i < hoch ; i ++)
        {
            ergebnis *= num ;
        }
        System.out.println(ergebnis);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie zahl ein:!!!!! ");
        double zahl = input.nextDouble();
        System.out.println("Geben Sie hoch ein: ");
        int hoch = input.nextInt();
        potetnz(zahl, hoch, 1);
    }
}
