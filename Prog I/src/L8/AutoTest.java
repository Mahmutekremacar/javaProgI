package L8;

public class AutoTest {
    public static void main(String[] args) {
        // Drei Lieblingsautos erstellen
        Auto auto1 = new Auto("Audi", 2.0, "Schwarz");
        Auto auto2 = new Auto("BMW", 2.5, "Blau");
        Auto auto3 = new Auto("Mercedes", 3.0, "Rot");

        // Ermittle das Auto mit dem größten Hubraum
        Auto autoMitGroesstemHubraum = ermittleAutoMitGroesstemHubraum(auto1, auto2, auto3);

        // Gib die Daten des Autos mit dem größten Hubraum aus
        System.out.println("Auto mit dem größten Hubraum:");
        System.out.println("Marke: " + autoMitGroesstemHubraum.getMarke());
        System.out.println("Hubraum: " + autoMitGroesstemHubraum.getHubraum() + "L");
        System.out.println("Farbe: " + autoMitGroesstemHubraum.getFarbe());
    }

    // Methode zur Ermittlung des Autos mit dem größten Hubraum
    private static Auto ermittleAutoMitGroesstemHubraum(Auto... autos) {
        Auto autoMitGroesstemHubraum = autos[0];
        for (Auto auto : autos) {
            if (auto.getHubraum() > autoMitGroesstemHubraum.getHubraum()) {
                autoMitGroesstemHubraum = auto;
            }
        }
        return autoMitGroesstemHubraum;
    }
}
