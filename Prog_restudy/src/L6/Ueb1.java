package L6;
import java.util.Scanner;
public class Ueb1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double zahl = input.nextDouble();
        if( (zahl - (int)zahl) < 0.5 )
        {
            System.out.println((int)zahl);
        }else{
            System.out.println((int)zahl +1 );
        }

    }
    private static void runder(double zahl, int nachkommastelle)
    {

    }
}
