package L6;

public class L6_Ueb6 {



        public static void main(String[] args) {
            int ergebnis = springeInMehrerenSpruengen(4, 1, 2);
            System.out.println(ergebnis);
        }

        public static int springeInMehrerenSpruengen(int distanz, int sprungweite1, int sprungweite2) {
            if (distanz < 0 || sprungweite1 <= 0 || sprungweite2 <= 0) {
                return 0;
            }

            // Erstelle ein Array, um die Anzahl der Möglichkeiten für jede Distanz zu speichern
            int[] moeglichkeiten = new int[distanz + 1];

            // Es gibt eine Möglichkeit, die Distanz 0 zu erreichen (kein Sprung)
            moeglichkeiten[0] = 1;

            if( ((distanz - sprungweite1) >= sprungweite2) || ((distanz - sprungweite1) >= sprungweite1) )
            {
                
            }

            // Die Anzahl der Möglichkeiten für die gegebene Distanz befindet sich am Ende des Arrays
            return moeglichkeiten[distanz];
        }
    }


