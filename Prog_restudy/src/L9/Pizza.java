package L9;


    public class Pizza {
        String name;
        int[] durchmesser;
        float[] preis;

        public Pizza(String name, int[] durchmesser, float[] preis) {
            setDurchmesser(durchmesser);
            setName(name);
            setPreis(preis);
        }
        public static void main (String [] args)
        {
            Pizza bacon = new Pizza("bacon", new int[]{15, 25, 30},new float[]{5,10,15});

            Komparator(bacon);

        }
        public void setName( String name){
            this.name = name;
        }
        public void setDurchmesser(int[] durchmesser){
            this.durchmesser = durchmesser;
        }
        public void setPreis(float[] preis){
            this.preis = preis;
        }

        public String getName(){
            return this.name;
        }
        public int[] getDurchmesser(){
            return this.durchmesser;
        }
        public float[] getPreis(){
            return this.preis;
        }
        public static void Komparator(Pizza piz ){
            int times = piz.durchmesser.length;
            int erg = 0;
            for(int i = 0; i < times; i ++)
            {
                if(i < times -1 && (piz.durchmesser[i]/piz.preis[i]) > (piz.durchmesser[i+1]/piz.preis[i + 1]))
                {
                    erg = i;
                } else if (i < times -1 && (piz.durchmesser[i]/piz.preis[i]) < (piz.durchmesser[i+1]/piz.preis[i + 1])) {
                    erg = i+1;
                } else if ( (piz.durchmesser[i]/piz.preis[i]) > (piz.durchmesser[times -1 ]/piz.preis[times - 1 ])) {
                    erg = i;
                }else{
                    erg = times -1;
                }
            }
            System.out.println(piz.durchmesser[erg] + ", " + piz.preis[erg]);
        }
}
