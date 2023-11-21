package L6;
import java.text.DecimalFormat;
import java.util.Scanner;

public class L6_Ueb3 {
    /*

    Aufgabe: Dreieck
Schreiben Sie eine Methode, die ein Dreieck aus Sternen ausgibt. Die Methode soll
ein Argument entgegennehmen, das festlegt, wie viele Zeilen ausgegeben werden
sollen. In der rechten Abbildung sehen Sie eine Beispielausgabe für 5 Zeilen.
Beachten Sie bitte, dass zwischen den einzelnen Sternen ein Leerzeichen ausgegeben
wird.
Hinweis: Versuchen Sie zunächst das Dreieck in der linken Abbildung auszugeben.
Passen Sie dann Ihr Programm so an, dass das Dreieck auf der rechten Seite
herauskommt!

Task: Triangle
Write a method that outputs a triangle of stars. The method should
accept an argument that determines how many lines will be output
should. In the right image you can see sample output for 5 lines. Please note that there is a space between each star
becomes.

A notice:
First try to output the triangle in the left figure.
Then adjust your program so that the triangle on the right comes out!
*
* *
* * *
* * * *
* * * * *
     *
    * *
   * * *
  * * * *
 * * * * *

    */

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
