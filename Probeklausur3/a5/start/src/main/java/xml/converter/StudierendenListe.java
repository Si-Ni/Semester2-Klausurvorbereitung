package xml.converter;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StudierendenListe implements Serializable {
    private List<Studierender> studListe;
    private String seminargruppe;
    private String studiengang;
    
    public StudierendenListe() {
    }

    public StudierendenListe(List<Studierender> studListe, String seminargruppe, String studiengang) {
        this.studListe = studListe;
        this.seminargruppe = seminargruppe;
        this.studiengang = studiengang;
    }

    @XmlElement(name = "Studierender")
    public List<Studierender> getStudListe() {
        return studListe;
    }

    public void setStudListe(List<Studierender> studListe) {
        this.studListe = studListe;
    }

    public String getSeminargruppe() {
        return seminargruppe;
    }

    public void setSeminargruppe(String seminargruppe) {
        this.seminargruppe = seminargruppe;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    
}
