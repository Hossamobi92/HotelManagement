public class Room {


    private int zimmernummer;
    private String zimmerkategorie;
    private double preis;
    private String belegung;



    public Room(int zimmernummer, String zimmerkategorie, double preis, String belegung) {
        this.zimmernummer = zimmernummer;
        this.zimmerkategorie = zimmerkategorie;
        this.preis = preis;
        this.belegung = belegung;
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

    public String getBelegung() {
        return belegung;
    }

    public void setBelegung(String belegung) {
        this.belegung = belegung;
    }


}
