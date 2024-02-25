package Algorithmen;
import java.util.*;
public class selectionSort {
    private static int[] selectSort(int[] numbers)
    {

    }
    public static void main(String[] main)
    {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0 ; i < numbers.length; i++)
        {
            numbers[i] = rand.nextInt(100000);
        }
        System.out.println("\n list Nums:");
        System.out.println(Arrays.toString(numbers));

        //selectionSort(numbers);
        System.out.println("\n (Selection Sorted) new list Nums:");
        System.out.println( Arrays.toString(selectSort(numbers)));


    }
}
