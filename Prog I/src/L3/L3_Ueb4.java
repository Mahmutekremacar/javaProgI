package L3;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class L3_Ueb4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to shoot dice? : y || n");
        String antwort = input.nextLine();
        //System.out.println(antwort);
        int min = 1;
        int max = 6;
        while(Objects.equals(antwort, "y")){
            int wuerfel1 = (int)Math.floor(Math.random()* (max-min+1)+min);
            int wuerfel2 = (int)Math.floor(Math.random()* (max-min+1)+min);
            switch (wuerfel1){
                case 1 :
                    System.out.println("Eins gewuerfelt");
                    break;
                case 2 :
                    System.out.println("Zwei gewuerfelt");
                    break;
                case 3 :
                    System.out.println("Drei gewuerfelt");
                    break;
                case 4 :
                    System.out.println("Vier gewuerfelt");
                    break;
                case 5 :
                    System.out.println("Fuenf gewuerfelt");
                    break;
                case 6 :
                    System.out.println("Sex gewuerfelt");
                    break;
            }
            switch (wuerfel2){
                case 1 :
                    System.out.println("Eins gewuerfelt");
                    break;
                case 2 :
                    System.out.println("Zwei gewuerfelt");
                    break;
                case 3 :
                    System.out.println("Drei gewuerfelt");
                    break;
                case 4 :
                    System.out.println("Vier gewuerfelt");
                    break;
                case 5 :
                    System.out.println("Fuenf gewuerfelt");
                    break;
                case 6 :
                    System.out.println("Sex gewuerfelt");
                    break;
            }

            System.out.println("Do you want to shoot dice? : y || n");
            antwort = input.nextLine();

        }
    }
}
// erledigt
