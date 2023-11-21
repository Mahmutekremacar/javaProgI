package L5;
import java.util.Scanner;
public class L5_Ueb2 {

    public static void exp(double b , int n) {
        double zahl = 1;
        if (n < 0){
            while((-1 * n) > 0)
            {
                zahl = zahl * b;
                n += 1;
            }System.out.println(1 / zahl);
        } else if (n == 0) {
            System.out.println(1);
        }else {
            while(n > 0)
            {
                zahl = zahl * b;
                n -= 1;
            }System.out.println( zahl);
        }
    }

    public static void main(String[] args) {
        exp(6 , 2);
        exp(5 , -2);
        exp(-5 , -2);
        exp(10 , 3);
        //.
    }
}
//erl