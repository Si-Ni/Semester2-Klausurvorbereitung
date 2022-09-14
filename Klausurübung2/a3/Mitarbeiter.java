import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Mitarbeiter implements Serializable {
    private int id;
    private String name;
    private Date geburtstag;
    private Adresse adresse;
    private List<Kontakt> kontakte;
    private transient String passwort;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getGeburtstag() {
        return geburtstag;
    }
    public void setGeburtstag(Date geburtstag) {
        this.geburtstag = geburtstag;
    }
    public Adresse getAdresse() {
        return adresse;
    }
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
    public List<Kontakt> getKontakte() {
        return kontakte;
    }
    public void setKontakte(List<Kontakt> kontakte) {
        this.kontakte = kontakte;
    }
    public String getPasswort() {
        return passwort;
    }
    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
}