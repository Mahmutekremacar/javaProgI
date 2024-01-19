package L6;

public class Ueb3 {
    public static void main(String[] args) {
        printDreieck(5);
        printRechtesDreieck(5);
    }
    public static void printRechtesDreieck(int zeilen) {
        for (int i = 1; i <= zeilen; i++) {
            // Leerzeichen vor den Sternen
            for (int j = zeilen - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Sterne ausgeben
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printDreieck(int zeilen) {
        for (int i = 1; i <= zeilen; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


