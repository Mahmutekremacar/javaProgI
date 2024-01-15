package L4;
import java.util.*;
public class Ueb2 {
    public static void main(String[] args) throws InterruptedException {
        int sek = 1;
        while(sek <= 8){
            System.out.println("Zeit: "+ sek + " Sekunden: Zurueckgelegte Strecke: " + (9.80665 * sek * sek /2));
            Thread.sleep(1000);
            sek++;

        }
    }
    //erl


}
