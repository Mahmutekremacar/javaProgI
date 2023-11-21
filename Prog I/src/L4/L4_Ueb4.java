package L4;

public class L4_Ueb4 {
    public static void temperaturtabelle(double temparaturF){

    }
    public static void main(String[] args){
        int temparaturF = 0;
        while(temparaturF <= 300) {
            System.out.println(temparaturF +" - "+(double) 5 / 9 * (temparaturF - 32));
            ++temparaturF;
        }

    }
}
