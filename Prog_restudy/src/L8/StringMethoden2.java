package L8;

import java.util.Arrays;

public class StringMethoden2 {
    public static void main(String[] args)
    {
        char [] lst = {'a','b','c','d'};
        String str = "Ich gehe morgen mit meinen 11 Freund*innen zum Essen!";
        //System.out.println(deleteStartingSpace(str));
        //System.out.println(str.substring(0, (str.length() - ));
        //System.out.println(deleteEndingSpace(str));
        //System.out.println(deleteMutipleSpace(str));
        System.out.println(Arrays.toString(splitAtSpaceNoNonsense(str)));
    }

    public static String deleteStartingSpace(String satz)
    {
        if(satz.charAt(0) == ' ')
        {
          return  deleteStartingSpace(satz.substring(1));
        }
        return  satz;
    }

    public static String deleteEndingSpace(String satz)
    {
        if(satz.charAt(satz.length() - 1) == ' ')
        {
            return deleteEndingSpace(satz.substring(0,satz.length() -1));
        }
        return satz;

    }
    public static String deleteMutipleSpace(String satz)
    {
        for(int i = 0; i < satz.length(); i++)
        {
            if(satz.charAt(i) == ' ' && satz.charAt(i+1)== ' ')
            {
                satz = satz.substring(0,i) + satz.substring(i+1);

            }

        }
        return satz;
    }
    private static String[] splitAtSpaceNoNonsense(String input) {
        return input.split("\\s");
    }

//    private static String deleteEndingSpace(String sentence) {
//        if (sentence.charAt(sentence.length() - 1) == ' ') {
//            return deleteEndingSpace(sentence.substring(0, sentence.length() - 1));
//        } else return sentence;
//    }
//
//    private static String deleteMultipleSpace(String sentence) {
//        for (int i = 0; i < sentence.length(); i++) {
//            if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) == ' ') {
//                sentence = sentence.substring(0, i) + sentence.substring(i + 1);
//                // Schiebt i wieder zurück auf das 'neue' erste Leerzeichen
//                i--;
//            }
//        }
//        return sentence;
//    }
//
//    private static String[] splitAtSpace(String input) {
//        int spaces = 1;
//        int previousIndex = 0;
//        String[] output;
//
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) == ' ') {
//                spaces++;
//            }
//        }
//        output = new String[spaces];
//
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) == ' ') {
//                output[output.length - spaces] = input.substring(previousIndex, i);
//                previousIndex = i + 1;
//                spaces--;
//            }
//            output[output.length - 1] = input.substring(previousIndex);
//        }
//
//        return output;
//    }
}
