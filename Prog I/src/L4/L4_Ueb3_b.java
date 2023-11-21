package L4;

import java.util.ArrayList;
import java.util.Scanner;

public class L4_Ueb3_b {
    public static void istPrime(int userNum)
    {
        boolean isOn = true;
        boolean isP = false;
        if (userNum <= 0 || userNum == 1){
            System.out.println("fehler!!");
        }
        else
        {
            while (isOn )
            {
                --userNum;

                if (userNum <= 1)
                {
                    isOn = false;
                }
                for (int i = 2; i < userNum; ++i)
                {
                    if((userNum % i) == 0)
                    {
                        isP = false;

                    }else{
                        isP = true;
                    }
                }

                if (isP) {
                    System.out.println(userNum + ": Prim");
                }else if(!isP)
                {
                    System.out.println(userNum+": nicht Prim");
                }



            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Zahl eingeben: ");
        int userInt = input.nextInt();
        istPrime(userInt + 1);
    }
}



