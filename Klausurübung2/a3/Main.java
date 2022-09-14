import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter();
        m1.setId(1);
        m1.setName("Nils");
        Date date1 = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        m1.setGeburtstag(date1);
        Adresse a1 = new Adresse();
        a1.setOrt("Leipzig");
        a1.setPlz("04319");
        a1.setStrasze("Musterweg");
        m1.setAdresse(a1);
        List<Kontakt> l1 = new ArrayList<Kontakt>();
        Mail mail1 = new Mail();
        mail1.setMailAdresse("mailAdresse1@gmail.com");
        l1.add(mail1);
        Telefon t1 = new Telefon();
        t1.setTelefonNummer("015739272891");
        l1.add(t1);
        m1.setKontakte(l1);
        m1.setPasswort("12345678");

        Mitarbeiter m2 = new Mitarbeiter();
        m2.setId(2);
        m2.setName("Luca");
        Date date2 = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        m2.setGeburtstag(date2);
        Adresse a2 = new Adresse();
        a2.setOrt("Dresden");
        a2.setPlz("02135");
        a2.setStrasze("Quallenstrasse");
        m2.setAdresse(a2);
        List<Kontakt> l2 = new ArrayList<Kontakt>();
        Mail mail2 = new Mail();
        mail2.setMailAdresse("mailAdresse2@gmx.com");
        l2.add(mail2);
        Telefon t2 = new Telefon();
        t2.setTelefonNummer("01579278378932");
        l2.add(t2);
        m2.setKontakte(l2);
        m2.setPasswort("87654321");

        try {
            FileOutputStream fos = new FileOutputStream("test.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            ArrayList<Mitarbeiter> woi = new ArrayList<>();
            woi.add(m1);
            woi.add(m2);
            oos.writeObject(woi);
            oos.close();
            FileOutputStream fos2 = new FileOutputStream("test.xml");
            BufferedOutputStream bos2 = new BufferedOutputStream(fos2);
            XMLEncoder xml = new XMLEncoder(bos2);
            xml.writeObject(woi);
            xml.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
