package L7;
import java.util.Scanner;
public class L7_Ueb4 {
    public static void main(String[] args) {
        String normalWort = "spiel mit mir";
        String bSpracheWort = spielen(normalWort);
        System.out.println("Übergebene Zeichenfolge: " + normalWort);
        System.out.println("Zurückgelieferte Zeichenfolge: " + bSpracheWort);
    }

    public static String spielen(String wort) {
        char[] wortArray = wort.toCharArray();
        int neueLaenge = berechneNeueLaenge(wortArray);

        char[] bSpracheArray = new char[neueLaenge];
        int index = 0;

        for (char c : wortArray) {
            if (istVokal(c)) {
                bSpracheArray[index++] = 'b';
                bSpracheArray[index++] = Character.toLowerCase(c);
                bSpracheArray[index++] = c;
            } else {
                bSpracheArray[index++] = c;
            }
        }

        return String.valueOf(bSpracheArray);
    }

    private static int berechneNeueLaenge(char[] wortArray) {
        int laenge = 0;

        for (char c : wortArray) {
            if (istVokal(c)) {
                laenge += 3;
            } else {
                laenge += 1;
            }
        }

        return laenge;
    }

    private static boolean istVokal(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }


}
//nicht erl
