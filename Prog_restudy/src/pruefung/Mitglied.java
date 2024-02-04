package pruefung;

public class Mitglied {
    private int mitgliedNummer;
    private boolean eingetrageneKurs;

    public int getMitgliedNummer() {
        return mitgliedNummer;
    }
    public void setMitgliedNummer(int mitgliedNummer){
        this.mitgliedNummer=mitgliedNummer;
    }

    public boolean isEingetrageneKurs() {
        return eingetrageneKurs;
    }

    public void setEingetrageneKurs(boolean eingetrageneKurs) {
        this.eingetrageneKurs = eingetrageneKurs;
    }

    public Mitglied(int mitgliednummer, boolean eingetrageneKurs){
        this.mitgliedNummer=mitgliednummer;
        this.eingetrageneKurs=eingetrageneKurs;
    }}
