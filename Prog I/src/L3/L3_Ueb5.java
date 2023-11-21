package L3;
import java.util.Scanner;

public class L3_Ueb5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Matrikelnummer eingeben: ");
        int matrikel_nummer = input.nextInt();
        int matrikellnummerg = matrikel_nummer;
        for (int i = 0; i < 5; ++i) {
            matrikel_nummer = matrikel_nummer / 10;
            //System.out.println(matrikel_nummer);
        }
        if (matrikel_nummer > 100) {
            System.out.println("Falche Eingebe");

        } else if (matrikel_nummer == 50) {
            System.out.println("Wilkommen "+matrikellnummerg);

        } else if (matrikel_nummer == 51) {
            System.out.println("Wilkommen "+matrikellnummerg);

        } else if (matrikel_nummer == 61) {
            System.out.println("Wilkommen "+matrikellnummerg);

        } else{
            System.out.println("Falche Eingebe");
        }
    }
}
// erledigt