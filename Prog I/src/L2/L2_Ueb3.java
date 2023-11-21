package L2;
import java.util.Scanner;

public class L2_Ueb3 {
    public static void uhrZeit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hours: ");
        int stunden = input.nextInt()* 60*60;
        System.out.println("Enter minutes: ");
        int minutes = input.nextInt() * 60;
        System.out.println("Enter seconds: ");
        int seconds = input.nextInt();
        int ganz_tag_sekunden = 24 * 60 * 60;
        int  passed = seconds+minutes+stunden;
        System.out.println("Seconds since midnight: ");
        System.out.println(passed);
        System.out.println("Number of seconds remaining: ");
        System.out.println(ganz_tag_sekunden-passed);
        System.out.println((passed*100)/ganz_tag_sekunden);

    }
    public static void main(String[] args) {
        uhrZeit();
    }
}
