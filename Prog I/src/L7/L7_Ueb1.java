package L7;
import java.util.Scanner;
public class L7_Ueb1 {
    /*Schreiben Sie eine Methode, die den Sinus berechnet. Der Sinus kann durch folgende
    Reihe berechnet werden:

    Schreiben Sie zunächst die ersten fünf Glieder der Summe auf (auf ihr Lösungsblatt)!
    Testen Sie Ihre Methode, indem vom Anwender der Wert x abgefragt und
    eingegeben wird. Anschließend wird die Methode aufgerufen und das Ergebnis auf
    der Standardausgabe angezeigt.
            Hinweis: Gehen Sie analog zur Berechnung des Cosinus im Vorlesungsskript vor. Die
    Verwendung von Methoden aus der Klasse Math aus der Java‐Bibliothek ist
    untersagt!*/


    static double exponent(double base , double power) {
            double result = 1.0;
            // running loop while the power > 0
            while (power != 0) {
                result = result * base;
                // power will get reduced after
                // each multiplication
                power--;
            }
            return result;
        }
        static double factoriel(double num)
        {
            double result = 1.0;
            while(num != 0)
            {
                result = result * num;
                num--;
            }
            return result;
        }

        static void sinberechnung(int x)
        {
            double total = 0 ;
            double prev_total = -100;
            int i = 0;

            while(prev_total - total >= 0.0001 && prev_total > 1 && prev_total < -1)
            {
                if ( i % 2 == 0) {
                    prev_total = total;
                    total = total + ( exponent(x ,((2.0 * i) + 1.0)) / factoriel((2.0 *i) + 1.0));
                    i++;

                }
                else{
                    prev_total = total;
                    total = total -  ( exponent(x ,((2.0 * i) + 1.0)) / factoriel((2.0 *i) + 1.0));
                    i++;
                }

            }
            System.out.println(total);
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sinus berechnen: ");
        int angle = input.nextInt();
        sinberechnung(angle);
    }

}
