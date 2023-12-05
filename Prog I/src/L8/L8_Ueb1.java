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

    public static void transposerToGame(char[] arr) {
        CharArrayWriter caw = new CharArrayWriter();
        for (int i = 0; i < arr.length; i++) {
            caw.append('_');

        }
        System.out.println(caw);

    }

    static void dieSpiel(char[] arrWord, char[] wordPlace, int lives) {
        Scanner sc = new Scanner(System.in);


        Boolean finished = false;
        while (lives > 0 && finished == false) {
            System.out.println("Errate einen buchstaben: ");
            char erratung = sc.next().charAt(0);
            int contains = 0;
            for (char c : arrWord) {

                if (c == erratung) {
                    wordPlace.replace(wordPlace[erratung],erratung);

                }
                contains++;

            }
        }
    }

        public static void main (String[]args)
        {
            String saetze = "PROGRAMMIERSPRACHE";
            char[] arr = saetze.toCharArray();
            System.out.println(arr);
            transposerToGame(arr);


        }

}

