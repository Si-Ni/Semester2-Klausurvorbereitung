package xml.converter;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Studierender")
public class Studierender implements Serializable {
    private String name;
    private String jahrgang;
    private String nummer;
    
    public Studierender() {
    }

    public Studierender(String name, String jahrgang, String nummer) {
        this.name = name;
        this.jahrgang = jahrgang;
        this.nummer = nummer;
    }

    @XmlElement(name = "nachname")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(String jahrgang) {
        this.jahrgang = jahrgang;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    
}