package L1;
import java.util.Scanner;
public class exBerroschoko {

    /*public static void sevgi(){
        Scanner input  = new Scanner(System.in);
        System.out.println("Sevdiginizin adinin girin: ");
        String sevdiginin_adi = input.next();
        System.out.println(sevdiginin_adi);

        System.out.println("Sayi girin: ");

        int sayi = input.nextInt();
        System.out.println(sayi);
    }
    public static void sevgiadli(String sevgilininadi)
    {
        System.out.println(sevgilininadi);
    }*/

    public static double toplama(double a , double b )
    {
        //System.out.println(a + b);
        double sonuc = a + b;
        return sonuc;
    }
    public static void cikarma(double a , double b )
    {
        System.out.println(a - b);
    }

    public static void bolme(double a , double b )
    {
        System.out.println(a / b);
    }
    public static void carpma (double a , double b )
    {
        System.out.println(a * b);
    }
    public static void main(String[] args) {
        //System.out.println("berrosokoyu cok seviyom");
        //sevgiadli("Berroschoko");
        System.out.println(7.0+ 8.0);
        System.out.println(toplama(8,7));


    }
}
