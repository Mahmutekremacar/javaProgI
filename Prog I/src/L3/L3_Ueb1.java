package L3;
import java.util.Scanner;

public class L3_Ueb1 {

    public static void istGanzzahligMitSieben(double a) throws InterruptedException {
        System.out.println("Checking ");
        if(a % 7 == 0){
            System.out.println("Ist Ganzzahlig ");
            Thread.sleep(100);
        } else if (a % 7 != 0) {
            System.out.println("Ist nicht Ganzzahlig");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Zahl eingeben: ");

        double a = input.nextDouble();
        istGanzzahligMitSieben(a);

    }
}

// erledigt
