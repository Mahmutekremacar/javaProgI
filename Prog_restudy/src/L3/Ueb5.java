package L3;
import java.util.*;
public class Ueb5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie Matrikelnummer ein: ");
        int matr =input.nextInt();
        int passt = (int)(matr / 100000);
        if(! ((matr / 1000000 ) >= 1))
        {
            System.out.println("Ungueltige matr!");
        }else{
        switch(passt){
            case 50:
                System.out.println("Korrekt");
                break;
            case 51:
                System.out.println("Korrekt");
                break;
            case 61:
                System.out.println("Korrekt");
                break;
            default:
                System.out.println("Ungeltige matr!");
                break;
        }
        }
    }
}
//erl
