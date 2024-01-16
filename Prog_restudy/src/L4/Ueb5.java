package L4;
import java.util.Scanner;
public class Ueb5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie ein Zahl ein: ");
        int zahl = input.nextInt();
        int erg = 1;
        if(zahl >= 0 && zahl <= 1000000)
        {
            while(!(zahl ==0)){
                erg = erg * (zahl % 10);
                zahl = (int) (zahl / 10);
            }
            System.out.println(erg);
        }else{
            System.out.println("Fehler-Unguelting zahl!");
        }
    }
}
