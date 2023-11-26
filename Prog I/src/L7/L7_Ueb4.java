package L7;
import java.util.Scanner;
public class L7_Ueb4 {


    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Zeichenfolge uebergeben: ");
        String userZaehler = input.nextLine();
        char[] uebergebene_zeichenfolge = userZaehler.toCharArray();
        System.out.println(uebergebene_zeichenfolge);

        int wie_gross = uebergebene_zeichenfolge.length;
        for (char i : uebergebene_zeichenfolge)
        {
            if (i == 'a' || i == 'e' || i == 'i' || i=='o'|| i =='u')
            {
                wie_gross = wie_gross + 2;
            }
        }
        System.out.println(wie_gross);
        }

}
//nicht erl
