package L8;
import java.io.*;
import java.util.*;


public class L8_Ueb1 {
    /*
    What we need
    lives var
    array of sentence
    continuous input
    * continuous loop that checks if the given char is in the array or not (if in array reloads the output accordingly.
    * If not decreases lives one from total of 20. )
    * */




        public static void main(String[] args) {
            String[] words = {"PROGRAMMIERSPRACHE", "JAVA", "COMPUTER", "ENTWICKLUNG", "GALGENMAENNCHEN"};

            // Zufälliges Wort auswählen
            String selectedWord = words[(int) (Math.random() * words.length)];
            char[] guessedWord = new char[selectedWord.length()];

            // Initialisierung des geratenen Wortes mit Unterstrichen
            for (int i = 0; i < guessedWord.length; i++) {
                guessedWord[i] = '_';
            }

            int attempts = 0;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Willkommen bei Galgenmännchen!");
            System.out.println("Versuche das Wort zu erraten.");

            while (true) {
                // Anzeige des aktuellen geratenen Wortes
                System.out.println((attempts + 1) + ". Versuch: " + new String(guessedWord));

                // Benutzereingabe
                System.out.print("Buchstaben eingeben: ");
                char guess = scanner.next().toUpperCase().charAt(0);

                // Überprüfen, ob der geratene Buchstabe im Wort vorhanden ist
                boolean found = false;
                for (int i = 0; i < selectedWord.length(); i++) {
                    if (selectedWord.charAt(i) == guess) {
                        guessedWord[i] = guess;
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("Falsch! Versuche es erneut.");
                }

                // Überprüfen, ob das Wort vollständig erraten wurde
                if (new String(guessedWord).equals(selectedWord)) {
                    System.out.println("Herzlichen Glückwunsch! Du hast das Wort richtig erraten.");
                    break;
                }

                attempts++;

                // Überprüfen, ob die maximalen Versuche erreicht wurden
                if (attempts >= 15) {
                    System.out.println("Leider hast du das Wort nicht in 15 Versuchen erraten. Das richtige Wort war: " + selectedWord);
                    break;
                }
            }

            scanner.close();
        }
    }




