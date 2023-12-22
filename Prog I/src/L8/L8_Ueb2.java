package L8;

import java.util.Scanner;

public class L8_Ueb2 {

/*Spaeter werde ich tun*/
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Number:");

    try{
        double num1 = sc.nextDouble();
    }
    catch (Exception ex){
        System.out.println("Not a valid double value");
    }
    System.out.println("Number:");

    try{
        double num2 = sc.nextDouble();
    }
    catch (Exception ex){
        System.out.println("Not a valid double value");
    }

    System.out.println(num1 * num2);
}
}
