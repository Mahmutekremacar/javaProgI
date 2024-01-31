package L8;
import java.util.Scanner;
import java.util.random.*;
public class Galgenmanchen {

    public static boolean isIn( char array[], char chr)
    {
        boolean in = false;
        for(int i = 0 ; i < array.length; i++){
            if(chr == array[i]){
                in = true;
                break;
            }

        }
        return in;
    }

    public static void op(char length[], char knownletters[]){
        for(int i = 0; i < knownletters.length;i++)
        {
            for(int j = 0; j < length.length; j++)
            {
                if(length[j] == knownletters[i])
                {
                   // length[i] = ''
                }
            }

        }
    }
    public static void main(String [] args)
    {
        char[] arr = {'a','b','c','d'};
        Scanner sc = new Scanner(System.in);
        String [] woerter = new String[]{"PROGRAMMIERSPRACHE", "BRUH", "MENSCHEN", "QUATSCH"};
        //System.out.println(isIn(arr,'e'));  checked



        /*
        check if game is finished
            if yes check the outcome
        * user -> input
        * check if try left
        *           if not failed
        *           if yes
        *               check if input in array
        *                       if yes change o/p in the places of the input char
        *                       if no -1 try*/
    }
}
