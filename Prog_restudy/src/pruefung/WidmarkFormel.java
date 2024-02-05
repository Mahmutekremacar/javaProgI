package pruefung;

import java.util.InputMismatchException;

public class WidmarkFormel {

    public static double berechneAlkKonzentration(double A, double masse, char geschlecht)
    {double erg = -1;

            if (geschlecht == 'm') {
                erg = A / (masse * 0.7);
            } else if (geschlecht == 'w') {
                erg =A / (masse * 0.6);
            } else if (geschlecht == 'j') {
                erg =A / (masse * 0.5);
            }else

                throw new InputMismatchException("Ungueltige input " + erg);



        return erg;
    }
    public static double berechneMasse( double V, double e, double p)
    {
        return V * e * p;
    }

    public static void main (String [] args )
    {
        System.out.println(berechneMasse(1000, 0.05,0.8));
        double promil =berechneAlkKonzentration(berechneMasse(1000, 0.05,0.8),120, 'p');
        if(promil >= 0.5)
        {
            System.out.println("Sie dürfen kein Auto mehr fahren!!!");

        } else if (promil < 0.5 && promil> 0.3) {
            System.out.println("Sie sollten kein Auto mehr fahren!!!");
        }
    }
}
