package L6;

public class L6_Ueb5 {

    public static double rekursion(double basis, int exponent) {
        double antwort = 1.0;
        exponent -= 1;

            for(int i = 0; i<= exponent; i++)
            {
                antwort = basis * antwort;
            }
            System.out.println(antwort);
            return antwort;


    }


    public static void main(String[] args) {

        rekursion(-4,1);
        rekursion(-5,2);
        rekursion(6,0);
    }
}

//erl


