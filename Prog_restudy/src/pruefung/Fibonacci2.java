package pruefung;

public class Fibonacci2 {

    public static void main(String [] args)
    {
        System.out.println(fib(7));

    }
    public static int fib(int num)
    {
        if (num == 0){
            return 0;
        }else if (num == 1){
            return 1;
        }else
            System.out.println(fib(num-1)+ fib(num-2));
            return fib(num-1)+ fib(num-2);
    }
}
