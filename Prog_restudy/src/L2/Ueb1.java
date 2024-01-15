package L2;
import java.util.Scanner;

public class Ueb1 {

    public static void main(String[] args)
    {
        double pi = 3.14;
        System.out.println("r eingeben: ");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        System.out.println("Kreisflaeche ist:  " + pi * r * r + " und Kugelflaeche ist: " + 4 * pi * r * r * r * 0.33);
        System.out.println("Kreisumfang ist: " + pi * r * 2);
    }

}
//erl
