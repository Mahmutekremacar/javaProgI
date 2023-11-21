package L4;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = dec1(n)+dec2(m);

        int i=0,c;
        int[] arr= {};

        while(k>0) {
            c = k % 2;
            k = k / 2;
            arr[i++]=c;   //The problem is here. It shows some //error
        }
        while (i >= 0) {
            System.out.print(arr[i--]);
        }
    }

    public static int dec1(int n) {
        int a,i=0;
        int dec1 = 0;
        while(n>0) {
            a=n%10;
            n=n/10;
            dec1= dec1 + (int) (a * Math.pow(2, i));
            i++;
        }
        return dec1;
    }

    public static int dec2(int m) {
        int b,j=0;
        int dec2 = 0;
        while(m>0) {
            b=m%10;
            m=m/10;
            dec2= dec2 + (int) (b  * Math.pow(2, j));
            j++;
        }
        return dec2;
    }


}