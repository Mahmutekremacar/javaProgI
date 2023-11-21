package L3;

public class L3_Ueb6 {
    public static boolean schaltJahr(int jahr) {
        if(jahr % 4 == 0){
            if ( jahr % 100 != 0 || jahr % 400 == 0){
                System.out.println("Ist Scahltjar");
                return true;
            }
        }
        System.out.println("Ist nicht Scahltjar");
        return false;
    }
    public static void main(String[] args) {
     schaltJahr(2005);
     schaltJahr(2004);
     schaltJahr(1900);
     schaltJahr(2000);
    }
}
// erledigt
