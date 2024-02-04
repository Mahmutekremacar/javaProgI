package pruefung;

import java.util.Scanner;
public class Kurs {

    private String kursArt;
    private int kursDauer;
    private Mitglied[] mitglieder;
    private int maxmitglied;


    public Mitglied[] getMitglieder() {
        return mitglieder;
    }

    public void setMitglieder(Mitglied[] mitglieder) {
        this.mitglieder = mitglieder;
    }

    public Kurs(String kursArt, Mitglied[] mitglieder, int kursDauer){

        this.kursArt = kursArt;
        this.mitglieder=mitglieder;
        this.kursDauer = kursDauer;
        this.maxmitglied = mitglieder.length;
    }
    public void setKursArt(String kursArt){
        this.kursArt=kursArt;
    }
    public String getKursArt(){
        return kursArt;
    }
    public void setKursDauer(int kursDauer){
        this.kursDauer=kursDauer;
    }
    public int getKursDauer(){
        return kursDauer;
    }
    public void setMaxmitglied(int maxmitglied){
        this.maxmitglied=maxmitglied;
    }
    public int getMaxmitglied(){
        return maxmitglied;
    }
    public void anmeldungsKurs(Mitglied x){
        if(x.isEingetrageneKurs()){

        }
        else{


            if (this.mitglieder[this.maxmitglied-1]!= null) {
                System.out.println("kurs ist schon voll!");
            }
            else{
                for(int i =0;i<this.mitglieder.length;i++){
                    int a = 1;
                    a++;
                    if(this.mitglieder[i]== null){

                        this.mitglieder[i] = new Mitglied(a,true);
                    }
                }}
        }
    }
    public void abmeldungKurs(Mitglied x){
        for(int i = 0; i< this.mitglieder.length; i++){
            if (this.mitglieder[i]== x) {
                this.mitglieder[i]=null;
                x.setEingetrageneKurs(false);
            }
        }
    }
    public static void main(String args[]){
        Mitglied[] bos = new Mitglied[10];
        Scanner scanner = new Scanner(System.in);
        Kurs kurs1 = new Kurs("karete",bos,60);
        Kurs kurs2 = new Kurs("s",bos,60);
        Kurs kurs3 = new Kurs("y",bos,60);

        Mitglied mitglied1 = new Mitglied(1234,false);
        boolean abc = true;
        while(abc){
            System.out.println("gir");
            String str = scanner.nextLine();
            if(str == kurs1.getKursArt()){
                System.out.println(kurs1.getMaxmitglied()+ kurs1.getKursDauer());
                abc = false;
            }
            else if(str == kurs2.getKursArt()){
                System.out.println(kurs2.getMaxmitglied()+ kurs2.getKursDauer());
                abc = false;
            }
            else if(str == kurs3.getKursArt()){
                System.out.println(kurs3.getMaxmitglied()+ kurs3.getKursDauer());
                abc = false;
}

}



    }

}
