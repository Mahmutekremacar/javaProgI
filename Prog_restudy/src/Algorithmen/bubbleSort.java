package Algorithmen;
import java.lang.reflect.Array;
import java.util.*;
public class bubbleSort {
    public static void main(String[] args)
    {
        Random rand = new Random();
        int [] numbers = new int [1000];

        for (int i = 0 ; i < numbers.length; i++)
        {
            numbers[i] = rand.nextInt(1000000);
        }

        System.out.println("Before");
        System.out.println(Arrays.toString(numbers));
        //Sorting Algo here:
        boolean sorted = false;
        while(! sorted)
        {
            sorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    sorted = false;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter:");
        System.out.println(Arrays.toString(numbers));

    }

}
//++
