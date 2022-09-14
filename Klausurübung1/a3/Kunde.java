public class Kunde implements Cloneable{
    private String name;
    private String adresse;

    public Kunde() {

    }

    public Kunde(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public Kunde(Kunde kunde) {
        this.name = kunde.name;
        this.adresse = kunde.adresse;
    }

    public Kunde clone() throws CloneNotSupportedException {
        return (Kunde) super.clone();
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
