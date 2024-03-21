import java.text.DecimalFormat;

public class KugelVolumen {


    public static double berechneKugelvolumen(double radius)
    {

        double newNum = (double) 4 /3*Math.PI*radius*radius*radius;
        System.out.println(Math.ceil(newNum));
        return (double) 4 /3*Math.PI*radius*radius*radius;

    }
    public static void main(String[] args)
    {
        System.out.printf("%,.3f",berechneKugelvolumen(1));
    }
}
