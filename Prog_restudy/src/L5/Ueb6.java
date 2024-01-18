package L5;
import java.util.Scanner;
public class Ueb6 {
    public static void main(String[] main)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Ihre eingegebenen ganzen Zahlen werden addiert: ");
        System.out.println("Die Eingabe von 0 beendet das Programm und gibt die Summe aus!! ");
        int summe = 0;
        int eingabe ;
        while( true) {
            try {
                eingabe = input.nextInt();

            if (eingabe == 0) {
                break;
            }
            summe = summe + eingabe;
        }catch(java.util.InputMismatchException e)
            {System.out.println("InputMismatchException");
                break;}
        }
        System.out.println(summe);

    }
}
