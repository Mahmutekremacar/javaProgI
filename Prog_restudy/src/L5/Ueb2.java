package L5;
import java.util.Scanner;
public class Ueb2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie b ein:");
        int b = input.nextInt();
        System.out.println("Geben Sie k ein:");
        int k = input.nextInt();
        int loe = 1;
        if(k == 0){
            System.out.println("1");
        }else if(k > 0) {
            for (int i = 1; i <= k; i++) {
                loe = loe * b;
            }
            System.out.println(loe);
        }else if(k < 0){
            for(int i = 1; i <= -1 *k; i++)
            {
                loe = loe * b;
            }
            System.out.println("1 / " + loe);
        }
    }
}
