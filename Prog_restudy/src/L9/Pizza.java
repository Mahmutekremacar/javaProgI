package L9;


    public class Pizza {
        String name;
        int[] durchmesser;
        float[] preis;

        public Pizza(String name, int[] durchmesser, float[] preis) {
            this.name = name;
            this.durchmesser = durchmesser;
            this.preis = preis;
        }
        public static void main (String [] args)
        {
            Pizza bacon = new Pizza("bacon", new int[]{25, 30, 40},new float []{13.22F, 15.30F, 16.80F});
            bacon.preisLeistung(a.durchmesser);
        }

        public  float preisLeistung(int durchmesser, float preis) {
            return durchmesser / preis;
        }

//    public void Preisleistungverhaltnis(String [] args)


}
