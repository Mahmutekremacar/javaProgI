package L7;

public class L7_Ueb3 {



        public static void main(String[] args) {
            // Beispielaufruf der Methode
            char[] inputArray = {'H', 'e', 'l', 'l', 'o', '!', ' ', 'w', 'o', 'r', 'l', 'd'};
            char[] resultArray = inGrossbuchstaben(inputArray);

            // Ausgabe des Ergebnisses
            System.out.println(resultArray);
        }

        /**
         * Diese Methode nimmt ein char-Array entgegen und wandelt alle Kleinbuchstaben
         * in Großbuchstaben um. Alle anderen Zeichen bleiben unverändert.
         *
         * @param inputArray Das Eingabe-Char-Array
         * @return Ein neues Char-Array mit umgewandelten Buchstaben
         */
        public static char[] inGrossbuchstaben(char[] inputArray) {
            // Neues Char-Array erstellen, um das Ergebnis zu speichern
            char[] resultArray = new char[inputArray.length];

            // Schleife durch das Eingabe-Array
            for (int i = 0; i < inputArray.length; i++) {
                // Überprüfen, ob das aktuelle Zeichen ein Kleinbuchstabe ist (im ASCII-Bereich für Buchstaben)
                if (inputArray[i] >= 'a' && inputArray[i] <= 'z') {
                    // Wenn ja, durch Subtraktion des ASCII-Werts von 'a' und Addition von 'A' in Großbuchstaben umwandeln
                    resultArray[i] = (char) (inputArray[i] - 'a' + 'A');
                } else {
                    // Andernfalls das Zeichen unverändert im Ergebnis-Array speichern
                    resultArray[i] = inputArray[i];
                }
            }

            // Das Ergebnis-Array zurückgeben
            return resultArray;

    }

}
//erl