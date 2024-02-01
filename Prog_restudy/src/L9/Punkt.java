package L9;

public class Punkt {
    int x ;
    int y ;

    public Punkt(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("x= " + x + ", y= "+ y);
    }
    public static void main(String[] args)
    {
        Punkt a = new Punkt(1,2 );
        a.punktVerschieben(5, 6);
    }

    public  void punktVerschieben(int zielX , int zielY)
    {
        x = zielX;
        y = zielY;
        System.out.println("Neu punkt ist: " + "x = " + x + ", y= " + y);
    }
}
