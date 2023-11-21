package L3;
import java.util.Scanner;

public class L3_Ueb7 {
    public static void main(String[] args) {
        System.out.println("00:00:00");
        Scanner input = new Scanner(System.in);
        System.out.println("Stunden eingeben: ");
        int std = input.nextInt();
        if(std >= 24){
            System.out.println("error");
            System.exit(0);
        }
        System.out.println("Minuten eingeben: ");
        int min = input.nextInt();
        if(min > 60){
            System.out.println("error");
            System.exit(0);
        }
        if( std == 23 ){
            if(min >= 60) {
                System.out.println("error");
                System.exit(0);
            }
        }
        System.out.println("Sekunden eingeben: ");
        int sek = input.nextInt();
        if( std == 23 ){
            if(sek >= 60) {
                System.out.println("error");
                System.exit(0);
            }
        }

        System.out.println(std+":"+min+":"+sek);
    }
}
// erledigt
