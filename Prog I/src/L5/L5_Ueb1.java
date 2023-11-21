package L5;


public class L5_Ueb1 {


    public static void reiheBerechnung(double k, double primwert, double wert) {
        /*while ( (wert - primwert) <= Math.pow(10 , -5)) {
            primwert = wert;
            wert = 6 * (1 / Math.pow(k, 2));
            System.out.println(wert);
            k += 1;
        }*/


        do {
            primwert = wert;
            System.out.println(6 * (1 / (k *k)));
            wert = 6 * (1 / (k *k));
            k += 1;
            System.out.println("k " + k + " ,wert " + wert+ " ,prim " + primwert);

        }while((wert - primwert) > -(Math.pow(10, 5)));

    }
    public static void main(String[] args) {
        //System.out.println(-(Math.pow(10, 5)));
        reiheBerechnung(1,0,1);
    }
}
