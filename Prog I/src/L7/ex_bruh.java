package L7;
import java.math.*;
public class ex_bruh
{
    public static void main(String[] args) {


        int zahl = (int) (Math.random() * 6 + 1);
        switch (zahl) {
            case 1:
                System.out.println("Es wurde eine 1 gefuerfelt.");
                break;
            case 2:
                System.out.println("Es wurde eine 2 gefuerfelt.");
                break;
            case 3:
                System.out.println("Es wurde eine 3 gefuerfelt.");
                break;
            case 4:
                System.out.println("Es wurde eine 4 gefuerfelt.");
                break;
            case 5:
                System.out.println("Es wurde eine 5 gefuerfelt.");
                break;
            default:
                System.out.println("Es wurde keine 1 2 3 4 5 gefuerfelt.");
                break;
        }

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
