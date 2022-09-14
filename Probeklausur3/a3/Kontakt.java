public class Kontakt {
    private String name;
    private String strasse;
    private String ort;

    public int i = 0; //Laufkriterium

    public Kontakt(String name, String strasse, String ort) {
        this.name = name;
        this.strasse = strasse;
        this.ort = ort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + ", Strasse: " + this.strasse + ", Ort: " + this.ort);
    }
}