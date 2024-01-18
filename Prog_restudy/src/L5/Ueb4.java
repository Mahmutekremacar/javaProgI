package L5;

public class Ueb4 {

    public static void main(String[] args) {
        int[] durchlaeufe = {10, 100, 1000, 10000};

        for (int durchlauf : durchlaeufe) {
            double ergebnisVerfahren = berechneQuadratwurzelVerfahren(durchlauf);
            double ergebnisMathSqrt = Math.sqrt(durchlauf);

            System.out.println("Durchläufe: " + durchlauf);
            System.out.println("Ergebnis (Verfahren): " + ergebnisVerfahren);
            System.out.println("Ergebnis (Math.sqrt): " + ergebnisMathSqrt);
            System.out.println("Genauigkeitsunterschied: " + Math.abs(ergebnisVerfahren - ergebnisMathSqrt));
            System.out.println();
        }
    }

    private static double berechneQuadratwurzelVerfahren(int durchlaeufe) {
        double x = 1.0; // Startwert

        for (int i = 0; i < durchlaeufe; i++) {
            x = 0.5 * (x + durchlaeufe / x); // Verfahren zur Quadratwurzelberechnung
        }

        return x;
    }
}
