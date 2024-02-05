package pruefung;

import java.util.Arrays;

public class textersetzen {

    public static void main (String [] args)
    {
        System.out.println(ersetze("Graphik.Init.Datei.ini"));

    }
    public static String ersetze(String inp) {
        int count = 0;
        char[] inpChar = inp.toCharArray();
        for (char c : inpChar) {
            if (c == '.') {
                count++;
            }
            // 1  count-1
        }
        System.out.println(count);
        String erg = null;
        if (count -1 == 0) {
            return inp;
        } else
            for (int i = 0; i < inpChar.length; i++) {
                if (inpChar[i] == '.' && count -1 > 0) {
                    inpChar[i] = '_';
                    count--;
                    inp = Arrays.toString(inpChar);
                }

            }
        return inp;
    }
}
