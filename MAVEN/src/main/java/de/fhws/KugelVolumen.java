package de.fhws;

public class KugelVolumen {
    public static double berechneKugelvolumen(double radius)
    {
        return (double)4/3*Math.PI*radius*radius*radius;
    }
    public static void main(String[ ] args )
    {
        berechneKugelvolumen(0);

    }
}
