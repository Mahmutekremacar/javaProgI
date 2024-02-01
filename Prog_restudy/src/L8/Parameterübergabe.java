package L8;
import java.util.Scanner;
public class Parameterübergabe {
    public static void main(String[] args) {
        // Überprüfen, ob genau zwei Argumente mitgegeben wurden
        if (args.length != 2) {
            System.out.println("Bitte geben Sie genau zwei Zahlen als Argumente ein.");
            return;
        }

        // Die eingegebenen Argumente als Zahlen parsen
        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            // Multiplikation der beiden Zahlen
            double result = num1 * num2;
            System.out.println(result);

            // Ausgabe des Ergebnisses
            System.out.println("Das Ergebnis der Multiplikation von " + num1 + " und " + num2 + " ist: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Fehler beim Parsen der Zahlen. Stellen Sie sicher, dass Sie gültige Zahlen eingeben.");
        }
    }
}
