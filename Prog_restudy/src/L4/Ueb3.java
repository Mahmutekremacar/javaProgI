package L4;
import java.util.*;
public class Ueb3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie Zahl ein: ");
        int zahl = input.nextInt();
        if(!(zahl % 3 == 0 || zahl % 5 == 0 || zahl % 7 == 0 || zahl % 11 == 0 || zahl % 13 == 0)){
            System.out.println("Primzahl");
        }else{
            if(zahl == 3||zahl == 5||zahl ==7||zahl==11|| zahl==13){
                System.out.println("Primzahl");
            }else {
                System.out.println("nicht Primzahl!");
            }
        }
    }
}
