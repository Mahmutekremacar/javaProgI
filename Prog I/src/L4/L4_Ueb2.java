package L4;
public class L4_Ueb2 {
    public static void freiFallend(int time){
        double g = 9.80665;
        System.out.println(time+". sekunde: "+(0.5*g)*(time*time));
    }
    public static void main(String[] args) throws InterruptedException {
        int t = 15;
        int jetzt = 1;
        double g = 9.80665;

        while (jetzt <= t) {
            System.out.println(jetzt);
            freiFallend(jetzt);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        ++jetzt;

        }

    }
}
