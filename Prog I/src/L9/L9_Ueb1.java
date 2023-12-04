package L9;
import java.util.Scanner;



public class L9_Ueb1 {
  /*  Ergänzen Sie in der Klasse Auto aus der vorherigen Lektion um einen Konstruktor, der es
    erlaubt, alle Attribute direkt bei der Erstellung des Objekts mitanzugeben.
    Schreiben Sie eine Methode setHubraum(int ccm), die es erlaubt von einer anderen
    Klasse aus, den Hubraum zu bestimmen. Stellen Sie sowohl im Konstruktor als auch in
    der Methode setHubraum(int ccm) sicher, dass der übergebene Hubraum gültig (größer
    als 0) ist. Im Konstruktor soll im ungültigen Fall der Hubraum auf 1600 gesetzt werden.
    In der Methode setHubraum(int ccm) soll im ungültigen Fall der bisherige Wert nicht
    verändert werden.*/


    /*
    * Taban sayi
    * us
    * taban sayiyi us jadar carpacak bir loop
    * */
    static void us_alma_forla()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Taban giriniz: ");
        double taban = sc.nextDouble();
        System.out.println("Us giriniz: ");
        double us = sc.nextDouble();
        double sonuc =1;
        if (us > 0)
        {
            for(int i = 0; i < us; i++)
            {
                sonuc = sonuc * taban;

            }
            System.out.println(sonuc);
        }
        else if(us == 0)
        {
            System.out.println(sonuc);
        }
        else
        {
            for(int i = 0; i < (-1 * us); i ++)
            {
                sonuc = sonuc * taban;

            }
            System.out.println(1 / sonuc);
        }
    }
    static void us_alma_while()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Taban giriniz: ");
        double taban = sc.nextDouble();
        System.out.println("Us giriniz: ");
        double us = sc.nextDouble();
        double sonuc = 1;
        if (us > 0){
            while (us > 0) {
                sonuc = sonuc * taban;
                us--;
            }
            System.out.println(sonuc);
        }else if(us == 0)
        {System.out.println(1);}
        else{
            while ((-1 * us) > 0)
            {
                sonuc = sonuc * taban;
                us++;
            }
            System.out.println(1 / sonuc);
        }
    }
    public static void main(String[] args)
    {
        us_alma_forla();
        int num = -2;
        switch(num){
            case 1:
        }

    }
}
