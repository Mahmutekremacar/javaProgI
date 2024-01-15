package L3;
import java.util.Scanner;
public class Ueb1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Gazzahl eingeben:  ");
        int num =  input.nextInt();
        System.out.println("teiler eingeben: ");
        int div = input.nextInt();
        if ( num % div ==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
//erl
