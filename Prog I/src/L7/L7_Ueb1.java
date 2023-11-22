package L7;

public class L7_Ueb1 {

/*
Öncelikle toplamın ilk beş terimini yazın (cevap kağıdınıza)!
Kullanıcıdan x ve değerini isteyerek yönteminizi test edin.
girilir. Daha sonra yöntem çağrılır ve sonuç görüntülenir
standart çıktıda görüntülenir.
Not: Ders notlarındaki kosinüs hesaplamasına benzer şekilde ilerleyin.
Java kütüphanesindeki Math sınıfındaki yöntemleri kullanmak
yasaklı!*/



        static double exponent(double base , double power) {
            double result = 1.0;
            // running loop while the power > 0
            while (power != 0) {
                result = result * base;
                // power will get reduced after
                // each multiplication
                power--;
            }
            return result;
        }
        static double factoriel(double num)
        {
            double result = 1.0;
            while(num != 0)
            {
                result = result * num;
                num--;
            }
            return result;
        }

        static void sinberechnung(int x)
        {
            double total = 0 ;
            int erste_teil = 1;
            for(double i = 0.0 ; i < 5; i++)
            {
                if ( i % 2 == 0) {
                    total = total + ( exponent(x ,((2.0 * i) + 1.0)) / factoriel((2.0 *i) + 1.0));
                }
                else{
                    total = total + (-1 * ( exponent(x ,((2.0 * i) + 1.0)) / factoriel((2.0 *i) + 1.0)));
                }

            }
            System.out.println(total);
        }

    public static void main(String[] args) {
        sinberechnung(30);
        System.out.println(factoriel(3));
    }

}
