package L7;

public class SinusBerechnung {
    public static int unlem( int num, int erg)
    {
        for (int i = 1; i <= (2 * num) + 1 ; i++)
        {
            erg = erg * i;
        }
        return erg;
    }
    public static void sinus(double x, double sum )
    {
        sum = x;
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(i % 2 ==0){
                sum += (Math.pow(x, ((2 * i )+ 1))) /  unlem(i, 1);
            }
            else{
                sum -= (Math.pow(x, ((2 * i )+ 1))) /  unlem(i, 1);
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        sinus(0, 0);

    }
}
