package L5;
import java.util.*;
public class Ueb5 {


        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Anzahl der zu verwendenden Rechtecke ein: ");
        int anzahlRechtecke = scanner.nextInt();

        double piApproximation = berechnePi(anzahlRechtecke);

        System.out.println("Die Näherung von π mit " + anzahlRechtecke + " Rechtecken beträgt: " + piApproximation);

        scanner.close();
    }

        private static double berechnePi(int n) {
        double breite = 1.0 / n;
        double summe = 0.0;

        for (int i = 0; i < n; i++) {
            double x = (i + 0.5) * breite;
            double rechteckflaeche = breite * f(x);
            summe += rechteckflaeche;
        }

        return summe;
    }

        private static double f(double x) {
        // Hier wird die Funktion f(x) definiert, für die die Näherung durchgeführt wird.
        // In diesem Fall verwenden wir die Funktion f(x) = 4 / (1 + x^2).
        return 4.0 / (1.0 + x * x);
    }
    }

