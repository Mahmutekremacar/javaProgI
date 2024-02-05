package WS2020;

import java.util.Arrays;


public class test {

    public static void main (String [] args){
    int[][] lotteryArray = new int[3][3];

    for(int i = 0 ; i < 3; i++)
    {
        for (int j= 0; j < 3; j++)
        {
            lotteryArray[i][j] = 3;
        }
    }
    System.out.println(Arrays.deepToString(lotteryArray));
        System.out.println( (int )(Math.random( ) * 6) );

        int [] [] test = new int[5][2];

        test[1][1] = 3;
        System.out.println(Arrays.deepToString(test));
}
}
