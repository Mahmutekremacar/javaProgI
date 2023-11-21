package L4;
import java.util.Scanner;
import java.util.ArrayList;
public class L4_Ueb3_a {
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
                    istPrim = "-";
                } else {
                    System.out.println("Ist Primzahl");
                    istPrim = "+";
                    //Scanner move = new Scanner(System.in);
                    //System.out.println("Do you want to continue?");
                    //isOn = move.nextLine();}
                }
            } else {
                istPrim = "+";
                System.out.println("Ist Primzahl");
            }
            String userZahl_String = Integer.toString(userZahl);
            nums.add(userZahl_String);
            nums.add(istPrim);
            System.out.println("Used Numbers:" + nums );
        }
    }
}


