package Uebungen;
import java.util.Random;
import java.util.Scanner;
public class SpaceInvaders {
    private char[][] spielfeld;

    public SpaceInvaders() {
        spielfeld = new char[4][8];
        initializeSpielfeld();
    }

    private void initializeSpielfeld() {
        // Initialisiere obere Reihe mit Aliens
        for (int i = 0; i < spielfeld[0].length; i++) {
            spielfeld[0][i] = 'o';
        }

        // Leere Reihen
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                spielfeld[i][j] = ' ';
            }
        }

        // Platziere Raumschiff in unterster Reihe
        Random rand = new Random();
        int randomPosition = rand.nextInt(spielfeld[3].length);
        spielfeld[3][randomPosition] = 'V';
    }

    public void bewege(char richtung) {
        int raumschiffPosition = findeRaumschiff();

        switch (richtung) {
            case 'a':
                if (raumschiffPosition > 0) {
                    spielfeld[3][raumschiffPosition] = ' ';
                    spielfeld[3][raumschiffPosition - 1] = 'V';
                }
                break;
            case 'd':
                if (raumschiffPosition < spielfeld[3].length - 1) {
                    spielfeld[3][raumschiffPosition] = ' ';
                    spielfeld[3][raumschiffPosition + 1] = 'V';
                }
                break;
            default:
                // Nichts tun für andere Buchstaben
                break;
        }
    }

    private int findeRaumschiff() {
        for (int i = 0; i < spielfeld[3].length; i++) {
            if (spielfeld[3][i] == 'V') {
                return i;
            }
        }
        return -1; // Sollte eigentlich nie passieren
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (char[] row : spielfeld) {
            for (char cell : row) {
                result.append(cell).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        SpaceInvaders spaceInvaders = new SpaceInvaders();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(spaceInvaders);
            System.out.println("Buchstabe eingeben (a = links, d = rechts, x = Ende): ");
            char eingabe = scanner.next().charAt(0);

            if (eingabe == 'x') {
                System.out.println("Spiel beendet.");
                break;
            }

            spaceInvaders.bewege(eingabe);
        }

        scanner.close();
    }

}
