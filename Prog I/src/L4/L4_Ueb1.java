package L4;

public class L4_Ueb1 {
    public static void Countdown () throws InterruptedException {
        int anfangSekunden = 15;
        while(anfangSekunden >=0){
            System.out.println(anfangSekunden);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            --anfangSekunden;
        }

    }
    public static void main (String[] args) throws InterruptedException {
        Countdown();

    }
}
//erledigt