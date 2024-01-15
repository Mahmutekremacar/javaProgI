package L2;
import java.util.Scanner;
public class Ueb3 {
    public static void main(String[] args)
    {
        double tagAufSek = 24 * 60 * 60;
        Scanner input = new Scanner(System.in);
        System.out.println("Sekunden: ");
        double skd = input.nextInt();

        System.out.println("Minuten: ");
        double min = input.nextInt();

        System.out.println("Stunden: ");
        double std = input.nextInt();

        double schon = skd + (min * 60) + (std * 60 * 60);
        double prozent = ( schon / tagAufSek) * 100;
        System.out.println("schon verwendete prozent des Tages: " + prozent);


    }
}

// min -> 1 x 60
// std -> min x 60
//tag -> std x 24
//erl