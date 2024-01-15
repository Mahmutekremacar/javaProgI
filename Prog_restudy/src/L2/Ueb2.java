package L2;
import java.util.Scanner;
import java.lang.Math.*;
public class Ueb2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("a eingeben: ");
        double a = input.nextDouble();
        System.out.print("p eingeben: ");
        double p = input.nextDouble() / a;
        System.out.print("q eingeben: ");
        double q = input.nextDouble() / a ;
        double x1 = (p / 2 * -1) - Math.sqrt(Math.pow(p/2, 2) - q);
        double x2 = (p / 2 * -1) + Math.sqrt(Math.pow(p/2, 2) - q);
        System.out.println("x1 ist: " +  x1 + " und x2 ist: " + x2);


    }
}
//erl