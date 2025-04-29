public class Customer {

    private String name;
    private String adresse;
    private String telefonnummer;
    private int kundenId;


    public Customer(String name, String adresse, String telefonnummer, int kundenId) {
        this.name = name;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
        this.kundenId = kundenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public int getKundenId() {
        return kundenId;
    }

    public void setKundenId(int kundenId) {
        this.kundenId = kundenId;
    }
}
