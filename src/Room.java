public class Room {


    private int zimmernummer;
    private String zimmerkategorie;
    private double preis;
    private boolean belegung;



    public Room(int zimmernummer, String zimmerkategorie, double preis, String belegung) {
        this.zimmernummer = zimmernummer;
        this.zimmerkategorie = zimmerkategorie;
        this.preis = preis;
        this.belegung = false;
    }

    public int getZimmernummer() {
        return zimmernummer;
    }

    public void setZimmernummer(int zimmernummer) {
        this.zimmernummer = zimmernummer;
    }

    public String getZimmerkategorie() {
        return zimmerkategorie;
    }

    public void setZimmerkategorie(String zimmerkategorie) {
        this.zimmerkategorie = zimmerkategorie;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public boolean getBelegung() {
        return belegung;
    }

    public boolean setBelegung(boolean belegung) {
        return belegung;
    }


}
