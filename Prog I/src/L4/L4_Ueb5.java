package L4;
import java.util.Scanner;
public class L4_Ueb5 {
    public static boolean inSpec(int zahl)
    {
        if (zahl > 1 && zahl < 1000000) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Zahl eingeben");
        int userZahl = input.nextInt();
        if (inSpec(userZahl)) {
            int product = 1;
            String numberString = String.valueOf(userZahl);
            for (int i = 0; i < numberString.length(); i++) {
                int digit = Character.getNumericValue(numberString.charAt(i));
                if (digit != 0) {
                    product *= digit;
                }
            }
            System.out.println("Querprodukt ist : "+product);
        }else{
            System.out.println("Falsche eingabe!");
        }
    }

}
// erledigt.
//.
