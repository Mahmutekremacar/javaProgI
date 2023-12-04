package L8;
import java.util.Scanner;
public class L8_Ueb1 {
/*
What we need
lives var
array of sentence
continuous input
* continuous loop that checks if the given char is in the array or not (if in array reloads the output accordingly.
* If not decreases lives one from total of 20. )
* */
public static char[] Space(char[] input){
    char[] total;

    for(char ch: input){
        if(ch==' '){
            ch = 'h'+'i';
            total += ch;
        }
        else{
            total += ch;
        }}

        return total;
    public static void main(String[] args)
    {
        String saetze = "PROGRAMMIERSPRACHE";
        char[] arr = saetze.toCharArray();
        //System.out.println(arr[0]);

        char[] total;



    }
}
