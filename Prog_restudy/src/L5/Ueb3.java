package L5;

public class Ueb3 {
    public static void main(String[] args)
    {
        int[] gewuerfelteSeiten = new int[6];
        for (int i = 0; i < 10000 ; i++)
        {
            int wurf = (int)(Math.random() * 6 + 1);
            switch(wurf){
                case 1 -> gewuerfelteSeiten[0]++;
                case 2 -> gewuerfelteSeiten[1]++;
                case 3 -> gewuerfelteSeiten[2]++;
                case 4 -> gewuerfelteSeiten[3]++;
                case 5 -> gewuerfelteSeiten[4]++;
                case 6 -> gewuerfelteSeiten[5]++;
            }
        }
        for(int i =0; i < gewuerfelteSeiten.length ; i++)
        {
            System.out.println(i + 1 + "er: " + gewuerfelteSeiten[i]);
        }
    }
}
