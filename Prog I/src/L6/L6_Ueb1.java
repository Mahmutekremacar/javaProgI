package L6;

import java.util.Scanner;
import java.text.DecimalFormat;

public class L6_Ueb1 {
    /*
    Aufgabe: Runden
a) Schreiben Sie eine Methode, die eine übergebene Zahl auf- oder abrundet.
Beispiele:
3,2 wird auf 3 abgerundet
3,5 auf 4 aufgerundet
b) Schreiben Sie eine weitere Methode, welche eine übergebene Zahl auf eine
bestimmte Anzahl Nachkommastellen rundet. Die Anzahl der Nachkommastellen
soll anhand eines zusätzlich übergebenen Parameters bestimmt werden können.
Hinweis: Die Verwendung sämtlicher Methoden aus der Klasse Math ist untersagt!
*/

    public static double howManyDigits(double zahl, int digits) {
        String dec = ".";
        while(digits>0)
        {
            dec += "#";
            digits -= 1;
        }
        DecimalFormat form = new DecimalFormat(dec);
        //System.out.println(form.format(zahl));
        double number = Double.valueOf(form.format(zahl));
        return number;
    }
    public static void main(String[] args) {
        double z = 4.353;
        double PI = 30000000000.1415;
        Scanner input = new Scanner(System.in);

        boolean isOn = true;
        while(isOn = true){
            System.out.println("Decimal Zahl eintritten: ");
            double verZahl = input.nextDouble();
            int verInt = Integer.valueOf((int) verZahl);

            if (verZahl >= 0) {
                if (((verZahl) - verInt) < ((verInt + 1) - verZahl)) {
                    System.out.println(verInt);
                } else {
                    System.out.println(verInt + 1);
                }
            } else {
                if ((-((verZahl) - verInt)) <= (-((verInt - 1) - verZahl))) {
                    System.out.println(verInt);
                } else {
                    System.out.println(verInt - 1);

                }
            }

        }

    }
}
// a)erl
// b) nicht erl
