package pruefung;
import java.util.Scanner;
//ws21 Aufgabe 2 B)
public class Check {
    public static boolean verify(String passwd) {
        // Prüfen auf Mindestlänge von 12 Zeichen
        if (passwd.length() < 12) {
            return false;
        }

        // Prüfen auf ! oder ?
        if (!passwd.contains("!") && !passwd.contains("?")) {
            return false;
        }

        // Prüfen auf Vermeidung von "passwort" oder "Passwort"
        if (passwd.toLowerCase().contains("passwort")) {
            return false;
        }

        // Prüfen auf Anzahl von Ziffern
        int digitCount = 0;
        for (char c : passwd.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount < 4 || digitCount > 6) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean valid = false;

        while (!valid) {
            System.out.println("Bitte geben Sie ein Passwort ein:");
            password = scanner.nextLine();

            valid = verify(password);

            if (!valid) {
                System.out.println("Das Passwort erfüllt nicht alle Eigenschaften. Bitte erneut versuchen.");
            }
        }

        System.out.println("Das Passwort erfüllt alle Eigenschaften. Vielen Dank!");
    }
}
