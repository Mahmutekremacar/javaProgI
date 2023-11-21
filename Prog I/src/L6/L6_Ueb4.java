package L6;
import java.util.Scanner;
import java.util.ArrayList;
public class L6_Ueb4 {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
        String isOn = "yes";
        String istPrim = "";
        while (isOn == "yes") {
            Scanner zahl = new Scanner(System.in);
            System.out.println("Enter number: ");
            int userZahl = zahl.nextInt();
            int i = 2;
            boolean flag = false;
            if (userZahl != 1) {
                while (i <= userZahl / 2) {
                    if (userZahl % i == 0) {
                        flag = true;
                        break;
                    }
                    ++i;
                }
                if (flag) {
                    System.out.println("Nicht Primzahl");
                    istPrim = "false";
                } else {
                    System.out.println("Ist Primzahl");
                    istPrim = "true";
                    //Scanner move = new Scanner(System.in);
                    //System.out.println("Do you want to continue?");
                    //isOn = move.nextLine();}
                }
            } else {
                istPrim = "true";
                System.out.println("Ist Primzahl");
            }
            String userZahl_String = Integer.toString(userZahl);
            nums.add(userZahl_String);
            nums.add(istPrim);
            System.out.println("Used Numbers:" + nums );
        }
    }
}


//erl
