package L6;
import java.util.Scanner;
import java.math.*;
public class L6_Ueb2 {

    public static void fakultaet(int zahl) {
        int fak = 1;
        if(zahl == 0) {
            System.out.println("0! = "+ 1);
        }

        while (zahl > 0)
        {
            fak = zahl * fak;
            System.out.println("fak * " + zahl + " = "+ fak );
            zahl -= 1;
        }
    }

    //größeren Zahlen
    static void longnumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Zahl eingeben: ");
        long n = input.nextLong();
        System.out.println(fact(n));
    }
    public
    static BigInteger fact(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
    //****

    public static void main(String[] args) {
        fakultaet(6);
        System.out.println("***********");
        fakultaet(20);
        System.out.println("***********");
        longnumber();
        System.out.println("***********");
        fakultaet(0);
    }
}
//erl