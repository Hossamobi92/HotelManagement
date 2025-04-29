public class Booking {

     private int buchungsId;
     private  String kunde;
     private String Buchungsdatum;
     private String checkIn;
     private String checkOut;


    public Booking(int buchungsId, String kunde, String buchungsdatum, String checkIn, String checkOut) {
        this.buchungsId = buchungsId;
        this.kunde = kunde;
        Buchungsdatum = buchungsdatum;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getBuchungsId() {
        return buchungsId;
    }

    public void setBuchungsId(int buchungsId) {
        this.buchungsId = buchungsId;
    }

    public String getKunde() {
        return kunde;
    }

    public void setKunde(String kunde) {
        this.kunde = kunde;
    }

    public String getBuchungsdatum() {
        return Buchungsdatum;
    }

    public void setBuchungsdatum(String buchungsdatum) {
        Buchungsdatum = buchungsdatum;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }
}
