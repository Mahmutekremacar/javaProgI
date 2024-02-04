package pruefung;
import java.util.Scanner;
//ws21 Aufgabe 2 C)
public class StringCalculate {
    private static final String[] numbers = {"null", "eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun"};

    public static double compute(String input) {
        Scanner scanner = new Scanner(input);

        double result = 0.0;
        double operand1 = 0.0;
        double operand2 = 0.0;
        String operator = "";

        while (scanner.hasNext()) {
            String token = scanner.next();
//wichtig!!!!!!
            if (isNumber(token)) {
                operand2 = numberFromString(token);

                if (!operator.isEmpty()) {
                    switch (operator) {
                        case "plus":
                            result = operand1 + operand2;
                            break;
                        case "minus":
                            result = operand1 - operand2;
                            break;
                        case "mal":
                            result = operand1 * operand2;
                            break;
                        case "dividiert":
                            if (operand2 == 0) {
                                return -1.0; // Division durch Null ist ungültig
                            }
                            result = operand1 / operand2;
                            break;
                        default:
                            return -1.0; // Ungültiger Operator
                    }
                    operand1 = result; // Speichern des Ergebnisses für den nächsten Operator
                    operator = ""; // Zurücksetzen des Operators
                } else {
                    operand1 = operand2; // Erstes Operanden setzen
                }
            } else if (isOperator(token)) {
                operator = token; // Operator setzen
            } else {
                return -1.0; // Ungültiges Token
            }
        }

        return result;
    }

    private static boolean isNumber(String token) {
        for (String number : numbers) {
            if (token.equalsIgnoreCase(number)) {
                return true;
            }
        }
        return false;
    }

    private static double numberFromString(String token) {
        for (int i = 0; i < numbers.length; i++) {
            if (token.equalsIgnoreCase(numbers[i])) {
                return i;
            }
        }
        return -1.0; // Ungültige Zahl
    }

    private static boolean isOperator(String token) {
        return token.equalsIgnoreCase("plus") || token.equalsIgnoreCase("minus") || token.equalsIgnoreCase("mal") || token.equalsIgnoreCase("dividiert");
    }

    // Beispiel für die Verwendung der Methode compute
    public static void main(String[] args) {
        String input1 = "Drei mal vier";
        System.out.println(input1 + " = " + compute(input1));

        String input2 = "neun dividiert durch drei";
        System.out.println(input2 + " = " + compute(input2));

        String input3 = "sieben plus vier";
        System.out.println(input3 + " = " + compute(input3));
    }
}
