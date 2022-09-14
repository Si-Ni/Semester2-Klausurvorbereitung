package xml.converter;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Hello world!
 */
public final class Start {
    private Start() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        ArrayList<Studierender> StudentenListe = new ArrayList<Studierender>();

        Studierender s1 = new Studierender("Simon Nikolaidis", "2002", "5002152");
        Studierender s2 = new Studierender("Manuel Martens", "2003", "5002310");
        Studierender s3 = new Studierender("Jamila Baardsen", "2000", "5003941");

        StudentenListe.add(s1);
        StudentenListe.add(s2);
        StudentenListe.add(s3);

        StudierendenListe sLi = new StudierendenListe(StudentenListe, "CS21-2", "Informatik");

        converttoxml(sLi);
    }

    public static void converttoxml(StudierendenListe sLi) {
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(StudierendenListe.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            File datei = new File("StudierendenListe.xml");
            jaxbMarshaller.marshal(sLi, datei);

        } catch (JAXBException  e) {
            e.printStackTrace();
        }
    }
}
