package pruefung;

public class Fibonacci2020ws {


    public static void main (String[] args)
    {
        System.out.println(fibonacci(7));
    }
    public static int fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            System.out.println(fibonacci(n - 1) + fibonacci(n - 2));
            return fibonacci(n - 1) + fibonacci(n - 2);
    }


}

