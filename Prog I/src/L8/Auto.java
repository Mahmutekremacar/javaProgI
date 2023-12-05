package L8;

public class Auto {

        private String marke;
        private double hubraum;
        private String farbe;
        // Weitere Merkmale hinzufügen, falls erforderlich

        // Konstruktor
        public Auto(String marke, double hubraum, String farbe) {
            this.marke = marke;
            this.hubraum = hubraum;
            this.farbe = farbe;
            // Weitere Merkmale initialisieren, falls erforderlich
        }

        // Getter für Hubraum
        public double getHubraum() {
            return this.hubraum;
        }
        public String getMarke()
        {
            return this.marke;
        }
        public String getFarbe()
        {
            return this.farbe;
        }
        // Weitere Getter und Setter nach Bedarf hinzufügen
    }


