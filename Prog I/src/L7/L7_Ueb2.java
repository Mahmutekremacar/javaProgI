package L7;
import java.lang.reflect.Array;
import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class L7_Ueb2 {
    static double mittelwert(double[] list)
    {
        Arrays.sort(list);
        int times = 1;
        double total = 0.0;
        for (int i = 0; i < list.length ; i++)
        {
            total = total + list[i];
        }
        total = total / list.length;
        System.out.println("Kleinester Wert: "+ list[0]);
        System.out.println("Groesster Wert: "+ list[(list.length) - 1]);
        System.out.println("Arithmetischer Mittelwert: "+total);
        double Arithmetischer_Mittelwert = total;
        return Arithmetischer_Mittelwert;
    }

    public static void main(String[] args) {

    //making the array
    Scanner input = new Scanner(System.in);
    System.out.println("Laenge des arrays eintritten: ");
    int length = input.nextInt();

    double[] zaehler =new double[length];

    //loop add inputs:

    for (int i = 0; i < length; i++)
    {
        System.out.println("Zahl eintritten: ");
        double userInput = input.nextDouble();
        zaehler[i] = userInput;

    }
    System.out.println("The  array input from user is : ");
    System.out.println(Arrays.toString(zaehler));
    //made the array

    mittelwert(zaehler);

    }
}

//erl
