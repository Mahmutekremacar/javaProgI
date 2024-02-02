package L8;

public class Auto {

        String marke;
        String farbe;
        float hubraum;

        public Auto(String marke, String farbe, float hubraum) {
            setMarke(marke);
            setFarbe(farbe);
            setHubraum(hubraum);
            printE();
        }

        public static void main (String [] args)
        {
            Auto bmw = new Auto("bmw", "gruen", -123);
            Auto audi = new Auto ("audi", "rot", 3000);
        }

        public void printE()
        {
            System.out.println(getMarke()+" "+ getFarbe() + " "  + getHubraum());
        }

    public float setHubraum(float hubraum) {
        if(hubraum > 0)
        {
            hubraum = hubraum;
        }
        else{
            hubraum =  1600f;
        }
        return this.hubraum = hubraum;
    }
    public float getHubraum(){
            return hubraum;
    }

    public void setMarke(String marke){
            this.marke = marke;
    }
    public String getMarke(){
            return this.marke;
    }

    public void setFarbe(String farbe)
    {
        this.farbe = farbe;
    }
    public String getFarbe()
    {
        return this.farbe = farbe;
    }
}
