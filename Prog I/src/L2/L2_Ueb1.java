package L2;

public class L2_Ueb1 {
    public static void kreisFlaeche(int r, double pi){
        System.out.println("r ist: "+r+" Kreis Flaeche ist: "+pi * r * r);
    }
    public static void kreisUmfang(int r, double pi){
        System.out.println("r ist: "+r+" Kreis Umfang ist: "+2*pi*r);
    }
    public static void kugelBerechnung(int r, double pi){
        System.out.println("r ist: "+r+"Kugel Volume ist: "+(double) 4 /3*pi*r*r*r);
    }
    public static void main(String[] args) {
        int r = 4;
        double pi = 3.14159;
        kreisFlaeche(r, pi);
        kreisUmfang(r, pi);
        kugelBerechnung(r,pi);

    }

}
