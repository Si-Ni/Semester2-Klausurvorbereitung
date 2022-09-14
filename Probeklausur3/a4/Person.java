import java.io.Serializable;

public class Person implements Serializable{
    private String vorname;
    private String nachname;
    private String wohnort;

    private static final long serialVersoinUID = 1337L;

    public Person(String vorname, String nachname, String wohnort) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.wohnort = wohnort;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }
}