package pruefung;

public class OnlieShop {

    public static void main(String[] args)
    {
        wandleUmInCents("1,99");
        wandleUmInCents("0,99");
        wandleUmInCents("0,09");
    }
    public static int wandleUmInCents(String wert)
    {
        int wertnum = Integer.parseInt(wert.replace(",",""));
        System.out.println(wertnum);
        return wertnum;
    }

}
