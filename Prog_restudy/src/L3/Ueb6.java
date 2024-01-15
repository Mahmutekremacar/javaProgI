package L3;
import java.util.*;
public class Ueb6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie ein Jahr ein: ");
        int jahr = input.nextInt();
        if(jahr % 4 == 0){
            if(jahr % 400 == 0)
            {
                System.out.println("Schaltjahr");
            }else{
                System.out.println("nicht Schaltjahr");
            }
        }else{
            if(! (jahr % 100 == 0)){
                if(jahr % 400 == 0)
                {
                    System.out.println("Schaltjahr");
                }else{
                    System.out.println("nicht Schaltjahr");
                }
            }
        }
    }
}
//erl