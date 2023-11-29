package L7;
import java.util.Scanner;
public class L7_Ueb1_1 {

    /*Berechnet den Kosinus von der übergebenden Zahl x.
    @param x reelle Zahl (in RAD), von der Kosinus berechnet werden soll.
    @return Ergebnis des Kosinus; reelle Zahl Zwischen -1 und 1 (beide inklusive)*/
    public static double cos(double x) {
        double zaehler = 1.0;
        double nenner = 1.0;
        double summe = 1.0;
        double summand = 1;
        for (int i = 2; summand > 1E-15 ||
                summand < -1E-15; i = i + 2) {
            zaehler = zaehler * x * x * (-1);
            nenner = nenner * i * (i - 1);
            summand = zaehler / nenner;
            summe = summe + summand;
        }
        System.out.println(summe);
        return summe;

    }

    static double exponent(double base, int exp) {
        double ans = 1;
        while (exp >= 0) {
            ans = ans * base;
            exp--;
        }

        return ans;
    }

    static int factoriel(int k) {
        int ans = 1;
        int cur_num = k;
        while (cur_num > 0) {
            ans = ans * k;
            k--;
        }
        return ans;
    }

    public static double sin(double x) {
        double zaehler = x * x * x ;
        double nenner = 5.0 * 4.0 * 3.0 * 2.0;
        double summe = 1.0;
        double summand = 1;
        for (int i = 2; summand > 1E-15 ||
                summand < -1E-15; i = i + 2) {
            zaehler = zaehler * x * x * (-1);
            nenner = nenner * i * (i - 1);
            summand = zaehler / nenner;
            summe = summe + summand ;
        }
        System.out.println(summe);
        return (summe - 1);
    }
    public static void main (String[]args){
        cos(30);
        sin(30);
    }
}
