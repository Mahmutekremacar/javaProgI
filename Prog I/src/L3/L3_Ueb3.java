package L3;
import java.util.Scanner;
public class L3_Ueb3 {
    public static boolean isIn( char [] Array , char a , String nameArray){
        for( char character : Array){
            if(character == a){
                System.out.println("Es ist drin "+ nameArray);
                return true;
            }
        }
        System.out.println("Unbekannt");
        return false;
    }
    public static void main(String[] args) {
    char [] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    char [] hexZiffer = "0123456789abcdefABCDEF".toCharArray();
    char[] binary = {'0', '1'};
    char[] oktalZiffer = "01234567".toCharArray();

    //System.out.println(chars);
    //System.out.println(hexZiffer);
    // System.out.println("Es ist drin "+ Array);
    Scanner input = new Scanner(System.in);
    System.out.println("Einzelzeichne eingeben: ");
    char user = input.next().charAt(0);
    //System.out.println(user);
    isIn(chars, user, "chars");
    isIn(hexZiffer, user, "hexZiffer");
    isIn(binary, user, "binary");
    isIn(oktalZiffer, user, "oktalZiffer");
    }
}
// erledigt