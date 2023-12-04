package L7;
import java.util.Scanner;
import java.io.*;
import java.util.*;


public class L7_Ueb5 {
    static void isIn (char a , String underscore, char[] chars)
    {
        char[] underscorearr = underscore.toCharArray();
        for (int i =0 ; i < chars.length; i++)
        {
            if (chars[i] == a)
            {
                underscorearr[i] = a;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wort eintritten");
        String sentence = sc.nextLine();
        char[] chars = sentence.toCharArray();

        String underScores = "";
        for (int i = 0; i < chars.length; i++) {
            underScores = underScores + "_";
        }
        //System.out.println(underScores);
        System.out.println("Zeichne vorstellen");
        String charinput = sc.next();
        //isIn(charinput, underScores,sentence);

    }

}
//nicht erl
