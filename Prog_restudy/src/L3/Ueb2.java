package L3;
import java.util.Scanner;
public class Ueb2 {
    public static double rechner (double r, double preis){
        return ((r * r) / preis);
    }
    public static void main(String[] args ){
        double pi = 3.14;
        Scanner input = new Scanner(System.in );
        System.out.println("26cm pizzas Preis eingeben: ");
        double kleinpr = input.nextDouble();
        System.out.println("28cm pizzas Preis eingeben: ");
        double mittelpr = input.nextDouble();
        System.out.println("30cm pizzas Preis eingeben: ");
        double grosspr = input.nextDouble();
        if (rechner(30, grosspr) > rechner(28, mittelpr)){
            if(rechner(30, grosspr) > rechner(26, kleinpr)){
                System.out.println(grosspr);
            }else {
                System.out.println(kleinpr);
            }
        }else if(rechner(28, mittelpr) > rechner(26, kleinpr)){
            System.out.println(mittelpr);
        }else {
            System.out.println(kleinpr);
        }
    }
}
//erl
