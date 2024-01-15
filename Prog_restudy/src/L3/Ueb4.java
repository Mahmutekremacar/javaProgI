package L3;
import java.util.*;
public class Ueb4 {
    public static void main(String[] args) {
        int WurfErgebnis = (int) (Math.random() * 6) + 1;
        switch(WurfErgebnis) {
            case 1:
                System.out.println("1 gewuerfelt");
                break;
            case 2:
                System.out.println("2 gewuerfelt");
                break;
            case 3:
                System.out.println("3 gewuerfelt");
                break;
            case 4:
                System.out.println("4 gewuerfelt");
                break;
            case 5:
                System.out.println("5 gewuerfelt");
                break;
            case 6:
                System.out.println("6 gewuerfelt");
                break;
            default:
                System.out.println("Ungültiges Wurfergebnis");
        }
    }
}
//erl
