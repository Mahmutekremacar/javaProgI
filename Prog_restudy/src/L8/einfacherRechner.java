package L8;
import java.util.Scanner;
public class einfacherRechner {
    public static void main(String[] args) {
        // Überprüfen, ob mindestens drei Argumente übergeben wurden
        if (args.length < 3) {
            System.out.println("Bitte geben Sie mindestens zwei Zahlen und einen Operator (+ oder -) als Argumente ein.");
            return;
        }

        // Die eingegebene Operation (+ oder -)
        String operator = args[args.length - 1];

        // Die eingegebenen Zahlen summieren oder subtrahieren, abhängig vom Operator
        double result = Double.parseDouble(args[0]);
        for (int i = 1; i < args.length - 1; i++) {
            double number = Double.parseDouble(args[i]);
            if (operator.equals("+")) {
                result += number;
            } else if (operator.equals("-")) {
                result -= number;
            } else {
                System.out.println("Ungültiger Operator. Bitte geben Sie nur + oder - ein.");
                return;
            }
        }

        // Ausgabe des Ergebnisses
        System.out.println(result);
    }

}
